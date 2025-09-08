# filename: curl_example.py

import requests

# URL to fetch
url = "https://example.com"

# Perform a GET request (similar to: curl https://example.com)
response = requests.get(url)

# Print status code
print("Status Code:", response.status_code)

# Print response headers
print("\nHeaders:")
for key, value in response.headers.items():
    print(f"{key}: {value}")

# Print response content (HTML/text)
print("\nResponse Body:")
print(response.text)
