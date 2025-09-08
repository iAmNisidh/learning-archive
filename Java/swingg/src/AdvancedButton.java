import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import javax.sound.sampled.*;
import java.io.*;

/**
 * AdvancedButton - A sophisticated custom button implementation for Java Swing
 * with multiple visual effects, animations, sound effects, and customization options.
 */
public class AdvancedButton extends JComponent {
    
    // Button state variables
    private boolean hovered = false;
    private boolean pressed = false;
    private float animationProgress = 0.0f;
    private long lastFrameTime = 0;
    private Timer animationTimer;
    
    // Button properties
    private String text;
    private Color primaryColor;
    private Color secondaryColor;
    private Color textColor;
    private int cornerRadius = 10;
    private Font buttonFont;
    private int shadowSize = 5;
    private float shadowOpacity = 0.3f;
    private Icon icon;
    private int iconTextGap = 8;
    private ButtonStyle style = ButtonStyle.GRADIENT;
    
    // Sound effect properties
    private boolean soundEnabled = true;
    private String clickSoundPath = "D:\\language\\Java\\swing\\keyboard-click-327728.mp3";  // Default path, can be customized
    private Clip clickSound;
    private float soundVolume = 1.0f;  // 0.0f to 1.0f
    
    // Animation properties
    private static final float ANIMATION_SPEED = 0.25f; // seconds for full transition
    
    // Button style enum
    public enum ButtonStyle {
        FLAT, GRADIENT, GLOSSY
    }
    
    /**
     * Creates a new AdvancedButton with default styling
     * 
     * @param text The button text
     */
    public AdvancedButton(String text) {
        this(text, new Color(41, 128, 185), new Color(52, 152, 219), Color.WHITE);
    }
    
    /**
     * Creates a new AdvancedButton with custom colors
     * 
     * @param text The button text
     * @param primaryColor The main button color
     * @param secondaryColor The secondary color (for gradients and effects)
     * @param textColor The text color
     */
    public AdvancedButton(String text, Color primaryColor, Color secondaryColor, Color textColor) {
        this.text = text;
        this.primaryColor = primaryColor;
        this.secondaryColor = secondaryColor;
        this.textColor = textColor;
        this.buttonFont = new Font("Segoe UI", Font.BOLD, 14);
        
        // Set preferred size
        setPreferredSize(new Dimension(180, 50));
        
        // Make component focusable and accessible
        setFocusable(true);
        
        // Load sound effects
        try {
            loadClickSound();
        } catch (Exception e) {
            System.err.println("Warning: Could not load click sound: " + e.getMessage());
            soundEnabled = false;
        }
        
        // Set up the animation timer
        animationTimer = new Timer(16, e -> {
            long currentTime = System.currentTimeMillis();
            if (lastFrameTime == 0) {
                lastFrameTime = currentTime;
                return;
            }
            
            float deltaTime = (currentTime - lastFrameTime) / 1000.0f;
            lastFrameTime = currentTime;
            
            float targetValue = (hovered || pressed) ? 1.0f : 0.0f;
            float delta = (targetValue - animationProgress) / (ANIMATION_SPEED / deltaTime);
            
            animationProgress += delta;
            animationProgress = Math.max(0.0f, Math.min(1.0f, animationProgress));
            
            repaint();
            
            if ((targetValue == 0 && animationProgress <= 0) || 
                (targetValue == 1 && animationProgress >= 1)) {
                ((Timer)e.getSource()).stop();
                lastFrameTime = 0;
            }
        });
        
        // Add mouse listeners for interaction
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if (!hovered) {
                    hovered = true;
                    startAnimation();
                }
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                if (hovered) {
                    hovered = false;
                    startAnimation();
                }
                if (pressed) {
                    pressed = false;
                }
            }
            
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {
                    pressed = true;
                    repaint();
                }
            }
            
            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {
                    boolean wasPressed = pressed;
                    pressed = false;
                    repaint();
                    
                    // Fire action event if released inside button
                    if (wasPressed && contains(e.getPoint())) {
                        playClickSound();
                        fireActionPerformed();
                    }
                }
            }
        });
        
        // Add key listener for accessibility
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_SPACE || e.getKeyCode() == KeyEvent.VK_ENTER) {
                    if (!pressed) {
                        pressed = true;
                        repaint();
                    }
                }
            }
            
            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_SPACE || e.getKeyCode() == KeyEvent.VK_ENTER) {
                    if (pressed) {
                        pressed = false;
                        repaint();
                        playClickSound();
                        fireActionPerformed();
                    }
                }
            }
        });
    }
    
    /**
     * Loads the click sound effect
     */
    private void loadClickSound() throws Exception {
        try {
            // First try loading from file system
            File soundFile = new File(clickSoundPath);
            if (soundFile.exists()) {
                clickSound = loadSoundClip(AudioSystem.getAudioInputStream(soundFile));
                return;
            }
            
            // If file doesn't exist, try loading from resources
            InputStream resourceStream = getClass().getResourceAsStream(clickSoundPath);
            if (resourceStream != null) {
                clickSound = loadSoundClip(AudioSystem.getAudioInputStream(resourceStream));
                return;
            }
            
            // If no custom sound is found, use a default click sound
            clickSound = createDefaultClickSound();
            
        } catch (Exception e) {
            // Create a default click sound if loading fails
            clickSound = createDefaultClickSound();
        }
    }
    
    /**
     * Creates a default click sound programmatically
     */
    private Clip createDefaultClickSound() throws Exception {
        // Create a short click sound using PCM data
        AudioFormat format = new AudioFormat(44100, 16, 1, true, false);
        
        // Generate a simple click sound (~100ms)
        byte[] data = new byte[4410]; // 100ms at 44.1kHz
        
        // Create a simple click waveform
        for (int i = 0; i < data.length; i++) {
            double t = i / 44100.0;
            // Exponential decay with high frequency
            double amplitude = 32767.0 * Math.exp(-t * 50) * Math.sin(2 * Math.PI * 1000 * t);
            data[i] = (byte) amplitude;
        }
        
        AudioInputStream ais = new AudioInputStream(
            new ByteArrayInputStream(data),
            format,
            data.length
        );
        
        return loadSoundClip(ais);
    }
    
    /**
     * Loads an audio input stream into a Clip
     */
    private Clip loadSoundClip(AudioInputStream audioStream) throws Exception {
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        
        // Set default volume
        setClipVolume(clip, soundVolume);
        
        return clip;
    }
    
    /**
     * Sets the volume of a clip
     */
    private void setClipVolume(Clip clip, float volume) {
        if (clip.isControlSupported(FloatControl.Type.MASTER_GAIN)) {
            FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            float dB = (volume <= 0.0f) ? -80.0f : (float) (20.0 * Math.log10(volume));
            dB = Math.max(gainControl.getMinimum(), Math.min(gainControl.getMaximum(), dB));
            gainControl.setValue(dB);
        }
    }
    
    /**
     * Plays the click sound effect
     */
    private void playClickSound() {
        if (soundEnabled && clickSound != null) {
            // Stop and rewind the clip if it's already playing
            if (clickSound.isRunning()) {
                clickSound.stop();
            }
            clickSound.setFramePosition(0);
            clickSound.start();
        }
    }
    
    /**
     * Starts the hover animation
     */
    private void startAnimation() {
        lastFrameTime = System.currentTimeMillis();
        if (!animationTimer.isRunning()) {
            animationTimer.start();
        }
    }
    
    /**
     * Add an ActionListener to the button
     * 
     * @param listener The ActionListener to add
     */
    public void addActionListener(ActionListener listener) {
        listenerList.add(ActionListener.class, listener);
    }
    
    /**
     * Remove an ActionListener from the button
     * 
     * @param listener The ActionListener to remove
     */
    public void removeActionListener(ActionListener listener) {
        listenerList.remove(ActionListener.class, listener);
    }
    
    /**
     * Fire an action event to all registered listeners
     */
    protected void fireActionPerformed() {
        ActionEvent event = new ActionEvent(this, ActionEvent.ACTION_PERFORMED, text);
        for (ActionListener listener : listenerList.getListeners(ActionListener.class)) {
            listener.actionPerformed(event);
        }
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);
        
        int width = getWidth();
        int height = getHeight();
        
        // Draw button shadow if not pressed
        if (!pressed && shadowSize > 0) {
            drawShadow(g2, width, height);
        }
        
        // Modify button position if pressed
        int yOffset = pressed ? 2 : 0;
        int buttonTop = yOffset;
        
        // Draw button background based on selected style
        switch (style) {
            case FLAT:
                drawFlatButton(g2, buttonTop, width, height);
                break;
            case GRADIENT:
                drawGradientButton(g2, buttonTop, width, height);
                break;
            case GLOSSY:
                drawGlossyButton(g2, buttonTop, width, height);
                break;
        }
        
        // Draw content
        drawContent(g2, buttonTop, width, height);
        
        g2.dispose();
    }
    
    /**
     * Draws the button shadow
     */
    private void drawShadow(Graphics2D g2, int width, int height) {
        int shadowAlpha = (int) (255 * shadowOpacity * (1.0f - (pressed ? 1.0f : 0.0f)));
        
        // Create shadow gradient paint
        Paint oldPaint = g2.getPaint();
        Color shadowColor = new Color(0, 0, 0, shadowAlpha);
        Color transparentColor = new Color(0, 0, 0, 0);
        
        // Draw the shadow as a radial gradient
        int shadowX = width / 2;
        int shadowY = height / 2 + 2; // Offset shadow slightly downward
        int shadowRadius = Math.max(width, height) / 2 + shadowSize;
        
        RadialGradientPaint shadowPaint = new RadialGradientPaint(
            shadowX, shadowY, shadowRadius,
            new float[] { 0.0f, 0.8f, 1.0f },
            new Color[] { 
                new Color(0, 0, 0, shadowAlpha / 2),
                new Color(0, 0, 0, shadowAlpha / 4),
                transparentColor
            }
        );
        
        g2.setPaint(shadowPaint);
        g2.fillRoundRect(
            -shadowSize,
            -shadowSize + 2, // Offset shadow down slightly
            width + shadowSize * 2,
            height + shadowSize * 2,
            cornerRadius + shadowSize, 
            cornerRadius + shadowSize
        );
        
        g2.setPaint(oldPaint);
    }
    
    /**
     * Draws a flat style button
     */
    private void drawFlatButton(Graphics2D g2, int yOffset, int width, int height) {
        // Calculate interpolated color based on hover and press state
        Color baseColor = interpolateColor(
            primaryColor, 
            secondaryColor, 
            animationProgress * (pressed ? 1.5f : 1.0f)
        );
        
        g2.setColor(baseColor);
        g2.fill(createButtonShape(0, yOffset, width, height - yOffset));
        
        // Draw a subtle border
        g2.setColor(new Color(
            Math.max(0, baseColor.getRed() - 30),
            Math.max(0, baseColor.getGreen() - 30),
            Math.max(0, baseColor.getBlue() - 30),
            100
        ));
        g2.draw(createButtonShape(0, yOffset, width - 1, height - yOffset - 1));
    }
    
    /**
     * Draws a gradient style button
     */
    private void drawGradientButton(Graphics2D g2, int yOffset, int width, int height) {
        // Calculate interpolated colors based on hover and press state
        Color topColor = interpolateColor(
            primaryColor, 
            secondaryColor, 
            animationProgress * (pressed ? 1.5f : 1.0f)
        );
        
        Color bottomColor = interpolateColor(
            new Color(
                Math.max(0, primaryColor.getRed() - 40),
                Math.max(0, primaryColor.getGreen() - 40),
                Math.max(0, primaryColor.getBlue() - 40)
            ),
            new Color(
                Math.max(0, secondaryColor.getRed() - 40),
                Math.max(0, secondaryColor.getGreen() - 40),
                Math.max(0, secondaryColor.getBlue() - 40)
            ),
            animationProgress * (pressed ? 1.5f : 1.0f)
        );
        
        // Swap colors if pressed
        if (pressed) {
            Color temp = topColor;
            topColor = bottomColor;
            bottomColor = temp;
        }
        
        // Create the gradient paint
        GradientPaint gradient = new GradientPaint(
            0, yOffset, topColor,
            0, height, bottomColor
        );
        
        // Draw the button background
        Shape buttonShape = createButtonShape(0, yOffset, width, height - yOffset);
        g2.setPaint(gradient);
        g2.fill(buttonShape);
        
        // Draw inner highlight (top)
        if (!pressed) {
            GradientPaint highlightGradient = new GradientPaint(
                0, yOffset, new Color(255, 255, 255, 100),
                0, height / 3, new Color(255, 255, 255, 0)
            );
            g2.setPaint(highlightGradient);
            g2.fill(buttonShape);
        }
        
        // Draw border
        g2.setColor(new Color(
            Math.max(0, bottomColor.getRed() - 40),
            Math.max(0, bottomColor.getGreen() - 40),
            Math.max(0, bottomColor.getBlue() - 40),
            150
        ));
        g2.draw(createButtonShape(0, yOffset, width - 1, height - yOffset - 1));
    }
    
    /**
     * Draws a glossy style button
     */
    private void drawGlossyButton(Graphics2D g2, int yOffset, int width, int height) {
        // Draw the base gradient similar to gradient button
        drawGradientButton(g2, yOffset, width, height);
        
        // Add glossy reflection effect on top half
        if (!pressed) {
            Shape clipShape = createButtonShape(0, yOffset, width, (height - yOffset) / 2);
            g2.setClip(clipShape);
            
            // Draw the glossy overlay with gradient
            GradientPaint glossGradient = new GradientPaint(
                0, yOffset, new Color(255, 255, 255, 180 - (int)(60 * animationProgress)),
                0, (height - yOffset) / 2, new Color(255, 255, 255, 0)
            );
            g2.setPaint(glossGradient);
            g2.fillRect(0, yOffset, width, (height - yOffset) / 2);
            
            // Reset clip
            g2.setClip(null);
        }
    }
    
    /**
     * Draws the button content (text and/or icon)
     */
    private void drawContent(Graphics2D g2, int yOffset, int width, int height) {
        g2.setFont(buttonFont);
        FontMetrics fm = g2.getFontMetrics();
        
        int textWidth = fm.stringWidth(text);
        int textHeight = fm.getHeight();
        int textAscent = fm.getAscent();
        
        int iconWidth = (icon != null) ? icon.getIconWidth() : 0;
        int iconHeight = (icon != null) ? icon.getIconHeight() : 0;
        int iconTextTotalWidth = iconWidth + (icon != null && text != null ? iconTextGap : 0) + textWidth;
        
        int x = (width - iconTextTotalWidth) / 2;
        int y = yOffset + (height - yOffset - Math.max(textHeight, iconHeight)) / 2;
        
        // Draw the icon if available
        if (icon != null) {
            int iconY = yOffset + (height - yOffset - iconHeight) / 2;
            icon.paintIcon(this, g2, x, iconY);
            x += iconWidth + iconTextGap;
        }
        
        // Draw text with subtle shadow for legibility
        if (text != null && !text.isEmpty()) {
            // Draw text shadow for contrast
            g2.setColor(new Color(0, 0, 0, 50));
            g2.drawString(text, x + 1, y + textAscent + 1);
            
            // Draw the actual text
            g2.setColor(textColor);
            g2.drawString(text, x, y + textAscent);
        }
    }
    
    /**
     * Creates the button shape based on current settings
     */
    private Shape createButtonShape(int x, int y, int width, int height) {
        return new RoundRectangle2D.Float(x, y, width, height, cornerRadius, cornerRadius);
    }
    
    /**
     * Interpolates between two colors based on a progress value (0.0 to 1.0)
     */
    private Color interpolateColor(Color c1, Color c2, float progress) {
        float clampedProgress = Math.max(0, Math.min(1, progress));
        
        return new Color(
            (int) (c1.getRed() + (c2.getRed() - c1.getRed()) * clampedProgress),
            (int) (c1.getGreen() + (c2.getGreen() - c1.getGreen()) * clampedProgress),
            (int) (c1.getBlue() + (c2.getBlue() - c1.getBlue()) * clampedProgress)
        );
    }
    
    // Getters and setters for customization
    
    public void setText(String text) {
        this.text = text;
        repaint();
    }
    
    public String getText() {
        return text;
    }
    
    public void setIcon(Icon icon) {
        this.icon = icon;
        repaint();
    }
    
    public Icon getIcon() {
        return icon;
    }
    
    public void setPrimaryColor(Color color) {
        this.primaryColor = color;
        repaint();
    }
    
    public Color getPrimaryColor() {
        return primaryColor;
    }
    
    public void setSecondaryColor(Color color) {
        this.secondaryColor = color;
        repaint();
    }
    
    public Color getSecondaryColor() {
        return secondaryColor;
    }
    
    public void setTextColor(Color color) {
        this.textColor = color;
        repaint();
    }
    
    public Color getTextColor() {
        return textColor;
    }
    
    public void setCornerRadius(int radius) {
        this.cornerRadius = radius;
        repaint();
    }
    
    public int getCornerRadius() {
        return cornerRadius;
    }
    
    public void setButtonStyle(ButtonStyle style) {
        this.style = style;
        repaint();
    }
    
    public ButtonStyle getButtonStyle() {
        return style;
    }
    
    public void setShadowSize(int size) {
        this.shadowSize = size;
        repaint();
    }
    
    public int getShadowSize() {
        return shadowSize;
    }
    
    public void setShadowOpacity(float opacity) {
        this.shadowOpacity = Math.max(0.0f, Math.min(1.0f, opacity));
        repaint();
    }
    
    public float getShadowOpacity() {
        return shadowOpacity;
    }
    
    public void setButtonFont(Font font) {
        this.buttonFont = font;
        repaint();
    }
    
    public Font getButtonFont() {
        return buttonFont;
    }
    
    /**
     * Set whether sound effects are enabled
     */
    public void setSoundEnabled(boolean enabled) {
        this.soundEnabled = enabled;
    }
    
    /**
     * Get whether sound effects are enabled
     */
    public boolean isSoundEnabled() {
        return soundEnabled;
    }
    
    /**
     * Set the path to the click sound file
     * This can be a file path or a resource path
     */
    public void setClickSoundPath(String path) {
        this.clickSoundPath = path;
        try {
            loadClickSound();
        } catch (Exception e) {
            System.err.println("Warning: Could not load click sound: " + e.getMessage());
            soundEnabled = false;
        }
    }
    
    /**
     * Set the volume for the click sound (0.0f to 1.0f)
     */
    public void setSoundVolume(float volume) {
        this.soundVolume = Math.max(0.0f, Math.min(1.0f, volume));
        if (clickSound != null) {
            setClipVolume(clickSound, soundVolume);
        }
    }
    
    /**
     * Get the current sound volume
     */
    public float getSoundVolume() {
        return soundVolume;
    }
    
    // Test application to demonstrate the advanced button
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Advanced Button with Sound Demo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 400);
            
            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(2, 3, 20, 20));
            panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
            panel.setBackground(new Color(245, 245, 245));
            
            // Demo buttons with different styles and colors
            AdvancedButton flatButton = new AdvancedButton("Flat Button");
            flatButton.setButtonStyle(ButtonStyle.FLAT);
            flatButton.setPrimaryColor(new Color(52, 152, 219));
            flatButton.setSecondaryColor(new Color(41, 128, 185));
            flatButton.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Flat Button Clicked!"));
            
            AdvancedButton gradientButton = new AdvancedButton("Gradient Button");
            gradientButton.setButtonStyle(ButtonStyle.GRADIENT);
            gradientButton.setPrimaryColor(new Color(46, 204, 113));
            gradientButton.setSecondaryColor(new Color(39, 174, 96));
            gradientButton.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Gradient Button Clicked!"));
            
            AdvancedButton glossyButton = new AdvancedButton("Glossy Button");
            glossyButton.setButtonStyle(ButtonStyle.GLOSSY);
            glossyButton.setPrimaryColor(new Color(155, 89, 182));
            glossyButton.setSecondaryColor(new Color(142, 68, 173));
            glossyButton.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Glossy Button Clicked!"));
            
            AdvancedButton roundButton = new AdvancedButton("Round Button");
            roundButton.setButtonStyle(ButtonStyle.GRADIENT);
            roundButton.setCornerRadius(25);
            roundButton.setPrimaryColor(new Color(231, 76, 60));
            roundButton.setSecondaryColor(new Color(192, 57, 43));
            roundButton.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Round Button Clicked!"));
            
            AdvancedButton noSoundButton = new AdvancedButton("No Sound");
            noSoundButton.setButtonStyle(ButtonStyle.FLAT);
            noSoundButton.setSoundEnabled(false);
            noSoundButton.setPrimaryColor(new Color(243, 156, 18));
            noSoundButton.setSecondaryColor(new Color(230, 126, 34));
            noSoundButton.addActionListener(e -> JOptionPane.showMessageDialog(frame, "No Sound Button Clicked!"));
            
            // Create image icon for demo
            BufferedImage iconImage = new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB);
            Graphics2D iconG = iconImage.createGraphics();
            iconG.setColor(Color.WHITE);
            iconG.fillOval(0, 0, 15, 15);
            iconG.dispose();
            ImageIcon icon = new ImageIcon(iconImage);
            
            AdvancedButton iconButton = new AdvancedButton("Volume Control");
            iconButton.setIcon(icon);
            iconButton.setButtonStyle(ButtonStyle.GLOSSY);
            iconButton.setPrimaryColor(new Color(52, 73, 94));
            iconButton.setSecondaryColor(new Color(44, 62, 80));
            
            // Demonstrate volume control
            iconButton.addActionListener(e -> {
                JSlider volumeSlider = new JSlider(JSlider.HORIZONTAL, 0, 100, (int)(flatButton.getSoundVolume() * 100));
                volumeSlider.setMajorTickSpacing(20);
                volumeSlider.setMinorTickSpacing(5);
                volumeSlider.setPaintTicks(true);
                volumeSlider.setPaintLabels(true);
                
                JPanel sliderPanel = new JPanel(new BorderLayout(10, 10));
                sliderPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
                sliderPanel.add(new JLabel("Button Click Volume:"), BorderLayout.NORTH);
                sliderPanel.add(volumeSlider, BorderLayout.CENTER);
                
                int result = JOptionPane.showConfirmDialog(frame, sliderPanel, 
                    "Set Click Sound Volume", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                
                if (result == JOptionPane.OK_OPTION) {
                    float volume = volumeSlider.getValue() / 100.0f;
                    // Set volume for all buttons
                    flatButton.setSoundVolume(volume);
                    gradientButton.setSoundVolume(volume);
                    glossyButton.setSoundVolume(volume);
                    roundButton.setSoundVolume(volume);
                    iconButton.setSoundVolume(volume);
                }
            });
            
            // Add buttons to panel
            panel.add(flatButton);
            panel.add(gradientButton);
            panel.add(glossyButton);
            panel.add(roundButton);
            panel.add(noSoundButton);
            panel.add(iconButton);
            
            // Add sound control panel at bottom
            JPanel controlPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
            JCheckBox soundToggleCheckbox = new JCheckBox("Enable Sound", true);
            soundToggleCheckbox.addActionListener(e -> {
                boolean enabled = soundToggleCheckbox.isSelected();
                flatButton.setSoundEnabled(enabled);
                gradientButton.setSoundEnabled(enabled);
                glossyButton.setSoundEnabled(enabled);
                roundButton.setSoundEnabled(enabled);
                iconButton.setSoundEnabled(enabled);
            });
            
            controlPanel.add(soundToggleCheckbox);
            
            JPanel mainPanel = new JPanel(new BorderLayout());
            mainPanel.add(panel, BorderLayout.CENTER);
            mainPanel.add(controlPanel, BorderLayout.SOUTH);
            
            frame.add(mainPanel);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}