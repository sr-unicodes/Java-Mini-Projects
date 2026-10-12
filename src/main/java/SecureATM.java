

import java.util.Scanner;

public class SecureATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //fixed pin
        int expectedPin = 1234;
        boolean isAuthenticated = false;

        System.out.println("--- Secure Enterprise ATM ---");

        for (int attempt = 1; attempt <= 3 ; attempt++) {
            System.out.print("Enter the pin: ");
            int pin = scanner.nextInt();
            // check if pin is equal to expected ones!
            if (pin == expectedPin){
                isAuthenticated = true;
                System.out.println("Access Granted");
                break;
            }else{
                System.out.println("Incorrect pin ! Attempts remaining: " + (3 - attempt));
            }
        }
        if (!isAuthenticated) {
            throw new SecurityException("Account Locked: Maximum attempts exceeded.");
        }
        scanner.close();
    }
}