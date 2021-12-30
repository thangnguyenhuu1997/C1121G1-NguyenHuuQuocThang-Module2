package ss1_introducing_to_java.bai_tap.HienThiLoiChao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Mời nhập tên");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }
}
