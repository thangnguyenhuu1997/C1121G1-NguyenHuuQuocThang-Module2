package ss4_lop_va_doi_tuong_trong_Java.bai_tap.XayDungLopStopWatch;

public class Main {
    public static void main(String[] args) {

        StopWatch thoiGian = new StopWatch();

        System.out.println(  thoiGian.start());
        System.out.println( thoiGian.end());
        System.out.println(thoiGian.getElapsetTime());
    }
}
