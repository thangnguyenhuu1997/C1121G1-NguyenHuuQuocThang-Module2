package ss6_ke_thua.bai_tap.LopPoint2DVaLopPoint3D;

import java.util.Arrays;
import java.util.Scanner;

public class Point2DTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập X");
        float  X = Float.parseFloat(sc.nextLine());
        System.out.println("Mời nhập Y");
        float  Y = Float.parseFloat(sc.nextLine());

        Point2D pd2 = new Point2D(X,Y);
        pd2.getX();
        pd2.getY();
        System.out.println(pd2.toString());
        System.out.println("MẢNG XY  = "+Arrays.toString(pd2.getXY()));

    }
}
