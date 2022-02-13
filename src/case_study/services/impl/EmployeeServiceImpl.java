package case_study.services.impl;

import case_study.models.Employee;
import case_study.services.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class EmployeeServiceImpl extends Employee implements EmployeeService {
    List<Employee> employees = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void disPlay() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    @Override
    public void add() {
        Employee employee = new Employee();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã ID");
        employee.setMaID(scanner.nextLine());
        System.out.println("Nhập họ và tên");
        employee.setHoVaTen(scanner.nextLine());
        System.out.println("Nhập ngày sinh");
        employee.setNgaySinh(scanner.nextLine());
        System.out.println("Nhập giới tính");
        employee.setGioiTinh(scanner.nextLine());
        System.out.println("Nhập chứng minh nhân dân ");
        employee.setSoCMND(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập số điện thoại ");
        employee.setSoDienThoai(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập email");
        employee.setEmail(scanner.nextLine());
        System.out.println("Nhập lương");
        employee.setLuong(Double.parseDouble(scanner.nextLine()));
        employee.setTrinhDo(setTrinhDo());
        employee.setViTri(setVitri());
        employees.add(employee);
        disPlay();
    }

    @Override
    public void edit(String hoTen) {
        Scanner scanner = new Scanner(System.in);
        for (int j = 0; j < employees.size(); j++) {
            if (employees.get(j).getHoVaTen().equals(hoTen)) {
                System.out.println("Nhập mã ID");
                employees.get(j).setMaID(scanner.nextLine());
                System.out.println("Nhập họ tên ");
                employees.get(j).setHoVaTen(scanner.nextLine());
                System.out.println("Nhập ngày sinh ");
                employees.get(j).setNgaySinh(scanner.nextLine());
                System.out.println("Nhập giới tính ");
                employees.get(j).setGioiTinh(scanner.nextLine());
                System.out.println("Nhập số CMND ");
                employees.get(j).setSoCMND(Integer.parseInt(scanner.nextLine()));
                System.out.println("Nhập số CMND ");
                employees.get(j).setSoCMND(Integer.parseInt(scanner.nextLine()));
                System.out.println("Nhập email ");
                employees.get(j).setEmail(scanner.nextLine());
                System.out.println("Nhập lương");
                employees.get(j).setLuong(Double.parseDouble(scanner.nextLine()));
                employees.get(j).setTrinhDo(setTrinhDo());
                employees.get(j).setViTri(setVitri());
            }
        }
    }
    Scanner scanner =  new Scanner(System.in);
    public String setVitri(){

        String result = "";
        System.out.println("Mời chọn Vị trí");
        System.out.println("1.Lễ tân, 2.phục vụ, 3.chuyên viên, 4.giám sát, 5.quản lý, 6.giám đốc");
        int choice1 = scanner.nextInt();

        switch (choice1) {
            case 1:
                result = "Lễ tân";
                break;
            case 2:
                result = "phục vụ";
                break;
            case 3:
                result = "chuyên viên";
                break;
            case 4:
                result = "giám sát";
                break;
            case 5:
                result = "quản lý";
                break;
            case 6:
                result = "giám đốc";
                break;
        }
        return result;
    }
    public String setTrinhDo(){
        String reSultTrinhDo = "";
        System.out.println("Mời chọn trình độ");
        System.out.println("1.Trung cấp - 2.Cao đẳng - 3.Đại học - 4.sau đại học");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                reSultTrinhDo = "Trung cấp";
                break;
            case 2:
                reSultTrinhDo = "Cao đẳng";
                break;
            case 3:
                reSultTrinhDo = "Đại học";
                break;
            case 4:
                reSultTrinhDo = "sau đại học";
                break;

        }
        return reSultTrinhDo;
    }


}
