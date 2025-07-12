public class Test {
    static int n;

    public static void main(String[] args) {
        n = 3;
        int[] B = new int[n + 1];
        nhiPhan(1, B);
    }

    public static void in(int[] B) {
        for (int i = 1; i <= n; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println();
    }

    public static void nhiPhan(int i, int[] B) {
        for (int j = 0; j <= 1; j++) {
            B[i] = j;
            if (i == n) {
                in(B);
            } else {
                nhiPhan(i + 1, B);
            }
        }
    }
}
