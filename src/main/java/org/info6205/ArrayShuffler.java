package org.info6205;

import java.util.Random;

public class ArrayShuffler {
    public static void shuffle(int[] arr) {
        Random random = new Random();

        // Start from the last element and swap it with a randomly selected element
        for (int i = arr.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1); // Generate a random index from 0 to i (inclusive)
            swap(arr, i, j);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8}; // Your array

        shuffle(myArray);

        System.out.println("Shuffled array:");
        for (int num : myArray) {
            System.out.print(num + " ");
        }
    }
}
