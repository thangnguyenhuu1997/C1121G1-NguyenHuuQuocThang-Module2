package ss3_mang_va_phuong_thuc_trong_java.bai_tap.TimGiaTriNhoNhatTrongMang;

import java.util.Arrays;
import java.util.Scanner;
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
        int min = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if (min > arr1[i]) {
                min = arr1[i];
            }
        }

        System.out.println("giạ trị nhỏ nhất là :" + min);

    }
}
