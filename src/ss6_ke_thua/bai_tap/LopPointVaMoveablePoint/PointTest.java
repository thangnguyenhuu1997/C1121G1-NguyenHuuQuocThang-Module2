package ss6_ke_thua.bai_tap.LopPointVaMoveablePoint;
import java.util.Arrays;
import java.util.Scanner;

public class PointTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập x ");
        float x =Float.parseFloat(sc.nextLine());
        System.out.println("nhập y");
        float y =Float.parseFloat(sc.nextLine());

        Point point = new Point(x , y);
        System.out.println(point.getX());
        System.out.println( point.getY());
        System.out.println( point.toString());
        System.out.println(Arrays.toString(point.getXY()));
    }
}
