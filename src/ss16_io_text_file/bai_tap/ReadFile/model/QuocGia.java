package ss16_io_text_file.bai_tap.ReadFile.model;

public class QuocGia {
    private int stt;
    private String kyTu;
    private String tenquocgia;

    public QuocGia(int stt, String kyTu, String tenquocgia) {
        this.stt = stt;
        this.kyTu = kyTu;
        this.tenquocgia = tenquocgia;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public String getKyTu() {
        return kyTu;
    }

    public void setKyTu(String kyTu) {
        this.kyTu = kyTu;
    }

    public String getTenquocgia() {
        return tenquocgia;
    }

    public void setTenquocgia(String tenquocgia) {
        this.tenquocgia = tenquocgia;
    }

    @Override
    public String toString() {
        return this.getStt()+ ',' + this.getKyTu()+ ',' + this.getTenquocgia();
    }
}
