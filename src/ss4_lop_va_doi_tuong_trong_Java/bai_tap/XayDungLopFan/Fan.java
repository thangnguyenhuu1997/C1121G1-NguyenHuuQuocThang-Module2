package ss4_lop_va_doi_tuong_trong_Java.bai_tap.XayDungLopFan;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM =2;
    final int FAST =3;
    private int speed =1;
    private boolean on = false;
    private double radius=5;
    private String color="blue";
    public Fan(){
    }
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        if (this.on == true){
            return "Tốc Độ :" + this.speed + " - " + " color :" + this.color + " - " + " radius : " + this.radius + " - " + "fan is on" ;
        }
        return "fan is off" ;

    }
}
