package org.info6205;

public class VowelConsonantChecker {

    public static boolean areMoreVowels(String str, int c, int v) {
        String vowels = "aeiou";

        if (vowels.indexOf(str.charAt(0)) >= 0) {
            v++;
        } else {
            c++;
        }

        if (str.length() == 1) {
            return v > c;
        }

        return areMoreVowels(str.substring(1), c, v);
    }

    public static void main(String[] args) {
        System.out.println(areMoreVowels("aeiouttooooooorrrrr", 0, 0));
    }
}
