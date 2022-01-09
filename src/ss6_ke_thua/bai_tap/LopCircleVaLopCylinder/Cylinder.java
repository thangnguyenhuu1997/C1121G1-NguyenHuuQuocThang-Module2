package ss6_ke_thua.bai_tap.LopCircleVaLopCylinder;

public class Cylinder  extends Circle{
    private double chieuCao ;

    public Cylinder(double radius, String color, double chieuCao) {
        super(radius, color);
        this.chieuCao = chieuCao;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    public double theTich(){
        return  Math.PI* Math.pow(getRadius(), 2) * getChieuCao();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "chieuCao=" + chieuCao +
                '}';
    }
}
