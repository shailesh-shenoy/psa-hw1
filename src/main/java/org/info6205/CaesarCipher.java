package org.info6205;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the message to encrypt: ");
        String message = sc.nextLine();
        System.out.print("Enter the shift value (positive for encryption, negative for decryption): ");
        int shift = sc.nextInt();

        // Encrypt the message
        String encryptedMessage = encrypt(message, shift);
        System.out.println("Encrypted message: " + encryptedMessage);

        // Decrypt the message (optional)
        String decryptedMessage = encrypt(encryptedMessage, -shift);
        System.out.println("Decrypted message: " + decryptedMessage);

        sc.close();
    }

    public static String encrypt(String input, int shift) {
        StringBuilder result = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                char shiftedChar = (char) ((ch - base + shift + 26) % 26 + base);
                result.append(shiftedChar);
            } else {
                result.append(ch); // Non-alphabetic characters remain unchanged
            }
        }
        return result.toString();
    }
}

