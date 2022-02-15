package case_study.services.impl;

import case_study.models.*;
import case_study.services.BookingService;
import case_study.utils.BookingComparator;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    static List<Customer> customerList = new ArrayList<>();
    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    static {
        customerList.add(new Customer("1", "Thang", "6/10", "Nam", 2143423,
                52543,"thang@gmail.com", "VIP", "Sonthuy2"));
        customerList.add(new Customer("2", "Hoang", "1/10", "Nam", 2143224,
                524325,"hoang@gmail.com", "Thường", "Sonthuy2"));

        facilityIntegerMap.put(new Villa("Villa", 5, 8000000,
                4, "thường", "VIP", 2, 2), 0);
        facilityIntegerMap.put(new Villa("Villa", 3, 3000000,
                2, "thuòng", "giường đơn", 2, 2), 0);
    }
    @Override
    public void addBooking() {
        Scanner scanner = new Scanner(System.in);
        int id = 1;
        if (!bookingSet.isEmpty()){
            id = bookingSet.size();
        }
        Customer customer = chooseCustomer();
        Facility facility = chooseFacility();
        System.out.println("Nhập ngày bắt đầu thuê: ");
        String ngaybatdau = scanner.nextLine();
        System.out.println("Nhập ngày trả phòng: ");
        String ngaykethuc = scanner.nextLine();
        Booking booking = new Booking();

        bookingSet.add(booking);
        System.out.println("Đã booking thành công");
    }

    @Override
    public void displayListBooking() {
        for (Booking booking: bookingSet) {
            System.out.println(booking.toString());
        }
    }
    public static Customer chooseCustomer(){
        System.out.println("Danh sách khách hàng: ");
        for (Customer customer: customerList) {
            System.out.println(customer.toString());
        }

        System.out.println("Nhập id khách hàng: ");
        boolean check = true;
        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();
        while (check){
            for (Customer customer: customerList) {
                if (id == customer.getMaID()){
                    check = false;
                    return customer;
                }
            }
            if (check){
                System.out.println("Bạn đã nhập sai, vui lòng nhập lại");
                id = scanner.nextLine();
            }
        }
        return null;
    }
    public static Facility chooseFacility(){
        System.out.println("Danh sách dịch vụ: ");
        for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()){
            System.out.println(entry.getKey().toString());
        }

        System.out.println("Nhập tên dịch vụ: ");
        boolean check = true;
        Scanner scanner = new Scanner(System.in);
        String ten = scanner.nextLine();
        while (check){
            for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
                if (ten.equals(entry.getKey().getTenDichVu())){
                    check = false;
                    return entry.getKey();
                }
            }
            if (check){
                System.out.println("Bạn đã nhập sai, vui lòng nhập lại");
                ten = scanner.nextLine();
            }
        }
        return null;
    }
}
