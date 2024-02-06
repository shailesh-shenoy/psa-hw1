package org.info6205;

public class TwoSumPair {

    public static boolean hasTwoSum(int[] arr, int k, int left, int right) {
        if (left >= right) {
            return false; // Base case: no pair found
        }

        int sum = arr[left] + arr[right];
        if (sum == k) {
            return true; // Pair found
        } else if (sum < k) {
            return hasTwoSum(arr, k, left + 1, right); // Move left pointer
        } else {
            return hasTwoSum(arr, k, left, right - 1); // Move right pointer
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 9, 11 };
        int k = 10;

        boolean result = hasTwoSum(arr, k, 0, arr.length - 1);
        if (result) {
            System.out.println("A pair with sum " + k + " exists.");
        } else {
            System.out.println("No such pair exists.");
        }
    }
}
