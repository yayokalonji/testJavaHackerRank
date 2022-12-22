import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        int[] c = {1,1,1,0, 1, 1, 0,0, 0, 0 };
        int k =3;
        System.out.println(jumpingOnClouds(c, k));
        System.out.println(findDigits(110110015));
        extraLongFactorials(25);
        System.out.println(appendAndDelete("qwerasdf", "qwerbsdf", 6));
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
        System.out.println(factorial);
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
}