package algorithms;

class IpDefanger {
    public String defangIPaddr(String address) {
        // Replace all '.' with '[.]'
        return address.replace(".", "[.]");
    }

    public static void main(String[] args) {
        // Create an instance of IpDefanger to test the defangIPaddr method
        IpDefanger solution = new IpDefanger();

        // Test cases
        String ip1 = "1.1.1.1";
        String ip2 = "255.100.50.0";
        String ip3 = "192.168.0.1";
        String ip4 = "127.0.0.1";

        // Print the results
        System.out.println("Original: " + ip1 + " -> Defanged: " + solution.defangIPaddr(ip1));
        System.out.println("Original: " + ip2 + " -> Defanged: " + solution.defangIPaddr(ip2));
        System.out.println("Original: " + ip3 + " -> Defanged: " + solution.defangIPaddr(ip3));
        System.out.println("Original: " + ip4 + " -> Defanged: " + solution.defangIPaddr(ip4));
    }
}
/*
1108. Defanging an IP Address

Given a valid (IPv4) IP address, return a defanged version of that IP address.
A defanged IP address replaces every period "." with "[.]".

Example 1:
    Input: address = "1.1.1.1"
    Output: "1[.]1[.]1[.]1"

Example 2:
    Input: address = "255.100.50.0"
    Output: "255[.]100[.]50[.]0"

Constraints:
    The given address is a valid IPv4 address.
 */