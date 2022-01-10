package ss7_abstract_class_interface.bai_tap.TrienKhaiInterfaceResizeableChoCacLopHinhHoc;

public class Main {
    public static void main(String[] args) {
        Graphic [] graphic = new Graphic[3];
        graphic[0] = new Circle(5);
        graphic[1] = new Rectangle(5 ,5);
        graphic[2] = new Square(5);

        for (Graphic graphic1 : graphic){
            System.out.println(graphic1);
            System.out.println("Diện tích trước khi tăng"+graphic1.getArea());
            graphic1.resize(Math.random()*100);
            System.out.println("Diện tích sau khi tăng"+graphic1.getArea());
        }
    }
}
