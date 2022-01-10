package ss7_abstract_class_interface.bai_tap.TrienKhaiInterfaceResizeableChoCacLopHinhHoc;

public class Rectangle  extends Graphic {
    private double chieuDai ;
    private double chieuRong ;

    public Rectangle(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }
    @Override
    public void resize(double percent) {
        setChieuDai(getChieuDai()  * (percent+100)/100);
        setChieuRong(getChieuRong()  * (percent+100)/100);
    }
    @Override
    public double getArea() {
        return getChieuDai() * getChieuRong();
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "chieuDai=" + chieuDai +
                ", chieuRong=" + chieuRong +
                '}';
    }
}
