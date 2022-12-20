public class Main {
    public static void main(String[] args) {
        int[] c = {1,1,1,0, 1, 1, 0,0, 0, 0 };
        //int[] c = {0,0,1,0};
        //int[] c = {0,0,1,0,0,1,1,0};
        int k =3;
        System.out.println(jumpingOnClouds(c, k));
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
}