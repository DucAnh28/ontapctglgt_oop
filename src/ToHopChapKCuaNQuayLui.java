import java.util.Scanner;

public class ToHopChapKCuaNQuayLui {
    static int n, k;
    static int[] arr = new int[30];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        k = scanner.nextInt();
//        for (int i = 1; i <= n; i++) {
//            arr[i] = scanner.nextInt();
//        }
        quayLui(1);
    }

    public static void quayLui(int i) {
        for (int j = arr[i - 1] + 1; j <= n - k + i; j++) {
            arr[i] = j;
            if (i == k) in();
            else quayLui(i + 1);
        }
    }

    public static void in() {
        for (int i = 1; i <= k; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
