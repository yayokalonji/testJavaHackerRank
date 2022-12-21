import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        //int[] c = {1,1,1,0, 1, 1, 0,0, 0, 0 };
        //int[] c = {0,0,1,0};
        //int[] c = {0,0,1,0,0,1,1,0};
        //int k =3;
        //System.out.println(jumpingOnClouds(c, k));
        //System.out.println(findDigits(110110015));
        extraLongFactorials(25);
    }

    static int jumpingOnClouds(int[] c, int k) {
        int e = 100;
        int i = 0;
        k = c.length % k != 0 ? 1 : k;
        while(i < c.length){
            e = (c[i] == 1) ? e -= 2 : e;
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
        int divisor = 0;
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
        System.out.print(factorial);
    }
}