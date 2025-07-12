package QuyHoachDong;

import java.util.Scanner;

public class DayConTang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Đọc số lượng phần tử
        int n = scanner.nextInt();
        int[] a = new int[n];
        // Đọc các phần tử của mảng
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        // F[i] lưu độ dài của dãy con tăng dài nhất kết thúc tại vị trí i
        int[] F = new int[n];
        int result = 0;

        for (int i = 0; i < n; i++) {
            // Mỗi phần tử tự nó là một dãy con tăng có độ dài 1
            F[i] = 1;
            // Xét các phần tử đứng trước nó
            for (int j = 0; j < i; j++) {
                // Nếu phần tử trước đó (a[j]) nhỏ hơn phần t ử hiện tại (a[i])
                if (a[j] < a[i]) {
                    // Cập nhật độ dài nếu có thể tạo ra dãy con dài hơn
                    F[i] = Math.max(F[i], F[j] + 1);
                }
            }
            // Cập nhật kết quả cuối cùng với độ dài lớn nhất tìm được
            result = Math.max(result, F[i]);
        }

        System.out.println(result);
        scanner.close();
    }
}
