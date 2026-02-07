import java.util.Scanner;

public class CyberSecurity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your secret password: ");
        String password = sc.nextLine();
        
        String encrypted = "";
        int key = 4; // Ye hamari secret key hai

        // Encryption Logic
        for (char c : password.toCharArray()) {
            encrypted += (char) (c + key);
        }

        System.out.println("\n--- Security Status ---");
        System.out.println("Original Password: " + password);
        System.out.println("Encrypted (Safe): " + encrypted);
        System.out.println("------------------------");
    }
}