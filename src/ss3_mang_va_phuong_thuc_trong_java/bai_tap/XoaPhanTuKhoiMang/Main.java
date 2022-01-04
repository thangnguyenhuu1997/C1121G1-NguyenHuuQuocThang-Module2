package ss3_mang_va_phuong_thuc_trong_java.bai_tap.XoaPhanTuKhoiMang;
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
        int index = -1;
        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("\nMảng ban đầu: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println("Nhập phần tử cần tìm kiếm");
        int f = scanner.nextInt();
        for (int i = 0; i < array.length; i++){
            if (f == array[i]){
                System.out.println("Tìm thấy ở vị trí " + i);
                index = i;
            }
        }
        if (index != -1){
        for (;index < array.length-1;index++) {
            array[index] = array[index+1];
        }
        array[array.length-1] = 0;
        }
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]+ "\t");
        }

    }
}
