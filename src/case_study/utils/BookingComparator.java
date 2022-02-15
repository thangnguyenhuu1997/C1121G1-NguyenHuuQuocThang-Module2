package case_study.utils;

import case_study.models.Booking;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class BookingComparator implements Comparator <Booking> {
    @Override
    public int compare(Booking o1, Booking o2) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate ngaybatdau1 = LocalDate.parse(o1.getNgayBatDau(), formatter);
        LocalDate ngaybatdau2 = LocalDate.parse(o2.getNgayBatDau(), formatter);
        LocalDate ngayketthuc1 = LocalDate.parse(o1.getNgayKetThuc(), formatter);
        LocalDate ngayketthuc2 = LocalDate.parse(o2.getNgayKetThuc(), formatter);

        if (ngaybatdau1.compareTo(ngaybatdau2) > 0){
            return 1;
        } else if (ngaybatdau1.compareTo(ngaybatdau2) < 0){
            return -1;
        } else {
            if (ngayketthuc1.compareTo(ngayketthuc2) > 0){
                return 1;
            } else if (ngayketthuc1.compareTo(ngayketthuc2) < 0){
                return -1;
            } else {
                return 0;
            }
        }
    }
}