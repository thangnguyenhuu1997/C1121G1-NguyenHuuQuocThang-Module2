package ss4_lop_va_doi_tuong_trong_Java.bai_tap.PhuongTrinhBacHai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập a : ");
        int a = scanner.nextInt();
        System.out.println("nhập b : ");
        int b = scanner.nextInt();
        System.out.println("nhập c : ");
        int c = scanner.nextInt();
        PhuongTrinhBacHai ptbh = new PhuongTrinhBacHai(a,b,c);
        ptbh.kiemTra();
    }
}
