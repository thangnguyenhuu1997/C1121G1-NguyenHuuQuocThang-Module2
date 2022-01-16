package ss4_lop_va_doi_tuong_trong_Java.bai_tap.PhuongTrinhBacHai;

public class PhuongTrinhBacHai {
    private double a;
    private double b;
    private double c;

    public PhuongTrinhBacHai(){
    }

    public PhuongTrinhBacHai(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return (this.b * this.b) - (4 * this.a * this.c);
    }

    public double getRoot1() {
        return (-this.b + Math.pow(getDiscriminant(), 0.5)) / (2 * this.a);
    }

    public double getRoot2() {
        return (-this.b - Math.pow(getDiscriminant(), 0.5)) / (2 * this.a);
    }

    public void kiemTra() {
        if (this.a == 0) {
            if (this.b == 0 && this.c ==0) {
                System.out.println("phương trình có vô số nghiệm");
            } else if (this.b !=0 && this.c ==0) {
                System.out.println("phương trình có nghiệm x = 0");
            } else if (this.b==0 && this.c!=0) {
                System.out.println("phương trình vô nghiệm");
            } else {
                System.out.println("phương trình có nghiệm kép là : " + (-this.c / this.b));
            }
        }
        else if (getDiscriminant() == 0) {
            System.out.println("phương trình có nghiệm kép là = " + -this.b / (2 * this.a));
        } else if (getDiscriminant() > 0) {
            System.out.println("phương trình có 2 nghiệm là : " + "r1=" + getRoot1() + "và r2 =" + getRoot2());

        } else {
            System.out.println("phương trình vô nghiệm ");
        }
    }
}
