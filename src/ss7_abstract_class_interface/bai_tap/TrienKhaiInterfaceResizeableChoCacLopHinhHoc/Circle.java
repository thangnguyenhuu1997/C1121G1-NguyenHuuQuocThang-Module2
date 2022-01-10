package ss7_abstract_class_interface.bai_tap.TrienKhaiInterfaceResizeableChoCacLopHinhHoc;

public class Circle extends Graphic{
    private double radius ;
    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public void resize(double percent) {
        setRadius(getRadius()  * (percent+100)/100);

    }
    @Override
    public double getArea() {
        return Math.PI* Math.pow(getRadius(),2);
    }
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
