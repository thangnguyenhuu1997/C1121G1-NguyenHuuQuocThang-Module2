package ss3_mang_va_phuong_thuc_trong_java.bai_tap.ThemPhanTuVaoMang;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng:  ");
        int size1 = sc1.nextInt();
        int[] arr1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            System.out.println("Nhập phần tử thứ:" + (i + 1));
            arr1[i] = sc1.nextInt();
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println("nhập số cần chèn X");
        int X = sc1.nextInt();
        System.out.println("nhập vị trí cần chèn ");
        int index = sc1.nextInt();
        arr1 = Arrays.copyOf(arr1,size1+1);

        for (int i = size1 - 1; i >= index; i--) {
            arr1[i+1] = arr1[i];
        }
        arr1[index] = X;
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(Arrays.toString(arr1));
        }
    }
}
