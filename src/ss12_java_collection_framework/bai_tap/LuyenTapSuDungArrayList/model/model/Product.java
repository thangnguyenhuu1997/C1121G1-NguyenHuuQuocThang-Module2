package ss12_java_collection_framework.bai_tap.LuyenTapSuDungArrayList.model.model;

public class Product {
    private String maSanPham;
    private String tenSanPham;
    private double giaTien;

    public Product() {
    }
    public Product(String maSanPham, String tenSanPham, double giaTien) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.giaTien = giaTien;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    @Override
    public String toString() {
        return this.getTenSanPham() + ',' + this.getMaSanPham() + ',' + this.getGiaTien();
    }
}
