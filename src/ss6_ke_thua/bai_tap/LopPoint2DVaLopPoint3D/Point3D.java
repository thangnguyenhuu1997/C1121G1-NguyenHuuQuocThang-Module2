package ss6_ke_thua.bai_tap.LopPoint2DVaLopPoint3D;

public class Point3D  extends Point2D{
    private float z ;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" +  this.getX() +
                "y=" + this.getY() +
                "z=" + z +
                '}';
    }

    public void setXYZ(float x , float y , float z) {
        this.setX(x);
        this.setX(y);
        this.z = z;
    }
    public float[] getXYZ() {
        float []array = new float[3];
        array[0]=  this.getX();
        array[1]=  this.getY();
        array[2]=this.z;
        return array;
    }
}
