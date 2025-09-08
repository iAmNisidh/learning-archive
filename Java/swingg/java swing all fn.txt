# Java Swing Functions: Capabilities Chart

## GUI Component Creation and Management

| Function/Class | Primary Capabilities |
|---------------|---------------------|
| `JFrame` | Create main application windows with title bar, borders, and support for components |
| `JPanel` | Create container panels to organize and group components |
| `JButton` | Create clickable buttons that trigger actions |
| `JLabel` | Display text or images that users can't edit |
| `JTextField` | Create single-line text input fields |
| `JTextArea` | Create multi-line text input areas |
| `JCheckBox` | Create toggle options (checked/unchecked) |
| `JRadioButton` | Create mutually exclusive options when grouped |
| `JComboBox` | Create dropdown selection lists |
| `JList` | Display scrollable lists of selectable items |
| `JTable` | Display data in tabular format with rows and columns |
| `JScrollPane` | Add scrolling capability to components |
| `JTabbedPane` | Create tabbed interfaces to switch between panels |
| `JMenuBar`, `JMenu`, `JMenuItem` | Create application menus and menu items |
| `JToolBar` | Create toolbars with buttons and other components |
| `JTree` | Display hierarchical data structures |
| `JProgressBar` | Show progress of operations |
| `JSlider` | Create sliders for selecting values in a range |
| `JSpinner` | Create compact controls for selecting numbers or values |
| `JSplitPane` | Create resizable split views |
| `JDialog` | Create secondary windows for interaction |
| `JOptionPane` | Create standard dialog boxes (message, confirmation, input) |

## Layout Management

| Function/Class | Primary Capabilities |
|---------------|---------------------|
| `FlowLayout` | Arrange components in a directional flow (default for panels) |
| `BorderLayout` | Arrange components in five regions (N,S,E,W,Center) (default for frames) |
| `GridLayout` | Arrange components in a grid of equal-sized cells |
| `GridBagLayout` | Create complex layouts with variable cell sizes and component spans |
| `BoxLayout` | Arrange components in a single row or column |
| `CardLayout` | Stack components like cards, showing one at a time |
| `SpringLayout` | Create layouts with flexible spring connections |
| `GroupLayout` | Create layouts by defining horizontal and vertical component groups |
| `setLayout()` | Set the layout manager for a container |

## Event Handling

| Function/Class | Primary Capabilities |
|---------------|---------------------|
| `addActionListener()` | Register listeners for button clicks, menu selections, etc. |
| `addMouseListener()` | Register listeners for mouse events (clicks, movement) |
| `addKeyListener()` | Register listeners for keyboard events |
| `addWindowListener()` | Register listeners for window events (close, minimize) |
| `ActionListener` | Interface for handling action events |
| `MouseListener`, `MouseMotionListener` | Interfaces for handling mouse events |
| `KeyListener` | Interface for handling keyboard events |
| `FocusListener` | Interface for handling focus events |
| `WindowListener` | Interface for handling window events |
| `ItemListener` | Interface for handling item state changes |
| `ChangeListener` | Interface for handling state changes in components |

## Graphics and Customization

| Function/Class | Primary Capabilities |
|---------------|---------------------|
| `Graphics`, `Graphics2D` | Draw shapes, text, and images |
| `paint()`, `paintComponent()` | Override to perform custom drawing |
| `Color` | Set and manipulate colors |
| `Font` | Define and set text fonts |
| `setBackground()`, `setForeground()` | Set component colors |
| `setBorder()` | Add borders to components |
| `setEnabled()` | Enable/disable components |
| `setVisible()` | Show/hide components |
| `setSize()`, `setPreferredSize()` | Set component dimensions |
| `setLocation()`, `setBounds()` | Position components |
| `SwingUtilities.invokeLater()` | Run code on the Event Dispatch Thread |
| `UIManager` | Customize the look and feel |

## Data Management

| Function/Class | Primary Capabilities |
|---------------|---------------------|
| `DefaultListModel` | Model for JList components |
| `DefaultTableModel` | Model for JTable components |
| `DefaultTreeModel` | Model for JTree components |
| `DefaultComboBoxModel` | Model for JComboBox components |
| `ListSelectionModel` | Control list selection behavior |
| `ButtonGroup` | Group radio buttons for mutual exclusivity |
| `Timer` | Schedule repeated tasks in Swing applications |

## Advanced Components

| Function/Class | Primary Capabilities |
|---------------|---------------------|
| `JFileChooser` | Display file open/save dialogs |
| `JColorChooser` | Display color selection dialogs |
| `JEditorPane` | Display and edit styled content |
| `JTextPane` | Advanced text component with styling |
| `JFormattedTextField` | Text field with formatting constraints |
| `JSeparator` | Create separator lines in menus and panels |
| `JPopupMenu` | Create context/popup menus |
| `JToolTip` | Display tooltips for components |
| `JLayeredPane` | Manage components in layers |
| `JInternalFrame` | Create frames within another container |
| `ImageIcon` | Load and display images in components |









..........................................................................................................................................












# Comprehensive Java Swing Reference

## Core Swing Components

### Basic Components
| Component | Description |
|-----------|-------------|
| `JFrame` | Main application window with title bar, borders, and minimize/maximize/close buttons |
| `JDialog` | Secondary window that can be modal or non-modal |
| `JPanel` | General-purpose container for grouping components |
| `JApplet` | Container for Java applets (legacy, deprecated in modern Java) |
| `JWindow` | Window without decorations (no title bar or borders) |
| `JComponent` | Base class for all Swing components |
| `JLabel` | Component for displaying text or images |
| `JButton` | Standard push button control |
| `JToggleButton` | Button that maintains on/off state |
| `JCheckBox` | Component for boolean selection |
| `JRadioButton` | Component for selecting one option from a group |
| `JTextField` | Single-line text input component |
| `JPasswordField` | Text field that masks input characters |
| `JTextArea` | Multi-line text input component |
| `JScrollPane` | Container that provides scrolling for components |
| `JSeparator` | Horizontal or vertical separator line |
| `JProgressBar` | Component that visually displays progress of an operation |
| `JSlider` | Component for selecting a value from a range |
| `JSpinner` | Component for selecting a value from a sequence |
| `JComboBox` | Drop-down list for selecting one item |
| `JList` | Component for selecting one or more items from a list |
| `JMenuBar` | Container for menu components |
| `JMenu` | Pull-down menu component |
| `JMenuItem` | Item in a menu |
| `JCheckBoxMenuItem` | Menu item with checkbox |
| `JRadioButtonMenuItem` | Menu item with radio button |
| `JPopupMenu` | Context menu that appears on right-click |
| `JToolBar` | Container for tool buttons and other components |
| `JToolTip` | Small popup window with descriptive text |
| `JSplitPane` | Component with two adjustable panes |
| `JTabbedPane` | Component with multiple pages accessible via tabs |
| `JTable` | Component for displaying tabular data |
| `JTree` | Component for displaying hierarchical data |
| `JFileChooser` | Dialog for selecting files or directories |
| `JColorChooser` | Dialog for selecting colors |
| `JLayeredPane` | Container that allows component layering |
| `JRootPane` | Specialized container used by JFrame, JDialog, etc. |
| `JInternalFrame` | Lightweight frame used within a JDesktopPane |
| `JDesktopPane` | Container for JInternalFrames (MDI) |
| `JOptionPane` | Dialog for standard message, confirmation, and input dialogs |
| `JViewport` | Shows a portion of a larger component |
| `JScrollBar` | Scroll bars for manual scrolling |

### Text Components
| Component | Description |
|-----------|-------------|
| `JTextComponent` | Base class for text components |
| `JEditorPane` | Component for editing/displaying various text formats |
| `JTextPane` | Advanced text component supporting styled text |
| `JFormattedTextField` | Text field that enforces a specific format |
| `DefaultStyledDocument` | Document model for styled text |
| `PlainDocument` | Document model for plain text |
| `HTMLDocument` | Document model for HTML content |
| `DefaultCaret` | Class that renders the caret in text components |
| `Highlighter` | Interface for text highlighting |
| `DefaultHighlighter` | Default implementation of Highlighter |
| `Caret` | Interface for text insertion point |
| `NavigationFilter` | Controls caret navigation in text components |

## Layout Managers

| Layout Manager | Description |
|----------------|-------------|
| `FlowLayout` | Arranges components in a directional flow (left-to-right, top-to-bottom) |
| `BorderLayout` | Arranges components in five regions (North, South, East, West, Center) |
| `GridLayout` | Arranges components in a grid of equal-sized cells |
| `GridBagLayout` | Flexible layout with precisely positioned components |
| `BoxLayout` | Arranges components in a single row or column |
| `CardLayout` | Shows one component at a time from a stack |
| `SpringLayout` | Creates layouts with spring-like constraints |
| `GroupLayout` | Creates layouts by defining horizontal and vertical component groups |
| `OverlayLayout` | Arranges components on top of each other |
| `null layout` | No layout manager (absolute positioning) |

## Event Handling

### Event Classes
| Event Class | Description |
|-------------|-------------|
| `ActionEvent` | Generated when a component is activated |
| `AdjustmentEvent` | Generated by scrollbars |
| `ComponentEvent` | Base class for component events |
| `ContainerEvent` | Generated when components are added/removed |
| `FocusEvent` | Generated when component gains/loses focus |
| `InputEvent` | Base class for component input events |
| `ItemEvent` | Generated when an item's state changes |
| `KeyEvent` | Generated by keyboard actions |
| `MouseEvent` | Generated by mouse actions |
| `MouseWheelEvent` | Generated by mouse wheel |
| `WindowEvent` | Generated by window actions |
| `HierarchyEvent` | Generated by hierarchy changes |
| `InternalFrameEvent` | Generated by internal frames |
| `ListDataEvent` | Generated by list data model changes |
| `ListSelectionEvent` | Generated by list selection changes |
| `MenuEvent` | Generated by menu events |
| `PopupMenuEvent` | Generated by popup menu events |
| `TableModelEvent` | Generated by table model changes |
| `TreeExpansionEvent` | Generated by tree expansion/collapse |
| `TreeModelEvent` | Generated by tree model changes |
| `TreeSelectionEvent` | Generated by tree selection changes |
| `CaretEvent` | Generated by caret movements |
| `DocumentEvent` | Generated by document changes |
| `UndoableEditEvent` | Generated by undoable edits |

### Event Listeners
| Listener Interface | Description |
|-------------------|-------------|
| `ActionListener` | Listens for ActionEvents |
| `AdjustmentListener` | Listens for AdjustmentEvents |
| `ComponentListener` | Listens for ComponentEvents |
| `ContainerListener` | Listens for ContainerEvents |
| `FocusListener` | Listens for FocusEvents |
| `ItemListener` | Listens for ItemEvents |
| `KeyListener` | Listens for KeyEvents |
| `MouseListener` | Listens for MouseEvents |
| `MouseMotionListener` | Listens for mouse movement events |
| `MouseWheelListener` | Listens for MouseWheelEvents |
| `WindowListener` | Listens for WindowEvents |
| `WindowFocusListener` | Listens for window focus events |
| `WindowStateListener` | Listens for window state changes |
| `HierarchyListener` | Listens for hierarchy changes |
| `HierarchyBoundsListener` | Listens for hierarchy bounds changes |
| `InternalFrameListener` | Listens for internal frame events |
| `ListDataListener` | Listens for list data changes |
| `ListSelectionListener` | Listens for list selection changes |
| `MenuListener` | Listens for menu events |
| `PopupMenuListener` | Listens for popup menu events |
| `TableModelListener` | Listens for table model changes |
| `TableColumnModelListener` | Listens for table column changes |
| `TreeExpansionListener` | Listens for tree expansion/collapse |
| `TreeModelListener` | Listens for tree model changes |
| `TreeSelectionListener` | Listens for tree selection changes |
| `TreeWillExpandListener` | Listens for tree expansion/collapse before it happens |
| `CaretListener` | Listens for caret movements |
| `DocumentListener` | Listens for document changes |
| `UndoableEditListener` | Listens for undoable edits |
| `AncestorListener` | Listens for component ancestor changes |
| `ChangeListener` | Listens for state changes |
| `PropertyChangeListener` | Listens for bound property changes |
| `VetoableChangeListener` | Listens for constrained property changes |

## Data Models

| Model Class/Interface | Description |
|-----------|-------------|
| `ButtonModel` | Model for button components |
| `BoundedRangeModel` | Model for components with a range (e.g., JSlider) |
| `SingleSelectionModel` | Model for single selection components |
| `SpinnerModel` | Model for JSpinner components |
| `ComboBoxModel` | Model for JComboBox components |
| `ListModel` | Model for JList components |
| `TableModel` | Model for JTable components |
| `TreeModel` | Model for JTree components |
| `DefaultButtonModel` | Default implementation of ButtonModel |
| `DefaultBoundedRangeModel` | Default implementation of BoundedRangeModel |
| `DefaultSingleSelectionModel` | Default implementation of SingleSelectionModel |
| `DefaultComboBoxModel` | Default implementation of ComboBoxModel |
| `DefaultListModel` | Default implementation of ListModel |
| `DefaultTableModel` | Default implementation of TableModel |
| `DefaultTreeModel` | Default implementation of TreeModel |
| `SpinnerNumberModel` | SpinnerModel for numeric values |
| `SpinnerListModel` | SpinnerModel for lists |
| `SpinnerDateModel` | SpinnerModel for dates |
| `TableRowSorter` | Provides sorting for tables |
| `AbstractTableModel` | Base class for table models |
| `AbstractListModel` | Base class for list models |

## Renderers and Editors

| Renderer/Editor | Description |
|----------------|-------------|
| `ListCellRenderer` | Interface for rendering list cells |
| `TableCellRenderer` | Interface for rendering table cells |
| `TableCellEditor` | Interface for editing table cells |
| `TreeCellRenderer` | Interface for rendering tree nodes |
| `TreeCellEditor` | Interface for editing tree nodes |
| `DefaultListCellRenderer` | Default implementation of ListCellRenderer |
| `DefaultTableCellRenderer` | Default implementation of TableCellRenderer |
| `DefaultTreeCellRenderer` | Default implementation of TreeCellRenderer |
| `DefaultCellEditor` | Default implementation of CellEditor |

## Graphics and Customization

| Class/Interface | Description |
|----------------|-------------|
| `Graphics` | Class for drawing operations |
| `Graphics2D` | Enhanced graphics context with advanced features |
| `RenderingHints` | Control rendering quality and algorithm |
| `Paint` | Interface for paint objects (Color, GradientPaint, etc.) |
| `Color` | Represents RGB colors |
| `Font` | Represents fonts for text rendering |
| `FontMetrics` | Provides font measurement information |
| `Image` | Abstract class for image data |
| `BufferedImage` | Image with accessible buffer of pixels |
| `ImageIcon` | Icon implementation for images |
| `Icon` | Interface for icons |
| `Border` | Interface for component borders |
| `LineBorder` | Border with a solid line |
| `EmptyBorder` | Border with empty space |
| `EtchedBorder` | Border with an etched look |
| `BevelBorder` | Border with a raised or lowered bevel |
| `SoftBevelBorder` | Bevel border with softened edges |
| `MatteBorder` | Border with a matte look |
| `TitledBorder` | Border with a title |
| `CompoundBorder` | Combines two borders |
| `Insets` | Represents the border of a container |
| `Dimension` | Represents width and height dimensions |
| `Point` | Represents x, y coordinates |
| `Rectangle` | Represents a rectangle |
| `Stroke` | Interface for drawing line styles |
| `BasicStroke` | Implementation of Stroke interface |

## Look and Feel

| Class/Interface | Description |
|----------------|-------------|
| `LookAndFeel` | Base class for all look and feels |
| `UIManager` | Manages the current look and feel |
| `UIDefaults` | Stores defaults for the current look and feel |
| `UIResource` | Marker interface for look and feel resources |
| `MetalLookAndFeel` | Java's cross-platform look and feel |
| `NimbusLookAndFeel` | Modern cross-platform look and feel |
| `WindowsLookAndFeel` | Windows look and feel |
| `MotifLookAndFeel` | Motif look and feel |
| `GTKLookAndFeel` | GTK+ look and feel (Linux) |
| `MacLookAndFeel` | Mac OS look and feel |
| `ComponentUI` | Base class for component user interface delegates |
| `SwingUtilities` | Utility methods for Swing |

## Advanced Features

| Class/Interface | Description |
|----------------|-------------|
| `SwingWorker` | For background tasks with progress updates |
| `Timer` | For scheduling timed events |
| `KeyStroke` | For representing keyboard shortcuts |
| `InputMap` | Maps key strokes to action names |
| `ActionMap` | Maps action names to Action objects |
| `Action` | Interface for combining command with properties |
| `AbstractAction` | Base implementation of Action |
| `TransferHandler` | Support for data transfer operations (drag and drop) |
| `DragSource` | For initiating drag operations |
| `DropTarget` | For accepting drop operations |
| `ClipboardOwner` | For clipboard operations |
| `Clipboard` | Represents the system clipboard |
| `FocusTraversalPolicy` | Controls focus traversal order |
| `DefaultFocusTraversalPolicy` | Default implementation of FocusTraversalPolicy |
| `LayoutFocusTraversalPolicy` | Focus traversal based on layout |
| `ComponentInputMap` | Component-specific InputMap |
| `JLayer` | Component decorator for effects and event handling |
| `JFormattedTextField.AbstractFormatter` | Base class for text formatters |
| `JFormattedTextField.DefaultFormatter` | Default text formatter |
| `MaskFormatter` | Text formatter using a mask |
| `DateFormatter` | Text formatter for date values |
| `NumberFormatter` | Text formatter for numeric values |
| `InternalFrameUI` | UI for internal frames |
| `DesktopManager` | Manages internal frames |
| `DefaultDesktopManager` | Default implementation of DesktopManager |
| `Popup` | Base class for popups |
| `PopupFactory` | Factory for creating popups |
| `JToolTip` | Displays tooltips |
| `ToolTipManager` | Manages tooltips |
| `KeyboardFocusManager` | Manages keyboard focus |
| `FocusManager` | Manages focus |
| `RepaintManager` | Manages component repainting |
| `DebugGraphics` | Graphics for debugging drawing operations |
| `Autoscroller` | Handles autoscrolling during drag operations |

## Accessibility

| Class/Interface | Description |
|----------------|-------------|
| `Accessible` | Interface for accessibility support |
| `AccessibleContext` | Provides context for accessibility |
| `AccessibleComponent` | Accessibility for components |
| `AccessibleText` | Accessibility for text |
| `AccessibleTable` | Accessibility for tables |
| `AccessibleSelection` | Accessibility for selections |
| `AccessibleValue` | Accessibility for numeric values |
| `AccessibleAction` | Accessibility for actions |
| `AccessibleIcon` | Accessibility for icons |
| `AccessibleKeyBinding` | Accessibility for key bindings |
| `AccessibleHyperlink` | Accessibility for hyperlinks |
| `AccessibilityHelpUtility` | Utility for accessibility help |

## Swing Utilities

| Class/Method | Description |
|----------------|-------------|
| `SwingUtilities.invokeLater()` | Execute code on the Event Dispatch Thread |
| `SwingUtilities.invokeAndWait()` | Execute code on EDT and wait for completion |
| `SwingUtilities.isEventDispatchThread()` | Check if current thread is EDT |
| `SwingUtilities.convertPoint()` | Convert point between coordinate spaces |
| `SwingUtilities.convertRectangle()` | Convert rectangle between coordinate spaces |
| `SwingUtilities.getWindowAncestor()` | Get window containing a component |
| `SwingUtilities.getRoot()` | Get root component of a component |
| `SwingUtilities.updateComponentTreeUI()` | Update UI of component tree |
| `SwingConstants` | Interface defining common constants |
| `SwingWorker` | Execute background tasks |
| `EventQueue.invokeLater()` | Alternative to SwingUtilities.invokeLater() |
| `EventQueue.invokeAndWait()` | Alternative to SwingUtilities.invokeAndWait() |

## Printing Support

| Class/Interface | Description |
|----------------|-------------|
| `Printable` | Interface for printable components |
| `PrinterJob` | Class for controlling printing |
| `PageFormat` | Describes the page format for printing |
| `Paper` | Represents the physical paper |
| `PrintRequestAttributeSet` | Set of printing attributes |
| `PrinterException` | Exception for printing errors |