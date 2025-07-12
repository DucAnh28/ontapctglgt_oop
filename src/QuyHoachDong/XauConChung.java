package QuyHoachDong;

import java.util.Scanner;

public class XauConChung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        while (t-- > 0) {
            String s1 = scanner.next();
            String s2 = scanner.next();
            System.out.println(checkXauConChung(s1, s2));
        }
        scanner.close();
    }

    public static int checkXauConChung(String a, String b) {
        int i = a.length(), j = b.length();
        int[][] C = new int[i + 1][j + 1];
        for (int k = 1; k <= i; k++) {
            for (int l = 1; l <= j; l++) {
                if (a.charAt(k - 1) == b.charAt(l - 1)) {
                    C[k][l] = C[k - 1][l - 1] + 1;
                } else {
                    C[k][l] = Math.max(C[k - 1][l], C[k][l - 1]);
                }
            }
        }

        return C[i][j];
    }
}
