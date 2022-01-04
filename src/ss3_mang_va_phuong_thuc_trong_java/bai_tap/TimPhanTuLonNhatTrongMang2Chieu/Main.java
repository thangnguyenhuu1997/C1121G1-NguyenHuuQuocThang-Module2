package ss3_mang_va_phuong_thuc_trong_java.bai_tap.TimPhanTuLonNhatTrongMang2Chieu;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int m; //số dòng ma trận
        int n; //số cột ma trận
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập số dòng của ma trận: ");
            m = sc.nextInt();
            System.out.println("Nhập số cột của ma trận: ");
            n = sc.nextInt();
        } while (m < 1 && n < 1);
        int arr[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
        }
        System.out.println("\n");
        int max = arr[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];

                }

            }
        }
        System.out.println("Giá trị lớn nhất trong mảng 2 chiều là: " + max);
    }
}
