package ss3_mang_va_phuong_thuc_trong_java.bai_tap.GopMang;

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng 1:  ");
        int size1 = sc1.nextInt();
        int[] arr1 = new int[size1];
        for (int i = 0; i < size1; i++){
            System.out.println("Nhập phần tử thứ:" + (i+1));
            arr1[i] = sc1.nextInt();
        }
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng 2:  ");
        int size2 = sc2.nextInt();
        int[] arr2 = new int[size2];
        for (int i = 0; i < size2; i++){
            System.out.println("Nhập phần tử thứ:" + (i+1));
            arr2[i] = sc2.nextInt();
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < size1; i++){
            arr3[i] = arr1[i];
        }
        int arr1Length = arr1.length;
        for (int i = 0; i < size2; i++){
            arr3[arr1Length] = arr2[i];
            arr1Length++;
        }
        System.out.println(Arrays.toString(arr3));
    }
}