
import java.math.BigInteger;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        int[] c = {1,1,1,0, 1, 1, 0,0, 0, 0 };
        int k =3;
        out.println(jumpingOnClouds(c, k));
        out.println(findDigits(110110015));
        extraLongFactorials(25);
        out.println(appendAndDelete("qwerasdf", "qwerbsdf", 6));
        out.println(squares(7,90));
        out.println(libraryFine(2,7,1014,1,1,1015));
        out.println(appendAndDelete("qwerasdf", "qwerbsdf", 6));
        out.println(removeVowel("This website is for losers LOL!"));
        out.println(rowSumOddNumbers(2));
        out.println(isTriangle(7,2,2));

    }

    static int jumpingOnClouds(int[] c, int k) {
        int e = 100;
        int i = 0;
        k = c.length % k != 0 ? 1 : k;
        while(i < c.length){
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
        for(char i : numbers){
            if(i != '0'){
                divisor = n % Character.getNumericValue(i);
                if(divisor == 0){
                    count ++;
                }
            }
        }
        return count;
    }

    public static void extraLongFactorials(int n) {
        BigInteger factorial = BigInteger.ONE;
        for( int i = n; i >= 1; i --){
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
        for (int i =0; i < size ; i++){
            if(s.charAt(i) == t.charAt(i)){
                count ++;
            }else {
                break;
            }
        }
        int tMinusCount = t.length() - count;
        int sMinusCount = s.length() - count;

        int STK = k - (tMinusCount + sMinusCount);

        if (tMinusCount + sMinusCount < k && t.length() + s.length() > k && STK % 2 != 0){
            return "No";
        }else if(tMinusCount + sMinusCount <= k){
            return "Yes";
        }else {
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
        int sqrt = (int)Math.sqrt(a);
        int square = sqrt * sqrt;
        if (square < a){
            sqrt ++;
            square = sqrt * sqrt;
        }
        while (square >= a && square <= b){
            count++;
            sqrt ++;
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
        if(d1 > d2 && m1 == m2 && y1 == y2) {
            fine = 15 * (d1 - d2);
        }else if (m1 > m2 && y1 == y2){
            fine =  500 * (m1 - m2);
        } else if (y1 > y2){
            fine = 10000 ;
        }
        return fine;
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
    public static boolean isTriangle(int a, int b, int c){
        return a + b > c && a + c > b && b + c > a;
    }
}
