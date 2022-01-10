package ss7_abstract_class_interface.bai_tap.TrienKhaiInterfaceColorableChoCacLopHinhHoc;

public class Square extends Graphic {
    private double canh;

    public Square(double canh) {
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    @Override
    public String toString() {
        return "Square{" +
                "canh=" + canh +
                '}';
    }

    @Override
    public double getS() {
        return Math.pow(canh, 2);
    }

    @Override
    public void howToColor() {
        System.out.println(" Color all four sides.");
    }
}
