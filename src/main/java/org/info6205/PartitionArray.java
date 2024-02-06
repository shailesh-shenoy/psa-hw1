package org.info6205;

public class PartitionArray {

    public static void partition(int[] arr, int low, int high, int k) {
        if (low >= high) {
            return; // Base case: array size is 1 or less
        }

        int pivotIndex = partitionAroundPivot(arr, low, high, k);

        // Recursively partition the left and right subarrays
        partition(arr, low, pivotIndex - 1, k);
        partition(arr, pivotIndex + 1, high, k);
    }

    private static int partitionAroundPivot(int[] arr, int low, int high, int k) {
        int pivot = arr[high]; // Choose the last element as the pivot
        int i = low - 1; // Index of smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        // Place the pivot in its correct position
        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 9, 1, 5, 7, 3 };
        int k = 4;

        partition(arr, 0, arr.length - 1, k);

        System.out.print("Rearranged array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

