```java
/*
==========================================================
🔥 MATHEMATICS + COMPETITIVE PROGRAMMING (JAVA COMPLETE)
==========================================================

This file includes:
✔ Core Math (DSA)
✔ Number Theory
✔ Modular Arithmetic
✔ Fast Exponentiation
✔ Sieve Techniques
✔ Precomputation Tricks
✔ Competitive Programming Hacks

==========================================================
*/

import java.util.*;

class MathCP {

/*
----------------------------------------------------------
1️⃣ FAST INPUT / OUTPUT (CP TRICK)
----------------------------------------------------------
*/

// Use this in CP for fast input
static class FastScanner {
    private final Scanner sc = new Scanner(System.in);

    int nextInt() {
        return sc.nextInt();
    }
}

/*
----------------------------------------------------------
2️⃣ GCD / LCM (VERY IMPORTANT)
----------------------------------------------------------
*/

static int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

static int lcm(int a, int b) {
    return (a / gcd(a, b)) * b; // avoid overflow
}

/*
----------------------------------------------------------
3️⃣ BINARY EXPONENTIATION
----------------------------------------------------------
*/

// O(log n)
static long fastPower(long a, long b) {
    long result = 1;

    while (b > 0) {

        // If current bit is 1
        if ((b & 1) == 1) {
            result *= a;
        }

        a = a * a; // square
        b >>= 1;   // divide by 2
    }

    return result;
}

/*
----------------------------------------------------------
4️⃣ MODULAR ARITHMETIC (VERY IMPORTANT IN CP)
----------------------------------------------------------
*/

static final int MOD = 1_000_000_007;

// Modular Addition
static long modAdd(long a, long b) {
    return (a % MOD + b % MOD) % MOD;
}

// Modular Multiplication
static long modMul(long a, long b) {
    return (a % MOD * b % MOD) % MOD;
}

// Modular Exponentiation
static long modPow(long a, long b) {
    long result = 1;
    a %= MOD;

    while (b > 0) {
        if ((b & 1) == 1) {
            result = (result * a) % MOD;
        }
        a = (a * a) % MOD;
        b >>= 1;
    }
    return result;
}

/*
----------------------------------------------------------
5️⃣ MODULAR INVERSE (FERMAT’S LITTLE THEOREM)
----------------------------------------------------------
*/

// Only works when MOD is prime
static long modInverse(long a) {
    return modPow(a, MOD - 2);
}

/*
----------------------------------------------------------
6️⃣ FACTORIAL + NCR (COMBINATORICS)
----------------------------------------------------------
*/

static long[] fact = new long[100000];
static long[] invFact = new long[100000];

// Precompute factorials
static void precomputeFactorials(int n) {
    fact[0] = 1;

    for (int i = 1; i < n; i++) {
        fact[i] = (fact[i - 1] * i) % MOD;
    }

    // inverse factorial
    invFact[n - 1] = modInverse(fact[n - 1]);

    for (int i = n - 2; i >= 0; i--) {
        invFact[i] = (invFact[i + 1] * (i + 1)) % MOD;
    }
}

// nCr in O(1)
static long nCr(int n, int r) {
    if (r > n) return 0;

    return (fact[n] * invFact[r] % MOD * invFact[n - r] % MOD) % MOD;
}

/*
----------------------------------------------------------
7️⃣ SIEVE OF ERATOSTHENES
----------------------------------------------------------
*/

static boolean[] sieve(int n) {
    boolean[] prime = new boolean[n + 1];
    Arrays.fill(prime, true);

    prime[0] = prime[1] = false;

    for (int i = 2; i * i <= n; i++) {
        if (prime[i]) {
            for (int j = i * i; j <= n; j += i) {
                prime[j] = false;
            }
        }
    }

    return prime;
}

/*
----------------------------------------------------------
8️⃣ SMALLEST PRIME FACTOR (VERY POWERFUL)
----------------------------------------------------------
*/

static int[] spf;

// Precompute SPF
static void computeSPF(int n) {
    spf = new int[n + 1];

    for (int i = 0; i <= n; i++) spf[i] = i;

    for (int i = 2; i * i <= n; i++) {
        if (spf[i] == i) {
            for (int j = i * i; j <= n; j += i) {
                if (spf[j] == j) {
                    spf[j] = i;
                }
            }
        }
    }
}

// Prime factorization in O(log n)
static List<Integer> getPrimeFactors(int n) {
    List<Integer> factors = new ArrayList<>();

    while (n != 1) {
        factors.add(spf[n]);
        n /= spf[n];
    }

    return factors;
}

/*
----------------------------------------------------------
9️⃣ DIVISORS COUNT (IMPORTANT)
----------------------------------------------------------
*/

// Count divisors using prime factorization
static int countDivisors(int n) {
    int count = 1;

    for (int i = 2; i * i <= n; i++) {
        int power = 0;

        while (n % i == 0) {
            n /= i;
            power++;
        }

        count *= (power + 1);
    }

    if (n > 1) count *= 2;

    return count;
}

/*
----------------------------------------------------------
🔟 XOR TRICKS (VERY IMPORTANT)
----------------------------------------------------------
*/

// XOR from 1 to n
static int xorUptoN(int n) {
    if (n % 4 == 0) return n;
    if (n % 4 == 1) return 1;
    if (n % 4 == 2) return n + 1;
    return 0;
}

/*
----------------------------------------------------------
🔥 COMPETITIVE PROGRAMMING TRICKS
----------------------------------------------------------

✔ 1. Use long instead of int (avoid overflow)
✔ 2. Always use MOD = 1e9+7
✔ 3. Precompute factorials
✔ 4. Use fast exponentiation
✔ 5. Use sieve for multiple queries
✔ 6. Use SPF for factorization
✔ 7. Avoid nested loops → optimize to sqrt/log
✔ 8. Bit tricks:
      n & 1 → odd/even
      n >> 1 → divide by 2
✔ 9. Prefix sum for range queries
✔ 10. Always dry run edge cases

----------------------------------------------------------
🚀 MAIN METHOD (TEST)
----------------------------------------------------------
*/

public static void main(String[] args) {

    System.out.println("GCD: " + gcd(12, 18));
    System.out.println("Fast Power: " + fastPower(2, 10));
    System.out.println("Mod Power: " + modPow(2, 10));

    precomputeFactorials(100000);
    System.out.println("nCr: " + nCr(5, 2));

    boolean[] primes = sieve(50);
    System.out.print("Primes: ");
    for (int i = 2; i <= 50; i++) {
        if (primes[i]) System.out.print(i + " ");
    }

    computeSPF(100);
    System.out.println("\nPrime Factors of 84: " + getPrimeFactors(84));

    System.out.println("Divisors Count: " + countDivisors(36));
    System.out.println("XOR 1 to N: " + xorUptoN(5));
}

}
```


```java
/*
===========================================
📌 MATHEMATICS FOR DSA IN JAVA (COMPLETE)
===========================================

Topics Covered:
1. Basic Math Operations
2. Prime Numbers
3. GCD & LCM
4. Fast Exponentiation (Binary Exponentiation)
5. Modular Arithmetic
6. Factors / Divisors
7. Sieve of Eratosthenes
8. Bit Manipulation Basics
9. Number Properties
10. Patterns & Interview Tricks

-------------------------------------------
1️⃣ BASIC MATH OPERATIONS
-------------------------------------------
*/

class MathDSA {

    // Count digits in a number
    static int countDigits(int n) {
        int count = 0;

        // DRY RUN: n = 123 → 12 → 1 → 0
        while (n > 0) {
            count++;
            n /= 10;
        }

        return count;
    }

    // Reverse a number
    static int reverseNumber(int n) {
        int rev = 0;

        // DRY RUN:
        // n=123 → rev=3 → 32 → 321
        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }

        return rev;
    }

    // Check Palindrome Number
    static boolean isPalindrome(int n) {
        return n == reverseNumber(n);
    }


/*
-------------------------------------------
2️⃣ PRIME NUMBERS
-------------------------------------------
*/

// Brute Force Prime Check → O(n)
    static boolean isPrimeBrute(int n) {
        if (n <= 1) return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Optimized Prime Check → O(√n)
    static boolean isPrime(int n) {
        if (n <= 1) return false;

        // Only check till sqrt(n)
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }


/*
-------------------------------------------
3️⃣ GCD & LCM
-------------------------------------------
*/

// Euclidean Algorithm (IMPORTANT)
    static int gcd(int a, int b) {
        // DRY RUN:
        // gcd(12, 8) → gcd(8, 4) → gcd(4, 0) = 4
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }


/*
-------------------------------------------
4️⃣ FAST EXPONENTIATION (VERY IMPORTANT)
-------------------------------------------
*/

// Normal Power → O(n)
    static int power(int a, int b) {
        int result = 1;

        for (int i = 0; i < b; i++) {
            result *= a;
        }

        return result;
    }

// Binary Exponentiation → O(log n)
    static int fastPower(int a, int b) {
        int result = 1;

        // DRY RUN: a=2, b=5
        // b=101 (binary)
        while (b > 0) {
            if ((b & 1) == 1) {
                result *= a;
            }
            a = a * a;
            b = b >> 1;
        }

        return result;
    }


/*
-------------------------------------------
5️⃣ MODULAR ARITHMETIC
-------------------------------------------
*/

// (a + b) % m
static int modAdd(int a, int b, int m) {
    return (a % m + b % m) % m;
}

// (a * b) % m
static int modMul(int a, int b, int m) {
    return (a % m * b % m) % m;
}

// Fast Power with Mod (VERY IMPORTANT)
static int modPow(int a, int b, int m) {
    int result = 1;
    a = a % m;

    while (b > 0) {
        if ((b & 1) == 1) {
            result = (result * a) % m;
        }
        a = (a * a) % m;
        b >>= 1;
    }

    return result;
}


/*
-------------------------------------------
6️⃣ FACTORS / DIVISORS
-------------------------------------------
*/

// Print all factors → O(n)
static void printFactors(int n) {
    for (int i = 1; i <= n; i++) {
        if (n % i == 0) {
            System.out.print(i + " ");
        }
    }
}

// Optimized Factors → O(√n)
static void printFactorsOptimized(int n) {
    for (int i = 1; i * i <= n; i++) {
        if (n % i == 0) {
            System.out.print(i + " ");

            if (i != n / i) {
                System.out.print(n / i + " ");
            }
        }
    }
}


/*
-------------------------------------------
7️⃣ SIEVE OF ERATOSTHENES
-------------------------------------------
*/

// Find all primes up to n → O(n log log n)
static void sieve(int n) {
    boolean[] isPrime = new boolean[n + 1];

    // Initialize all as true
    for (int i = 2; i <= n; i++) {
        isPrime[i] = true;
    }

    for (int i = 2; i * i <= n; i++) {
        if (isPrime[i]) {

            // Mark multiples as false
            for (int j = i * i; j <= n; j += i) {
                isPrime[j] = false;
            }
        }
    }

    // Print primes
    for (int i = 2; i <= n; i++) {
        if (isPrime[i]) {
            System.out.print(i + " ");
        }
    }
}


/*
-------------------------------------------
8️⃣ BIT MANIPULATION (IMPORTANT FOR MATH)
-------------------------------------------
*/

// Check even/odd
static boolean isEven(int n) {
    return (n & 1) == 0;
}

// Count set bits
static int countSetBits(int n) {
    int count = 0;

    while (n > 0) {
        count += (n & 1);
        n >>= 1;
    }

    return count;
}


/*
-------------------------------------------
9️⃣ NUMBER PROPERTIES
-------------------------------------------
*/

// Armstrong Number
static boolean isArmstrong(int n) {
    int sum = 0;
    int original = n;
    int digits = countDigits(n);

    while (n > 0) {
        int digit = n % 10;
        sum += Math.pow(digit, digits);
        n /= 10;
    }

    return sum == original;
}

// Perfect Number
static boolean isPerfect(int n) {
    int sum = 0;

    for (int i = 1; i <= n / 2; i++) {
        if (n % i == 0) {
            sum += i;
        }
    }

    return sum == n;
}


/*
-------------------------------------------
🔟 IMPORTANT INTERVIEW PATTERNS
-------------------------------------------

1. Always reduce complexity → use √n or log n
2. Use modulo when numbers are large
3. Use bit manipulation for speed
4. Use sieve for multiple prime queries
5. Use fast exponentiation in CP

-------------------------------------------
🚀 MAIN METHOD (TESTING)
-------------------------------------------
*/

public static void main(String[] args) {

    System.out.println("Digits: " + countDigits(12345));
    System.out.println("Reverse: " + reverseNumber(123));
    System.out.println("Is Prime: " + isPrime(29));
    System.out.println("GCD: " + gcd(12, 8));
    System.out.println("LCM: " + lcm(12, 8));
    System.out.println("Fast Power: " + fastPower(2, 10));
    System.out.println("Mod Power: " + modPow(2, 10, 1000));

    System.out.print("Factors: ");
    printFactorsOptimized(36);

    System.out.println("\nArmstrong: " + isArmstrong(153));
    System.out.println("Perfect: " + isPerfect(28));
}

}
```
