package org.info6205;

public class PalindromeChecker {

    public static boolean isPalindrome(String s) {
        // Base case: Empty string or single character is a palindrome
        if (s.length() < 2) {
            return true;
        }

        // Compare first and last characters
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false; // Not a palindrome
        }

        // Recurse on the substring without the first and last characters
        return isPalindrome(s.substring(1, s.length() - 1));
    }

    public static void main(String[] args) {
        String test1 = "racecar";
        String test2 = "gohangasalamiimalasagnahog";

        System.out.println(test1 + " is a palindrome: " + isPalindrome(test1));
        System.out.println(test2 + " is a palindrome: " + isPalindrome(test2));
    }
}
