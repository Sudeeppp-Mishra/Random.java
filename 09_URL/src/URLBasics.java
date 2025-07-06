// Program to demonstrate the basic usage of the URL class in Java
// Importing the java.net package to use the URL class
import java.net.URL;

public class URLBasics {
    public static void main(String[] args) throws Exception {
        /*
         * What is URL?
         * URL (Uniform Resource Locator) is a class in java.net that represents a resource (like a website, file, or API) on the internet.
         * We can break it into parts like protocol, host, port, path, query, and reference (anchor).
         */

        // Creating a URL object with full structure: protocol, host, port, path, query, and reference
        URL url = new URL("https://www.example.com:443/docs/index.html?user=admin#section1");

        /*
         * Breaking down the components of the URL:
         * Protocol: The communication scheme (like http, https, ftp, file)
         * Host: The domain or IP address of the server
         * Port: The port number (443 for HTTPS, 80 for HTTP). Returns -1 if not specified explicitly.
         * Path: File or directory path on the server
         * Query: Part after '?' — typically used for sending parameters
         * Reference: Also called anchor — part after '#' in the URL (used to jump to a specific section)
         */

        // Printing each part of the URL

        System.out.println("Protocol: " + url.getProtocol());  // Output: https
        System.out.println("Host: " + url.getHost());          // Output: www.example.com
        System.out.println("Port: " + url.getPort());          // Output: 443
        System.out.println("Path: " + url.getPath());          // Output: /docs/index.html
        System.out.println("Query: " + url.getQuery());        // Output: user=admin
        System.out.println("Reference: " + url.getRef());      // Output: section1

        /*
         * Note:
         * - This program does not make an internet connection.
         * - It's just breaking down the structure of a given URL string.
         * - If you provide an invalid URL format, it will throw a MalformedURLException (handled via throws Exception).
         */
    }
}