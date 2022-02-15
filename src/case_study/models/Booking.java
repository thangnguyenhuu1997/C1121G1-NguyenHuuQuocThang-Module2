package case_study.models;

public class Booking {
    private String maBooking;
    private String ngayBatDau;
    private String ngayKetThuc;
    private String maKhachHang;
    private String tenDichVu;


    public Booking(String maBooking, String ngayBatDau, String ngayKetThuc,
                   String maKhachHang, String tenDichVu) {
        this.maBooking = maBooking;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.maKhachHang = maKhachHang;
        this.tenDichVu = tenDichVu;

    }

    public Booking() {
    }

    public String getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(String maBooking) {
        this.maBooking = maBooking;
    }

    public String getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    @Override
    public String toString() {
        return this.getMaBooking() + ',' + this.getNgayBatDau() + ',' + this.getNgayKetThuc()
                + ',' + this.getMaKhachHang() + ',' + this.getTenDichVu()+ ',' + this.getTenDichVu();
    }
}
