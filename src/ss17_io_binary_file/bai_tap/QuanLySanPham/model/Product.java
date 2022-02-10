package ss17_io_binary_file.bai_tap.QuanLySanPham.model;

import java.io.Serializable;

public class Product implements Serializable {
    static final long serialVersionUID = 1L;
    private String maSanPham;
    private String tenSanPham;
    private String hangSanXuat;
    private double giaSanPham;
    private String cacMoTaKhac;

    public Product() {
    }

    public Product (String maSanPham, String tenSanPham, String hangSanXuat, double giaSanPham, String cacMoTaKhac) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.hangSanXuat = hangSanXuat;
        this.giaSanPham = giaSanPham;
        this.cacMoTaKhac = cacMoTaKhac;
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

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public double getGiaSanPham() {
        return giaSanPham;
    }

    public void setGia(double gia) {
        this.giaSanPham = giaSanPham;
    }

    public String getCacMoTaKhac() {
        return cacMoTaKhac;
    }

    public void setCacMoTaKhac(String cacMoTaKhac) {
        this.cacMoTaKhac = cacMoTaKhac;
    }

    @Override
    public String toString() {
        return "Manage{"
                + maSanPham+"\t"
                + tenSanPham+"\t"
                + hangSanXuat+"\t"
                + giaSanPham+"\t"
                + cacMoTaKhac+
                '}';
    }
}
