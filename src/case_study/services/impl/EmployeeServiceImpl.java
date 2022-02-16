package case_study.services.impl;

import case_study.models.Employee;
import case_study.services.EmployeeService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class EmployeeServiceImpl extends Employee implements EmployeeService {
    List<Employee> employees = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void disPlay() {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

    @Override
    public void add() {
        System.out.println("Nhập id nhân viên");
        String id = scanner.nextLine();
        System.out.println("Nhập tên nhân viên");
        String ten = scanner.nextLine();
        System.out.println("Nhập ngày sinh");
        String ngaySinh = scanner.nextLine();
        System.out.println("Nhập giới tính");
        String gioiTinh = scanner.nextLine();
        System.out.println("Nhập số CMND");
        int cmnd = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số điện thoại");
        int sdt = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập email");
        String mail = scanner.nextLine();
        System.out.println("Nhập trình độ học vấn");
        String trinhDo = scanner.nextLine();
        System.out.println("Nhập vị trí");
        String viTri = scanner.nextLine();
        System.out.println("Nhập lương");
        double luong = scanner.nextDouble();
        Employee employee = new Employee(id, ten, ngaySinh, gioiTinh, cmnd, sdt, mail, trinhDo, viTri, luong);
        employees.add(employee);
    }

    @Override
    public void edit(String hoTen) {
        for (int i = 0; i < employees.size(); i++) {
            if (hoTen.equals(employees.get(i).getHoVaTen())) {
                System.out.println("Nhập tên nhân viên");
                employees.get(i).setHoVaTen(scanner.nextLine());
                System.out.println("Nhập id");
                employees.get(i).setMaID(scanner.nextLine());
                System.out.println("Nhập ngày sinh");
                employees.get(i).setNgaySinh(scanner.nextLine());
                System.out.println("Nhập giới tính");
                employees.get(i).setGioiTinh(scanner.nextLine());
                System.out.println("Nhập CMND");
                employees.get(i).setSoCMND(Integer.parseInt(scanner.nextLine()));
                System.out.println("Nhập số điện thoại");
                employees.get(i).setSoDienThoai(Integer.parseInt(scanner.nextLine()));
                System.out.println("Nhập email");
                employees.get(i).setEmail(scanner.nextLine());
                System.out.println("Nhập trình độ học vấn");
                employees.get(i).setTrinhDo(scanner.nextLine());
                System.out.println("Nhập vị trí");
                employees.get(i).setViTri(scanner.nextLine());
                System.out.println("Nhập lương");
                employees.get(i).setLuong(Double.parseDouble(scanner.nextLine()));
                break;
            }
        }
        disPlay();
    }

    @Override
    public void writeFile() {
        try {
            FileWriter fileWriter = new FileWriter("E:\\Download\\Module2\\src\\case_study\\data\\employee.csv",false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee employee : employees) {
                bufferedWriter.write(employee.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void readFile() {
        List<Employee> list2 = new ArrayList<>();
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("E:\\Download\\Module2\\src\\case_study\\data\\employee.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] array = line.split(",");
                Employee employee = new Employee(array[0], array[1], array[2], array[3], Integer.parseInt(array[4]), Integer.parseInt(array[5]),
                        array[6], array[7], array[8], Double.parseDouble(array[9]));
                list2.add(employee);
            }
            bufferedReader.close();
            for (Employee employee : list2) {
                System.out.println(employee);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
