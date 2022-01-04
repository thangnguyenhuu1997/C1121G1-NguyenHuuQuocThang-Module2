package ss3_mang_va_phuong_thuc_trong_java.bai_tap.ThemPhanTuVaoMang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n < 0);

        int array[] = new int[n];
        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("\nMảng ban đầu: ");

        System.out.println("Nhập phần tử cần thêm");
        int x = scanner.nextInt();
        System.out.println("Nhập vị trí cần thêm");
        int index = scanner.nextInt();

    }
}
