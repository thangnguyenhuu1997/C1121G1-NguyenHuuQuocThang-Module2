package case_study.models;

public class House extends Facility {
    private String tieuChuanPhong;
    private int soTang;

    public House(){
    }

    public House(String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoiToiDa,
                 String kieuthue, String tieuChuanPhong, int soTang) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuthue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return super.toString() + ',' + this.getTieuChuanPhong()+ ',' + this.getSoTang();
    }
}
