import java.util.Scanner;

public class XauNhiPhanQuayLui {
    static int n;
    static int[] B;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        B = new int[n + 1];
        backtrack(1);
    }

    public static void print(int[] B) {
        for (int i = 1; i <= n; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println();
    }

    public static void backtrack(int i) {
        for (int j = 0; j <= 1; j++) {
            B[i] = j;
            if (i == n) {
                print(B);
            } else {
                backtrack(i + 1);
            }
        }
    }
//    public static String getStringBinary(int[] B) {
//        StringBuilder sb = new StringBuilder();
//        for (int i = 1; i <= n; i++) {
//            sb.append(B[i]).append(" ");
//        }
//        return sb.toString();
//    }


}

