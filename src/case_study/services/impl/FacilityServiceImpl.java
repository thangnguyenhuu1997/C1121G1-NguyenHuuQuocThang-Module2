package case_study.services.impl;

import case_study.models.Facility;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;
import case_study.services.FacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    Scanner scanner = new Scanner(System.in);
    @Override
    public void addVilla() {
        System.out.println("Nhập tên villa");
        String ten = scanner.nextLine();
        System.out.println("Nhập diện tích villa");
        Double dienTich = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập chi phí thuê villa");
        Double chiPhi = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số lượng người thuê");
        int soLuong = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kiểu thuê");
        String kieuThue = scanner.nextLine();
        System.out.println("Nhập tiêu chuẩn phòng");
        String tieuChuan = scanner.nextLine();
        System.out.println("Nhập diện tích hồ bơi");
        Double hoboi = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số tầng villa");
        int tang = Integer.parseInt(scanner.nextLine());

        Villa villa = new Villa(ten, dienTich, chiPhi, soLuong, kieuThue, tieuChuan, hoboi, tang);
        facilityIntegerMap.put(villa, 0);
        System.out.println("Đã thêm villa thành công");
    }

    @Override
    public void addRoom() {
        System.out.println("Nhập tên phòng");
        String ten = scanner.nextLine();
        System.out.println("Nhập diện tích phòng");
        Double dienTich = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập chi phí thuê phòng");
        Double chiPhi = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số lượng người thuê");
        int soLuong = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kiểu thuê");
        String kieuThue = scanner.nextLine();
        System.out.println("Nhập tên dịch vụ đi kèm");
        String dichVu = scanner.nextLine();

        Room room = new Room(ten,dienTich,chiPhi,soLuong,kieuThue,dichVu);
        facilityIntegerMap.put(room, 0);
        System.out.println("Đã thêm room thành công");
    }

    @Override
    public void addHouse() {
        System.out.println("Nhập tên House");
        String ten = scanner.nextLine();
        System.out.println("Nhập diện tích");
        Double dienTich = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập chi phí thuê");
        Double chiPhi = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số lượng người thuê");
        int soLuong = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kiểu thuê");
        String kieuThue = scanner.nextLine();
        System.out.println("Nhập tiêu chuẩn phòng");
        String tieuChuan = scanner.nextLine();
        System.out.println("Nhập số tầng");
        int tang = Integer.parseInt(scanner.nextLine());

        House house = new House(ten,dienTich,chiPhi,soLuong,kieuThue,tieuChuan,tang);
        facilityIntegerMap.put(house, 0);
        System.out.println("Đã thêm house thành công");
    }

    @Override
    public void disPlay() {
        for (Map.Entry<Facility, Integer> element: facilityIntegerMap.entrySet()) {
            System.out.println("Service " + element.getKey() + " số lần đã thuê: " + element.getValue());
        }
    }

    @Override
    public void add() {

    }

    @Override
    public void edit(String hoTen) {

    }
}
