package ss6_ke_thua.bai_tap.LopCircleVaLopCylinder;

import java.util.Scanner;

public class CylinderTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập bán kính : ");
        double banKinh1 = Double.parseDouble(sc.nextLine());
        System.out.println("Mời nhập chiều cao: ");
        double chieuCao =Double.parseDouble(sc.nextLine()) ;
        System.out.println("Mời nhập màu sắc : ");
        String color = sc.nextLine();

        Cylinder cr = new Cylinder(banKinh1,color,chieuCao);
        System.out.println(cr.toString());
        System.out.println("Thể tích của hình trụ = "+cr.theTich());
    }
}
