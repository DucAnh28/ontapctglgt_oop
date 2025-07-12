package Bai3_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SoNhiPhan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Đọc số lượng test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // Đọc giá trị n
            generateBinaryNumbers(3);
        }
        scanner.close();
    }

    public static void soNhiPhan(int n) {
        Queue<String> queue = new LinkedList<>();
        queue.add("1");
        while (n-- > 0) {
            String s = queue.poll();
            System.out.println(s + " ");
            queue.add(s + "0");
            queue.add(s + "1");
        }
        System.out.println();
    }

    public static void generateBinaryNumbers(int n) {
        Queue<String> q = new LinkedList<>();
        q.add("1");
        while (n-- > 0) {
            String s = q.poll();
            System.out.print(s + " ");
            q.add(s + "0");
            q.add(s + "1");
        }
        System.out.println();
    }

}
