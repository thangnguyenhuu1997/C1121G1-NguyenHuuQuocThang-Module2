package ss15_xu_ly_ngoai_le_debug.bai_tap.SuDungLopIllegalTriangleException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;
        while (true) {
            try {
                System.out.println("Nhập cạnh a : ");
                a = scanner.nextDouble();
                System.out.println("Nhập cạnh b: ");
                b = scanner.nextDouble();
                System.out.println("Nhập cạnh c :");
                c = scanner.nextDouble();
                Triangle triangle = new Triangle(a, b, c);
                break;

            } catch (IllegalTriangleException ex) {
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }
        }
    }
}
