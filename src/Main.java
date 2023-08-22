import java.math.BigInteger;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        int[] c = {1, 1, 1, 0, 1, 1, 0, 0, 0, 0};
        int k = 3;
        out.println(jumpingOnClouds(c, k));
        out.println(findDigits(110110015));
        extraLongFactorials(25);
        out.println(appendAndDelete("qwerasdf", "qwerbsdf", 6));
        out.println(squares(7, 90));
        out.println(libraryFine(2, 7, 1014, 1, 1, 1015));
        out.println(cutTheSticks(Arrays.asList(5, 4, 4, 2, 2, 8)));
        out.println(nonDivisibleSubset(3, Arrays.asList(1, 7, 2, 4)));
        out.println(repeatedString("aba", 10));
        out.println(appendAndDelete("qwerasdf", "qwerbsdf", 6));
        out.println(removeVowel("This website is for losers LOL!"));
        out.println(rowSumOddNumbers(2));
        out.println(isTriangle(7, 2, 2));
        out.println(maskify("454578647586477767"));
        out.println(duplicateCount("indivisibility"));
        out.println(comp(new int[]{121, 144, 19, 161, 19, 144, 19, 11}, new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361}));
    }

    static int jumpingOnClouds(int[] c, int k) {
        int e = 100;
        int i = 0;
        k = c.length % k != 0 ? 1 : k;
        while (i < c.length) {
            if ((c[i] == 1)) {
                e -= 2;
            }
            e--;
            i = i + k;
        }
        return e;
    }

    /*
     * Complete the 'findDigits' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int findDigits(int n) {
        char[] numbers = String.valueOf(n).toCharArray();
        int count = 0;
        int divisor;
        for (char i : numbers) {
            if (i != '0') {
                divisor = n % Character.getNumericValue(i);
                if (divisor == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void extraLongFactorials(int n) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = n; i >= 1; i--) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        out.println(factorial);
    }

    /*
     * Complete the 'appendAndDelete' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. STRING t
     *  3. INTEGER k
     */

    public static String appendAndDelete(String s, String t, int k) {
        // Write your code here
        int count = 0;
        int size = Math.min(s.length(), t.length());
        for (int i = 0; i < size; i++) {
            if (s.charAt(i) == t.charAt(i)) {
                count++;
            } else {
                break;
            }
        }
        int tMinusCount = t.length() - count;
        int sMinusCount = s.length() - count;

        int STK = k - (tMinusCount + sMinusCount);

        if (tMinusCount + sMinusCount < k && t.length() + s.length() > k && STK % 2 != 0) {
            return "No";
        } else if (tMinusCount + sMinusCount <= k) {
            return "Yes";
        } else {
            return "No";
        }
    }

    /*
     * Complete the 'squares' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER a
     *  2. INTEGER b
     */
    public static int squares(int a, int b) {
        int count = 0;
        int sqrt = (int) Math.sqrt(a);
        int square = sqrt * sqrt;
        if (square < a) {
            sqrt++;
            square = sqrt * sqrt;
        }
        while (square >= a && square <= b) {
            count++;
            sqrt++;
            square = sqrt * sqrt;
        }
        return count;
    }

    /*
     * Complete the 'libraryFine' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER d1
     *  2. INTEGER m1
     *  3. INTEGER y1
     *  4. INTEGER d2
     *  5. INTEGER m2
     *  6. INTEGER y2
     */

    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        int fine = 0;
        if (d1 > d2 && m1 == m2 && y1 == y2) {
            fine = 15 * (d1 - d2);
        } else if (m1 > m2 && y1 == y2) {
            fine = 500 * (m1 - m2);
        } else if (y1 > y2) {
            fine = 10000;
        }
        return fine;
    }

    /*
     * Complete the 'cutTheSticks' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> cutTheSticks(List<Integer> arr) {
        List<Integer> values;
        List<Integer> countStick = new ArrayList<>();
        countStick.add(arr.size());
        int minValue = arr.stream().min(Integer::compare).orElse(0);
        while (!(arr.isEmpty())) {
            final int val = minValue;
            values = arr.stream().map(i -> i - val).filter(i -> i != 0).toList();
            if (!values.isEmpty()) countStick.add(values.size());
            minValue = values.stream().min(Integer::compare).orElse(0);
            arr = values;
        }
        return countStick;
    }

    public static int nonDivisibleSubset(int k, List<Integer> s) {
        int[] remainderArr = new int[k];
        for (int i : s) {
            remainderArr[i % k]++;
        }
        int zeroRemainder = remainderArr[0];
        int numOfElementsInSubset = (zeroRemainder > 0) ? 1 : 0;
        for (int i = 1; i <= (k / 2); i++) {
            if (i != (k - i)) {
                numOfElementsInSubset += Math.max(remainderArr[i], remainderArr[k - i]);
            } else {
                numOfElementsInSubset++;
            }
        }
        return numOfElementsInSubset;
    }

    public static long repeatedString(String s, long n) {
        String a = s.repeat((int) n);
        out.println(a);
        out.println(a.charAt(0));
        return a.charAt(0);
    }

    public static String removeVowel(String str) {
        // remove all vowels
        return str.replaceAll("[aeiouAEIOU]", "");
    }

    public static int rowSumOddNumbers(int n) {
        return n * n * n;
    }

    /*
    Implement a function that accepts 3 integer values a, b, c. The function should return true if a triangle can be built with the sides of given length and false in any other case.
    (In this case, all triangles must have surface greater than 0 to be accepted).
     */
    public static boolean isTriangle(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }

    /* which changes all but the last four characters into '#'. */
    public static String maskify(String str) {
        int len = str.length();
        if (len <= 4) {
            return str;
        }
        String lastFour = str.substring(len - 4);
        return "#".repeat(len - 4) + lastFour;
    }

    /* Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string.
       The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
     */
    public static int duplicateCount(String text) {
        return (int) text.toLowerCase().chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).values().stream().filter(c -> c > 1).count();
    }

    /* Given two arrays a and b write a function comp(a, b) (orcompSame(a, b)) that checks whether the two arrays have the "same" elements,
        with the same multiplicities (the multiplicity of a member is the number of times it appears). "Same" means, here, that the elements in b are the elements in a squared, regardless of the order.
     */
    public static boolean comp(int[] a, int[] b) {
        return a.length == b.length && Arrays.equals(Arrays.stream(a).map(i -> i * i).sorted().toArray(), Arrays.stream(b).sorted().toArray());
    }

}
