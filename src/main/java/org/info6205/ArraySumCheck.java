package org.info6205;

public class ArraySumCheck {

    // Recursive function to check if A[i] can be expressed as A[j] + A[k]
    private static boolean hasSum(int[] A, int i) {
        if (i < 2) {
            return false; // Base case: Not enough elements to form a sum
        }

        for (int j = 0; j < i - 1; j++) {
            for (int k = j + 1; k < i; k++) {
                if (A[i] == A[j] + A[k]) {
                    return true; // Found a valid sum
                }
            }
        }

        return hasSum(A, i - 1); // Recurse with the next index
    }

    public static void main(String[] args) {
        int[] A = { 1, 2, 4, 5, 11 }; // Example array

        boolean result = hasSum(A, A.length - 1);
        System.out.println("Does the array contain a valid sum? " + result);
    }
}
