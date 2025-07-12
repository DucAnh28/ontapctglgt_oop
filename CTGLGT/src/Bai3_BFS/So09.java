package Bai3_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class So09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int k = scanner.nextInt();
            xuLy(k);
        }
    }

    static void xuLy(int n) {
        Queue<Integer> q = new LinkedList<>();
        q.add(9);
        while (!q.isEmpty()) {
            int x = q.poll();
            if (x % n == 0) {
                System.out.println(x);
                break;
            }
            q.add(x * 10);
            q.add(x * 10 + 9);
        }
    }
}
