/*
========================================
    JAVA STRINGS - DSA CHEAT SHEET
========================================

Covers:
✔ Basic methods
✔ StringBuilder usage
✔ Two Pointer patterns
✔ Sliding Window
✔ Frequency array
✔ Common interview problems

----------------------------------------
*/

import java.util.*;

public class StringDSA {

    public static void main(String[] args) {
        String s = "hello";

        // Basic usage examples
        System.out.println(reverseString(s));
        System.out.println(isPalindrome(s));
    }

    /*
    ========================================
    1. BASIC STRING METHODS
    ========================================
    */

    public static void basicMethods(String s) {
        int len = s.length();              // length
        char ch = s.charAt(0);             // access char
        String sub = s.substring(1, 4);    // substring

        boolean eq = s.equals("test");     // compare
        int cmp = s.compareTo("abc");      // lexicographic

        int idx = s.indexOf("l");          // first index
        boolean contains = s.contains("he");

        String lower = s.toLowerCase();
        String upper = s.toUpperCase();
        String trimmed = s.trim();

        char[] arr = s.toCharArray();      // to char array
        String str = String.valueOf(123);  // int to string
    }

    /*
    ========================================
    2. STRINGBUILDER (MUTABLE)
    ========================================
    */

    public static void stringBuilderDemo() {
        StringBuilder sb = new StringBuilder("abc");

        sb.append("def");
        sb.insert(1, "X");
        sb.delete(1, 2);
        sb.reverse();

        String result = sb.toString();
    }

    /*
    ========================================
    3. REVERSE STRING (LC 344)
    ========================================
    */

    public static void reverseCharArray(char[] s) {
        int i = 0, j = s.length - 1;

        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }

    public static String reverseString(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    /*
    ========================================
    4. PALINDROME CHECK
    ========================================
    */

    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    /*
    ========================================
    5. ANAGRAM CHECK
    ========================================
    */

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] freq = new int[26];

        for (char ch : s1.toCharArray())
            freq[ch - 'a']++;

        for (char ch : s2.toCharArray())
            freq[ch - 'a']--;

        for (int f : freq)
            if (f != 0) return false;

        return true;
    }

    /*
    ========================================
    6. FREQUENCY COUNT
    ========================================
    */

    public static int[] frequency(String s) {
        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        return freq;
    }

    /*
    ========================================
    7. REMOVE NON-ALPHANUMERIC (LC 125)
    ========================================
    */

    public static String cleanString(String s) {
        return s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }

    /*
    ========================================
    8. TWO POINTER TEMPLATE
    ========================================
    */

    public static void twoPointerTemplate(String s) {
        int i = 0, j = s.length() - 1;

        while (i < j) {
            // process

            i++;
            j--;
        }
    }

    /*
    ========================================
    9. SLIDING WINDOW TEMPLATE
    ========================================
    */

    public static void slidingWindow(String s) {
        int left = 0;

        for (int right = 0; right < s.length(); right++) {

            // expand window

            while (/* condition */ false) {
                left++; // shrink window
            }
        }
    }

    /*
    ========================================
    10. LONGEST SUBSTRING WITHOUT REPEATING
    ========================================
    */

    public static int longestUniqueSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    /*
    ========================================
    11. COUNT SUBSTRINGS
    ========================================
    */

    public static void allSubstrings(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                System.out.println(s.substring(i, j));
            }
        }
    }

    /*
    ========================================
    12. STRING COMPRESSION
    ========================================
    */

    public static String compress(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 1; i <= s.length(); i++) {
            if (i < s.length() && s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                sb.append(s.charAt(i - 1));
                sb.append(count);
                count = 1;
            }
        }

        return sb.toString();
    }

    /*
    ========================================
    13. FIRST UNIQUE CHARACTER
    ========================================
    */

    public static int firstUniqueChar(String s) {
        int[] freq = new int[26];

        for (char ch : s.toCharArray())
            freq[ch - 'a']++;

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1)
                return i;
        }

        return -1;
    }

    /*
    ========================================
    14. STRING TO INTEGER (ATOI - BASIC)
    ========================================
    */

    public static int stringToInt(String s) {
        int num = 0;

        for (char ch : s.toCharArray()) {
            num = num * 10 + (ch - '0');
        }

        return num;
    }

    /*
    ========================================
    IMPORTANT NOTES
    ========================================

    1. String is IMMUTABLE
    2. Use StringBuilder for modifications
    3. Use equals() not ==
    4. Sliding Window + Two Pointer = MOST IMPORTANT
    5. Frequency array works for lowercase a-z

    ========================================
    */
}