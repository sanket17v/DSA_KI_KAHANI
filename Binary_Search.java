/*
=========================================================
        BINARY SEARCH - COMPLETE DSA GUIDE (JAVA)
=========================================================

This file is written in a way that:
- You can REVISE quickly before interviews
- You understand WHY each step is happening
- You can DRY RUN easily

---------------------------------------------------------
CORE IDEA:
---------------------------------------------------------
- Works on SORTED arrays
- Reduce search space by HALF every time

Time Complexity:
- O(log n)

---------------------------------------------------------
IMPORTANT FORMULA:
---------------------------------------------------------
We use:
    mid = low + (high - low) / 2

Instead of:
    (low + high) / 2

Reason:
- Prevents INTEGER OVERFLOW
=========================================================
*/

import java.util.*;

public class BinarySearchDSA {

    /*
    =========================================================
    1. BASIC BINARY SEARCH (ITERATIVE)
    =========================================================
    */
    public static int binarySearch(int[] arr, int target) {

        int low = 0;                  // Start index
        int high = arr.length - 1;   // End index

        // Loop until search space is valid
        while (low <= high) {

            int mid = low + (high - low) / 2;

            /*
            -------------------------------------------------
            DRY RUN EXAMPLE:
            arr = [1,3,5,7,9], target = 7

            Step 1:
            low=0, high=4
            mid = 2 → arr[mid]=5

            Since 5 < 7 → discard LEFT part
            new low = mid + 1 = 3

            Step 2:
            low=3, high=4
            mid=3 → arr[mid]=7 → FOUND
            -------------------------------------------------
            */

            if (arr[mid] == target) {
                return mid; // Target found
            } 
            else if (arr[mid] < target) {
                // Target lies on RIGHT side
                low = mid + 1;
            } 
            else {
                // Target lies on LEFT side
                high = mid - 1;
            }
        }

        return -1; // Target not found
    }

    /*
    =========================================================
    2. RECURSIVE BINARY SEARCH
    =========================================================
    */
    public static int binarySearchRec(int[] arr, int low, int high, int target) {

        // Base condition: element not found
        if (low > high) return -1;

        int mid = low + (high - low) / 2;

        // If found
        if (arr[mid] == target) return mid;

        // If target is greater → search RIGHT
        if (arr[mid] < target)
            return binarySearchRec(arr, mid + 1, high, target);
        else
            // If target is smaller → search LEFT
            return binarySearchRec(arr, low, mid - 1, target);
    }

    /*
    =========================================================
    3. LOWER BOUND
    First index where arr[i] >= target
    =========================================================
    */
    public static int lowerBound(int[] arr, int target) {

        int low = 0, high = arr.length - 1;
        int ans = arr.length; // Default if not found

        while (low <= high) {

            int mid = low + (high - low) / 2;

            /*
            DRY RUN:
            arr = [1,2,4,6], target = 3

            mid=1 → arr[1]=2 < 3 → go RIGHT
            low=2

            mid=2 → arr[2]=4 >= 3 → store ans=2
            move LEFT → high=1

            Loop ends → answer = 2
            */

            if (arr[mid] >= target) {
                ans = mid;          // Possible answer
                high = mid - 1;    // Try to find smaller index (LEFT)
            } else {
                low = mid + 1;     // Move RIGHT
            }
        }

        return ans;
    }

    /*
    =========================================================
    4. UPPER BOUND
    First index where arr[i] > target
    =========================================================
    */
    public static int upperBound(int[] arr, int target) {

        int low = 0, high = arr.length - 1;
        int ans = arr.length;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            /*
            Logic:
            - If element is strictly greater → store answer
            - Move LEFT to minimize index
            */

            if (arr[mid] > target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    /*
    =========================================================
    5. FIRST OCCURRENCE
    =========================================================
    */
    public static int firstOccurrence(int[] arr, int target) {

        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            /*
            IMPORTANT:
            Even if found → continue searching LEFT
            */

            if (arr[mid] == target) {
                ans = mid;          // store answer
                high = mid - 1;    // move LEFT
            } 
            else if (arr[mid] < target) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        return ans;
    }

    /*
    =========================================================
    6. LAST OCCURRENCE
    =========================================================
    */
    public static int lastOccurrence(int[] arr, int target) {

        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            /*
            IMPORTANT:
            Even if found → continue searching RIGHT
            */

            if (arr[mid] == target) {
                ans = mid;         // store answer
                low = mid + 1;     // move RIGHT
            } 
            else if (arr[mid] < target) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        return ans;
    }

    /*
    =========================================================
    7. BINARY SEARCH ON ANSWER
    =========================================================
    Used when:
    - Answer is not directly in array
    - But lies in a RANGE

    Example:
    - Koko Eating Bananas
    - Ship Capacity
    =========================================================
    */
    public static int binarySearchOnAnswer(int[] arr) {

        int low = 1;     // minimum possible answer
        int high = 100;  // maximum possible answer (depends on problem)
        int ans = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            /*
            Think:
            mid = possible answer

            If possible → try smaller answer
            If not possible → increase answer
            */

            if (isPossible(arr, mid)) {
                ans = mid;          // valid answer
                high = mid - 1;     // try minimizing
            } else {
                low = mid + 1;      // increase
            }
        }

        return ans;
    }

    // Helper function (problem-specific logic)
    public static boolean isPossible(int[] arr, int mid) {

        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        // Example condition
        return sum <= mid;
    }

    /*
    =========================================================
    8. SEARCH IN ROTATED SORTED ARRAY (LC 33)
    =========================================================
    */
    public static int searchRotated(int[] nums, int target) {

        int low = 0, high = nums.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) return mid;

            /*
            KEY IDEA:
            One half is ALWAYS sorted
            */

            // LEFT HALF SORTED
            if (nums[low] <= nums[mid]) {

                // Check if target lies in LEFT half
                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            // RIGHT HALF SORTED
            else {

                // Check if target lies in RIGHT half
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }

    /*
    =========================================================
    MAIN METHOD (FOR TESTING)
    =========================================================
    */
    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 9, 9, 9, 10};

        System.out.println("Binary Search: " + binarySearch(arr, 7));
        System.out.println("Lower Bound: " + lowerBound(arr, 6));
        System.out.println("Upper Bound: " + upperBound(arr, 9));
        System.out.println("First Occurrence: " + firstOccurrence(arr, 9));
        System.out.println("Last Occurrence: " + lastOccurrence(arr, 9));

        int[] rotated = {4,5,6,7,0,1,2};
        System.out.println("Search Rotated: " + searchRotated(rotated, 0));
    }
}