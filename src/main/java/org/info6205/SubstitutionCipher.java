package org.info6205;

import java.util.HashMap;
import java.util.Map;

public class SubstitutionCipher {
    private final Map<Character, Character> encodingMap;
    private final Map<Character, Character> decodingMap;

    public SubstitutionCipher(String key) {
        encodingMap = new HashMap<>();
        decodingMap = new HashMap<>();

        // Initialize the encoding and decoding maps
        for (int i = 0; i < 26; i++) {
            char originalChar = (char) ('A' + i);
            char encodedChar = key.charAt(i);
            encodingMap.put(originalChar, encodedChar);
            decodingMap.put(encodedChar, originalChar);
        }
    }

    public String encode(String message) {
        StringBuilder result = new StringBuilder();
        for (char ch : message.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result.append(encodingMap.getOrDefault(ch, ch));
            } else {
                result.append(ch); // Non-uppercase characters remain unchanged
            }
        }
        return result.toString();
    }

    public String decode(String encodedMessage) {
        StringBuilder result = new StringBuilder();
        for (char ch : encodedMessage.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result.append(decodingMap.getOrDefault(ch, ch));
            } else {
                result.append(ch); // Non-uppercase characters remain unchanged
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String key = "QWERTYUIOPASDFGHJKLZXCVBNM";
        SubstitutionCipher cipher = new SubstitutionCipher(key);

        String message = "HELLO";
        String encodedMessage = cipher.encode(message);
        System.out.println("Encoded message: " + encodedMessage);

        String decodedMessage = cipher.decode(encodedMessage);
        System.out.println("Decoded message: " + decodedMessage);
    }
}

