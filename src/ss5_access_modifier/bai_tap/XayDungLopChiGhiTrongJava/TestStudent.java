package ss5_access_modifier.bai_tap.XayDungLopChiGhiTrongJava;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getName());
        System.out.println(student.getClasses());
        student.setClasses("C1121G1");
        student.setName( "Thang");
        System.out.println(student.getName());
        System.out.println(student.getClasses());
    }
}

