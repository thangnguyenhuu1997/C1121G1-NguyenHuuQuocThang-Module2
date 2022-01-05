package ss1_introducing_to_java.bai_tap.ChuyenDoiTienTe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double usd;
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập số tiền USD");
        usd = sc.nextDouble();
        double vnd = usd * 23000;
        System.out.println("Số tiền quy đổi là: " + vnd);
    }
}
