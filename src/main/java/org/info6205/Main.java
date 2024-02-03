package org.info6205;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("PSA HW1");
//        fragmentAnalysis();
//        fragmentAnalysis2();
        int[] arr = {-1, 0, 2, 4, 5};
        System.out.println(isNumberMatchingIndex(arr));
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
        for( int i = 0; i < n; i += 2 )
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
        for( int i = 0; i < n; i++ )
            for( int j = 0; j < n; j++ )
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
        for( int i = 0; i < n; i++ )
            sum++;
        for( int j = 0; j < n; j++ )
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
        for( int i = 0; i < n; i++ )
            for( int j = 0; j < n * n; j++ )
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
        for( int i = 0; i < n; i++ )
            for( int j = 0; j < i; j++ )
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
        for( int i = 0; i < n; i++ )
            for( int j = 0; j < n * n; j++ )
                for( int k = 0; k < j; k++ )
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
        for( int i = 1; i < n; i = i * 2 )
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
        for( int i = 1; i <= n; i++ )
            for( int j = 1; j <= i * i; j++ )
                if( j % i == 0 )
                    for( int k = 0; k < j; k++ )
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
}