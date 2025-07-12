package QuyHoachDong;

import java.util.Scanner;

public class XauConDoiXung {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            System.out.println(demSoXauDoiXung(s));
        }
    }

    public static int demSoXauDoiXung(String s) {
        int n = s.length();
        int ans = 1;
        boolean[][] C = new boolean[n + 1][n + 1];
        for (int i = n - 1; i >= 0; i++) {
            for (int j = i; j <= n - 1; j++) {
                if (i == j) C[i][j] = true;
                else if (s.charAt(i) == s.charAt(j)) {
                    if (j - i == 1) C[i][j] = true;
                    else C[i][j] = C[i + 1][j - 1];
                }
                if (C[i][j]) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }
        return ans;
    }
}
