#!/usr/bin/env python3

import http.server
import socketserver
import webbrowser
import threading
import time

class MyHTTPRequestHandler(http.server.SimpleHTTPRequestHandler):
    def do_GET(self):
        # Print request info to console
        print(f"📡 GET request received: {self.path}")
        print(f"🌐 Client: {self.address_string()}")
        
        # Send response
        self.send_response(200)
        self.send_header('Content-type', 'text/html')
        self.end_headers()
        
        # Simple HTML content (no .format() conflicts)
        html = f"""<!DOCTYPE html>
<html>
<head>
    <title>Python Server - localhost:8080</title>
    <style>
        body {{ 
            font-family: Arial, sans-serif; 
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            color: white;
            margin: 0;
            padding: 20px;
            min-height: 100vh;
        }}
        .container {{
            max-width: 800px;
            margin: 50px auto;
            background: rgba(255,255,255,0.1);
            padding: 40px;
            border-radius: 20px;
            box-shadow: 0 8px 32px rgba(0,0,0,0.3);
            backdrop-filter: blur(10px);
            text-align: center;
        }}
        h1 {{ font-size: 3em; margin-bottom: 20px; }}
        .status {{ 
            font-size: 1.5em; 
            background: rgba(0,255,0,0.2);
            padding: 15px;
            border-radius: 10px;
            margin: 20px 0;
        }}
        .info {{
            background: rgba(255,255,255,0.1);
            padding: 20px;
            border-radius: 10px;
            margin: 20px 0;
            text-align: left;
        }}
        .links a {{
            color: #FFD700;
            text-decoration: none;
            margin: 0 10px;
            font-size: 1.2em;
        }}
        .links a:hover {{ text-decoration: underline; }}
    </style>
</head>
<body>
    <div class="container">
        <h1>🚀 Python Web Server</h1>
        
        <div class="status">
            ✅ Server is RUNNING on localhost:8080
        </div>
        
        <div class="info">
            <h2>Server Information:</h2>
            <p><strong>🌐 URL:</strong> http://localhost:8080</p>
            <p><strong>📡 Status:</strong> Active and Ready</p>
            <p><strong>🔥 Framework:</strong> Python HTTP Server</p>
            <p><strong>📄 Current Path:</strong> {self.path}</p>
            <p><strong>⏰ Time:</strong> <span id="time"></span></p>
        </div>
        
        <div class="links">
            <h2>Quick Links:</h2>
            <a href="/">🏠 Home</a>
            <a href="/test">🧪 Test Page</a>
            <a href="/about">ℹ️ About</a>
        </div>
        
        <div class="info">
            <h2>🎉 SUCCESS!</h2>
            <p>Your Python server is working perfectly!</p>
            <p>Content is being rendered on localhost:8080</p>
            <p>Check your terminal for server logs.</p>
        </div>
    </div>
    
    <script>
        // Update time every second
        function updateTime() {{
            const now = new Date();
            document.getElementById('time').textContent = now.toLocaleString();
        }}
        updateTime();
        setInterval(updateTime, 1000);
    </script>
</body>
</html>"""
        
        self.wfile.write(html.encode('utf-8'))
        
        # Print success message to console
        print(f"✅ Page served successfully!")
        print(f"📊 Response: 200 OK")
        print("-" * 50)

def start_server():
    # Try different ports
    ports = [8080, 8081, 8000, 3000, 5000]
    
    for port in ports:
        try:
            with socketserver.TCPServer(("localhost", port), MyHTTPRequestHandler) as httpd:
                print("=" * 60)
                print("🚀 PYTHON WEB SERVER STARTING")
                print("=" * 60)
                print(f"🌐 Server URL: http://localhost:{port}")
                print(f"📡 Server running on port: {port}")
                print(f"🔥 Status: ACTIVE")
                print("=" * 60)
                print("📋 Server Logs:")
                print("=" * 60)
                
                # Auto-open browser after a short delay
                def open_browser():
                    time.sleep(1)
                    webbrowser.open(f'http://localhost:{port}')
                
                threading.Thread(target=open_browser, daemon=True).start()
                
                print(f"🌍 Opening browser to http://localhost:{port}")
                print("🛑 Press Ctrl+C to stop the server")
                print("=" * 60)
                
                httpd.serve_forever()
                
        except OSError as e:
            if "Address already in use" in str(e) or "permission" in str(e).lower():
                print(f"❌ Port {port} is busy, trying next port...")
                continue
            else:
                raise e
    
    print("❌ Could not start server on any port!")
    print("💡 Try running as administrator")

if __name__ == "__main__":
    try:
        start_server()
    except KeyboardInterrupt:
        print("\n" + "=" * 60)
        print("🛑 Server stopped by user")
        print("👋 Goodbye!")
        print("=" * 60)