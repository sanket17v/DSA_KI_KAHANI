```java
import java.util.*;

/*
 * =========================================================
 * ARRAYS IN JAVA - DSA (WITH DRY RUN COMMENTS)
 * =========================================================
 * This version includes:
 * - Step-by-step dry run explanation inside loops
 * - Helps you explain logic clearly in interviews
 * =========================================================
 */

public class ArraysDSA {

    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 1, 5, 6};

        Arrays.sort(arr); // [1, 2, 5, 5, 6, 9]
        System.out.println(Arrays.toString(arr));

        int[] sample = {1, 2, 3, 4, 5};
        reverse(sample);
        System.out.println("Reversed: " + Arrays.toString(sample));

        int[] sw = {2, 1, 5, 1, 3, 2};
        System.out.println("Max Sum (k=3): " + slidingWindow(sw, 3));

        int[] kad = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Max Subarray Sum: " + kadane(kad));

        int[] bs = {1, 2, 3, 4, 5, 6};
        System.out.println("Binary Search (4): " + binarySearch(bs, 4));
    }

    // =========================
    // REVERSE ARRAY (DRY RUN)
    // =========================
    static void reverse(int[] arr) {

        int i = 0;
        int j = arr.length - 1;

        /*
         * Example: [1, 2, 3, 4, 5]
         *
         * Iteration 1:
         * i = 0, j = 4 → swap(1,5)
         * Array → [5, 2, 3, 4, 1]
         *
         * Iteration 2:
         * i = 1, j = 3 → swap(2,4)
         * Array → [5, 4, 3, 2, 1]
         *
         * Stop when i >= j
         */

        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    // =========================
    // SLIDING WINDOW (DRY RUN)
    // =========================
    static int slidingWindow(int[] arr, int k) {

        int sum = 0;

        /*
         * Example: arr = [2,1,5,1,3,2], k = 3
         *
         * Step 1: First window
         * sum = 2+1+5 = 8
         * max = 8
         */

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int max = sum;

        /*
         * Sliding:
         *
         * i = 3:
         * Add arr[3]=1, remove arr[0]=2
         * sum = 8 + 1 - 2 = 7
         * max = 8
         *
         * i = 4:
         * Add 3, remove 1 → sum = 9
         * max = 9
         *
         * i = 5:
         * Add 2, remove 5 → sum = 6
         */

        for (int i = k; i < arr.length; i++) {

            sum += arr[i];        // include next element
            sum -= arr[i - k];    // remove previous window element

            max = Math.max(max, sum);
        }

        return max;
    }

    // =========================
    // PREFIX SUM (DRY RUN)
    // =========================
    static int[] prefixSum(int[] arr) {

        int[] prefix = new int[arr.length];

        /*
         * Example: [1,2,3,4]
         *
         * prefix[0] = 1
         * prefix[1] = 1+2 = 3
         * prefix[2] = 3+3 = 6
         * prefix[3] = 6+4 = 10
         *
         * Final: [1,3,6,10]
         */

        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        return prefix;
    }

    // =========================
    // KADANE'S ALGORITHM (DRY RUN)
    // =========================
    static int kadane(int[] arr) {

        int current = arr[0];
        int maxSum = arr[0];

        /*
         * Example:
         * [-2,1,-3,4,-1,2,1,-5,4]
         *
         * i=1 → max(1, -2+1) = 1
         * maxSum = 1
         *
         * i=2 → max(-3, 1-3) = -2
         * maxSum = 1
         *
         * i=3 → max(4, -2+4) = 4
         * maxSum = 4
         *
         * Continue...
         */

        for (int i = 1; i < arr.length; i++) {

            // Decide: start new subarray OR extend previous
            current = Math.max(arr[i], current + arr[i]);

            // Update global maximum
            maxSum = Math.max(maxSum, current);
        }

        return maxSum;
    }

    // =========================
    // BINARY SEARCH (DRY RUN)
    // =========================
    static int binarySearch(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        /*
         * Example: [1,2,3,4,5,6], target = 4
         *
         * Iteration 1:
         * mid = 2 → arr[2]=3 < 4 → search right
         *
         * Iteration 2:
         * mid = 4 → arr[4]=5 > 4 → search left
         *
         * Iteration 3:
         * mid = 3 → arr[3]=4 → FOUND
         */

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            else if (arr[mid] < target) {
                left = mid + 1; // move right
            }

            else {
                right = mid - 1; // move left
            }
        }

        return -1;
    }

    // =========================
    // SWAP
    // =========================
    static void swap(int[] arr, int i, int j) {

        /*
         * Swaps two elements
         * Example: swap(arr, 0, 4)
         */

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
```
