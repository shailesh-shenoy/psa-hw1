package org.info6205;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("PSA HW1");
//        fragmentAnalysis();
//        fragmentAnalysis2();
//        int[] arr = {-1, 0, 2, 4, 5};
//        System.out.println(isNumberMatchingIndex(arr));

//        int N = 38; // Example: Check if 37 is prime
//        if (isPrime(N)) {
//            System.out.println(N + " is a prime number.");
////        } else {
////            System.out.println(N + " is not a prime number.");
////        }
//
//        ContinuousFunction cFunc = x -> x * x - 4; // Example function: x^2 - 4
//        double lowValue = 1.0;
//        double highValue = 3.0;
//        double tolerance = 1e-6;
//
//        double rootApproximation = bisectionMethod(cFunc, lowValue, highValue, tolerance);
//        System.out.println("Approximate root: " + rootApproximation);

//        int[] arr1 = {3, 3, 4, 2, 4, 4, 2, 4, 4};
//        int[] arr2 = {3, 3, 4, 2, 4, 4, 2, 4};
//
//        int result1 = findMajorityElement(arr1);
//        int result2 = findMajorityElement(arr2);
//
//        System.out.println("Majority element in arr1: " + result1);
//        System.out.println("Majority element in arr2: " + result2);
//        int[][] matrix = {
//                {1, 4, 7, 11},
//                {2, 5, 8, 12},
//                {3, 6, 9, 16},
//                {10, 13, 14, 17}
//        };
//        int target = 6;
//
//        boolean found = searchMatrix(matrix, target);
//        System.out.println("Is " + target + " in the matrix? " + found);
//        int N = 30;
//        System.out.println("Prime numbers <= " + N + ":");
//        sieve(N);
//        equationSolver();
//        testAckerman();
//        int number = 1543; // Example: Change this to any non-negative integer
//        int onesCount = countOnes(number);
//        System.out.println("Number of 1s in binary representation of " + number + ": " + onesCount);
//        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; // Example input
//        int result = maxSubarraySum(arr, 0, arr.length - 1);
//        System.out.println("Maximum contiguous subsequence sum: " + result);
//        int[] arr = {5, 3, 11, 8, 2};
//        int targetSum = 16;
//        boolean existsSubset = hasSubsetSum(arr, targetSum);
//        System.out.println("Subset with sum " + targetSum + " exists: " + existsSubset);
//        int[] set = {3, 34, 4, 12, 5, 2};
//        int targetSum = 10;
//        int n = set.length;
//
//        if (hasSubsetSum(set, n, targetSum)) {
//            System.out.println("Found a subset with sum " + targetSum);
//        } else {
//            System.out.println("No subset with sum " + targetSum);
//        }
//        String input = "abcd";
//        permute(input);
//        reversePrinter();
//        double[] inputArray = {1.5, 4.2, -3.7, 8.1, 2.0, -5.3};
//        double[] maxMin = findMaxAndMin(inputArray);
//        System.out.println("Maximum: " + maxMin[0]);
//        System.out.println("Minimum: " + maxMin[1]);
//        String inputWord = "cabb";
//        Set<String> substrings = getAllWords(inputWord);
//        System.out.println(substrings);
//        String input = "Hello, world!";
//        System.out.println(reverse(input));
//        testCycleDetectionHashSet();
        testCycleDetectionFloyd();
    }

    public static void fragmentAnalysis() {

        System.out.println("Exercise 5.20 - Fragment running time analysis");
        int[] nValues = {10, 1000, 10000, 100000, 1000000, 10000000};
        System.out.print("Values of N tested: ");
        for (int n : nValues) {
            System.out.printf("%d, ", n);
        }

        System.out.println("Execution times comparison in nanoseconds:");
        System.out.println();

        System.out.println("Fragment 1 has a running time complexity of O(N)");
        for (int n : nValues) {
            fragment1(n);
        }

        System.out.println();
        System.out.println("Fragment 2 has a running time complexity of O(N/2), which is effectively O(N)");
        for (int n : nValues) {
            fragment2(n);
        }

        System.out.println();
        System.out.println("Fragment 3 has a running time complexity of O(N^2), which is exponentially worse than the previous fragments");
        for (int n : nValues) {
            fragment3(n);
        }

        System.out.println();
        System.out.println("Fragment 4 has a running time complexity of O(2N), which is effectively O(N)");
        for (int n : nValues) {
            fragment4(n);
        }

        System.out.println();
        System.out.println("Fragment 5 has a running time complexity of O(N^3), which is an order of magnitude worse than O(N^2)");
        for (int n : nValues) {
            fragment5(n);
        }

        System.out.println();
        System.out.println("Fragment 6 has a running time complexity of O((N^2)/2 +(N/2)), which is effectively O(N^2)");
        for (int n : nValues) {
            fragment6(n);
        }

        System.out.println();
        System.out.println("Fragment 8 has a running time complexity of O(logN), which is even better than linear complexity O(N)");
        for (int n : nValues) {
            fragment8(n);
        }

        System.out.println();
        System.out.println("Fragment 7 has a running time complexity of O(N^5), which is three orders of magnitude worse than O(N^2)");
        System.out.println("This causes Fragment 7 to become practically non-computable just at n=10000 and hang the program, which is why fragment7 is executed last here");
        for (int n : nValues) {
            fragment7(n);
        }

    }

    public static void fragment1(int n) {
        System.out.printf("n=%d\n", n);
        int sum = 0;
        long startTime = System.nanoTime();

        // Fragment 1
        for (int i = 0; i < n; i++)
            sum++;
        long endTime = System.nanoTime();
        long executionTimeInNs = endTime - startTime;
        System.out.printf("Execution Time in nanoseconds: %d\n", executionTimeInNs);
    }

    public static void fragment2(int n) {
        System.out.printf("n=%d\n", n);
        int sum = 0;
        long startTime = System.nanoTime();

        // Fragment 2
        for (int i = 0; i < n; i += 2)
            sum++;
        long endTime = System.nanoTime();
        long executionTimeInNs = endTime - startTime;
        System.out.printf("Execution Time in nanoseconds: %d\n", executionTimeInNs);
    }

    public static void fragment3(int n) {
        System.out.printf("n=%d\n", n);
        int sum = 0;
        long startTime = System.nanoTime();

        // Fragment 3
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                sum++;

        long endTime = System.nanoTime();
        long executionTimeInNs = endTime - startTime;
        System.out.printf("Execution Time in nanoseconds: %d\n", executionTimeInNs);
    }

    public static void fragment4(int n) {
        System.out.printf("n=%d\n", n);
        int sum = 0;
        long startTime = System.nanoTime();

        // Fragment 4
        for (int i = 0; i < n; i++)
            sum++;
        for (int j = 0; j < n; j++)
            sum++;

        long endTime = System.nanoTime();
        long executionTimeInNs = endTime - startTime;
        System.out.printf("Execution Time in nanoseconds: %d\n", executionTimeInNs);
    }

    public static void fragment5(int n) {
        System.out.printf("n=%d\n", n);
        int sum = 0;
        long startTime = System.nanoTime();

        // Fragment 5
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n * n; j++)
                sum++;

        long endTime = System.nanoTime();
        long executionTimeInNs = endTime - startTime;
        System.out.printf("Execution Time in nanoseconds: %d\n", executionTimeInNs);
    }

    public static void fragment6(int n) {
        System.out.printf("n=%d\n", n);
        int sum = 0;
        long startTime = System.nanoTime();

        // Fragment 6
        for (int i = 0; i < n; i++)
            for (int j = 0; j < i; j++)
                sum++;

        long endTime = System.nanoTime();
        long executionTimeInNs = endTime - startTime;
        System.out.printf("Execution Time in nanoseconds: %d\n", executionTimeInNs);
    }

    public static void fragment7(int n) {
        System.out.printf("n=%d\n", n);
        int sum = 0;
        long startTime = System.nanoTime();

        // Fragment 7
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n * n; j++)
                for (int k = 0; k < j; k++)
                    sum++;
        long endTime = System.nanoTime();
        long executionTimeInNs = endTime - startTime;
        System.out.printf("Execution Time in nanoseconds: %d\n", executionTimeInNs);
    }

    public static void fragment8(int n) {
        System.out.printf("n=%d\n", n);
        int sum = 0;
        long startTime = System.nanoTime();

        // Fragment 8
        for (int i = 1; i < n; i = i * 2)
            sum++;

        long endTime = System.nanoTime();
        long executionTimeInNs = endTime - startTime;
        System.out.printf("Execution Time in nanoseconds: %d\n", executionTimeInNs);
    }

    public static void fragment9(int n) {
        System.out.printf("n=%d\n", n);
        int sum = 0;
        long startTime = System.nanoTime();

        // Fragment 9
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= i * i; j++)
                if (j % i == 0)
                    for (int k = 0; k < j; k++)
                        sum++;

        long endTime = System.nanoTime();
        long executionTimeInNs = endTime - startTime;
        System.out.printf("Execution Time in nanoseconds: %d\n", executionTimeInNs);
    }

    public static void fragmentAnalysis2() {
        System.out.println("Exercise 5.21 - Fragment running time analysis of code with infrequently used inner loop");

        int[] nValues = {10, 1000, 10000, 100000, 1000000, 10000000};
        System.out.print("Values of N tested: ");
        for (int n : nValues) {
            System.out.printf("%d, ", n);
        }

        System.out.println("Execution times in nanoseconds:");
        System.out.println();
        System.out.println("Fragment 9 has a running time complexity of O(N^5), even though the inner most loop is infrequently used due to the if condition");
        System.out.println("However, this is only the worst case and the JVM interpreter optimizes the code to not actually run N^5 cycles");
        for (int n : nValues) {
            fragment8(n);
        }
    }

    public static boolean isNumberMatchingIndex(int[] arr) {
        // Binary search to find if A[i] = i
        boolean found = false;
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == mid) {
                found = true;
                break;
            } else if (arr[mid] < mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return found;
    }

    public static boolean isPrime(int N) {
        if (N <= 1) {
            return false; // 0 and 1 are not prime
        }
        for (int i = 2; i * i <= N; i++) {
            if (N % i == 0) {
                return false; // N has a factor other than 1 and itself
            }
        }
        return true; // N is prime
    }

    static double bisectionMethod(ContinuousFunction func, double low, double high, double tolerance) {
        if (func.apply(low) * func.apply(high) >= 0) {
            System.out.println("Function values at endpoints have the same sign.");
            return Double.NaN; // No root found
        }

        double mid;
        while ((high - low) >= tolerance) {
            mid = (low + high) / 2;
            double f_mid = func.apply(mid);

            if (Math.abs(f_mid) < tolerance) {
                return mid; // Found a root within tolerance
            } else if (f_mid * func.apply(low) < 0) {
                high = mid;
            } else {
                low = mid;
            }
        }

        // Return the best approximation
        return (low + high) / 2;
    }

    public static int findMajorityElement(int[] arr) {
        int candidate = 0;
        int count = 0;

        for (int num : arr) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (candidate == num) {
                count++;
            } else {
                count--;
            }
        }

        // Verify if candidate is a majority element
        int majorityCount = 0;
        for (int num : arr) {
            if (num == candidate) {
                majorityCount++;
            }
        }

        if (majorityCount > arr.length / 2) {
            return candidate;
        } else {
            return -1; // No majority element
        }
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int N = matrix.length;
        int row = 0; // Start from the first row
        int col = N - 1; // Start from the last column

        while (row < N && col >= 0) {
            if (matrix[row][col] == target) {
                return true; // Found the number
            } else if (matrix[row][col] > target) {
                col--; // Move left
            } else {
                row++; // Move down
            }
        }

        return false; // Number not found
    }

//    public static String toString(Object[] arr) {
//        String result = " [";
//        for(String s: arr)
//            result += s + " ";
//
//        result += " ]";
//
//        return result;
//    }

    public static void sieve(int N) {
        boolean[] prime = new boolean[N + 1];
        for (int i = 2; i <= N; i++) {
            prime[i] = true;
        }

        for (int p = 2; p * p <= N; p++) {
            if (prime[p]) {
                for (int i = p * p; i <= N; i += p) {
                    prime[i] = false;
                }
            }
        }

        // Print prime numbers
        for (int i = 2; i <= N; i++) {
            if (prime[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public static void equationSolver() {
        int n = 75; // Maximum value for A, B, C, D, E, F
        long[] powers = new long[n + 1]; // Store the fifth powers

        // Precompute the fifth powers
        for (int i = 1; i <= n; i++) {
            powers[i] = (long) Math.pow(i, 5);
        }

        // Check all tuples (A, B, C, D, E)
        for (int A = 1; A <= n; A++) {
            for (int B = A; B <= n; B++) {
                for (int C = B; C <= n; C++) {
                    for (int D = C; D <= n; D++) {
                        for (int E = D; E <= n; E++) {
                            long F = powers[A] + powers[B] + powers[C] + powers[D] + powers[E];
                            int index = Arrays.binarySearch(powers, F);
                            if (index >= 0 && index <= n && A <= B && B <= C && C <= D && D <= E && E <= index) {
                                System.out.printf("%d %d %d %d %d %d%n", A, B, C, D, E, index);
                            }
                        }
                    }
                }
            }
        }
    }

    public static int maxSubsequenceSum(int[] a) {
        int maxSum = 0;
        int seqStart = 0;
        int seqEnd = 0;

        for (int i = 0; i < a.length; i++) {
            int thisSum = 0;

            for (int j = i; j < a.length; j++) {
                thisSum += a[j];
                if (thisSum < 0)
                    break;
                if (thisSum > maxSum) {
                    maxSum = thisSum;
                    seqStart = i;
                    seqEnd = j;
                }
            }
        }

        return maxSum;
    }

    public static int ackerman(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (n == 0) {
            return ackerman(m - 1, 1);
        } else {
            return ackerman(m - 1, ackerman(m, n - 1));
        }
    }

    public static void testAckerman() {
        int m = 3; // Default value for m
        int n = 9; // Default value for n

        int result = ackerman(m, n);
        System.out.println("Ackermann(" + m + ", " + n + ") = " + result);
    }

    public static int countOnes(int N) {
        if (N == 0) {
            return 0;
        } else if (N % 2 == 1) {
            // If N is odd, add 1 to the count
            return 1 + countOnes(N / 2);
        } else {
            // If N is even, simply divide by 2
            return countOnes(N / 2);
        }
    }

    public static int maxSubarraySum(int[] arr, int low, int high) {
        if (low == high) {
            return arr[low]; // Base case: single element
        }

        int mid = (low + high) / 2;

        // Recursively find the maximum subarray sum in left and right halves
        int leftMax = maxSubarraySum(arr, low, mid);
        int rightMax = maxSubarraySum(arr, mid + 1, high);

        // Compute the maximum subarray sum that crosses the midpoint
        int crossMax = maxCrossingSum(arr, low, mid, high);

        // Return the overall maximum
        return Math.max(Math.max(leftMax, rightMax), crossMax);
    }

    // Helper method to find the maximum subarray sum that crosses the midpoint
    private static int maxCrossingSum(int[] arr, int low, int mid, int high) {
        // Compute the maximum sum on the left side
        int leftSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = mid; i >= low; i--) {
            sum += arr[i];
            leftSum = Math.max(leftSum, sum);
        }

        // Compute the maximum sum on the right side
        int rightSum = Integer.MIN_VALUE;
        sum = 0;
        for (int i = mid + 1; i <= high; i++) {
            sum += arr[i];
            rightSum = Math.max(rightSum, sum);
        }

        // Return the sum of both sides
        return leftSum + rightSum;
    }

    public static boolean hasSubsetSum(int[] arr, int K) {
        int n = arr.length;
        boolean[][] m = new boolean[n + 1][K + 1];

        // Initialization
        for (int i = 0; i <= n; i++) {
            m[i][0] = true;
        }

        // Dynamic programming transition
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= K; j++) {
                if (arr[i - 1] <= j) {
                    m[i][j] = m[i - 1][j] || m[i - 1][j - arr[i - 1]];
                } else {
                    m[i][j] = m[i - 1][j];
                }
            }
        }

        return m[n][K];
    }

    public static boolean hasSubsetSum(int[] set, int n, int sum) {
        if (sum == 0) {
            return true; // Base case: empty subset sums to 0
        }
        if (n == 0) {
            return false; // Base case: no more elements to consider
        }

        // Include the last element or exclude it
        return hasSubsetSum(set, n - 1, sum) || hasSubsetSum(set, n - 1, sum - set[n - 1]);
    }

    public static void permute(String str) {
        permuteHelper("", str);
    }

    private static void permuteHelper(String prefix, String remaining) {
        int n = remaining.length();
        if (n == 0) {
            System.out.println(prefix); // Print the permutation
        } else {
            for (int i = 0; i < n; i++) {
                char currentChar = remaining.charAt(i);
                String newPrefix = prefix + currentChar;
                String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
                permuteHelper(newPrefix, newRemaining);
            }
        }
    }

    public static void printReverse(Scanner scanner) {
        if (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            printReverse(scanner); // Recurse to read subsequent lines

            // Print the current line after recursion
            System.out.println(line);
        }
        // Close the scanner when all lines are printed
        scanner.close();
    }

    public static void reversePrinter() {
        Scanner scanner = new Scanner("Line 1\nLine 2\nLine 3\n");
        printReverse(scanner);
    }

    public static double[] findMaxAndMin(double[] arr) {
        double[] result = new double[2];
        findMaxAndMinRecursive(arr, 0, arr.length - 1, result);
        return result;
    }

    private static void findMaxAndMinRecursive(double[] arr, int left, int right, double[] result) {
        if (left == right) {
            // Base case: Only one element in the subarray
            result[0] = arr[left]; // Set maximum
            result[1] = arr[left]; // Set minimum
        } else if (right - left == 1) {
            // Base case: Two elements in the subarray
            result[0] = Math.max(arr[left], arr[right]); // Set maximum
            result[1] = Math.min(arr[left], arr[right]); // Set minimum
        } else {
            // Recursive case: Split the problem into two halves
            int mid = (left + right) / 2;
            double[] leftResult = new double[2];
            double[] rightResult = new double[2];

            // Recurse on the left half
            findMaxAndMinRecursive(arr, left, mid, leftResult);
            // Recurse on the right half
            findMaxAndMinRecursive(arr, mid + 1, right, rightResult);

            // Combine results from left and right
            result[0] = Math.max(leftResult[0], rightResult[0]); // Maximum
            result[1] = Math.min(leftResult[1], rightResult[1]); // Minimum
        }
    }

    public static Set<String> getAllWords(String word) {
        Set<String> result = new HashSet<>();
        generateSubstrings(word, "", 0, result);
        return result;
    }

    private static void generateSubstrings(String word, String current, int index, Set<String> result) {
        if (index == word.length()) {
            result.add(current); // Add the current substring to the result
        } else {
            // Include the current character in the substring
            generateSubstrings(word, current + word.charAt(index), index + 1, result);
            // Exclude the current character from the substring
            generateSubstrings(word, current, index + 1, result);
        }
    }

    public static String reverse(String str) {
        return reverseRecursive(str, str.length() - 1, new StringBuffer());
    }

    private static String reverseRecursive(String str, int index, StringBuffer result) {
        if (index < 0) {
            return result.toString();
        }
        result.append(str.charAt(index));
        return reverseRecursive(str, index - 1, result);
    }

    public static boolean hasCycleHashSet(ListNode head) {
        HashSet<ListNode> visited = new HashSet<>();
        ListNode current = head;
        while (current != null) {
            if (visited.contains(current)) {
                return true; // Cycle detected
            }
            visited.add(current);
            current = current.next;
        }
        return false; // No cycle
    }

    public static void testCycleDetectionHashSet() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = head; // Create a cycle
        System.out.println(hasCycleHashSet(head));
    }

    public static boolean hasCycleFloyd(ListNode head) {
        if (head == null || head.next == null) {
            return false; // No cycle
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true; // Cycle detected
            }
        }

        return false; // No cycle
    }

    public static void testCycleDetectionFloyd() {
        // Example usage:
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = head; // Create a cycle

        System.out.println(hasCycleFloyd(head)); // Output: true
    }
}

@FunctionalInterface
interface ContinuousFunction {
    double apply(double x);
}

//class ListNode {
//    int val;
//    ListNode next;
//
//    ListNode(int val) {
//        this.val = val;
//        this.next = null;
//    }
//}