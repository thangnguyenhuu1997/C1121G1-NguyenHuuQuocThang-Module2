package case_study.models;

public class Room extends Facility {
    private String dichVuMienPhiDiKem;

    public Room(){
    }

    public Room(String tenDichVu, double dienTichSuDung, double chiPhiThue,
                int soLuongNguoiToiDa, String kieuthue, String dichVuMienPhiDiKem) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuthue);
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    public String getDichVuMienPhiDiKem() {
        return dichVuMienPhiDiKem;
    }

    public void setDichVuMienPhiDiKem(String dichVuMienPhiDiKem) {
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    @Override
    public String toString() {
        return super.toString() + ',' + this.getDichVuMienPhiDiKem();
    }
}
