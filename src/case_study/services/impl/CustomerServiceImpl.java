package case_study.services.impl;

import case_study.models.Customer;
import case_study.models.Employee;
import case_study.services.CustomerService;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl extends Customer implements CustomerService {
    private static List<Customer> customers = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);
    @Override
    public void disPlay() {
        for (Customer customer:customers) {
            System.out.println(customer.toString());
        }
    }

    @Override
    public void add() {
        System.out.println("Nhập id");
        String id = scanner.nextLine();
        System.out.println("Nhập tên khách hàng");
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
        System.out.println("Nhập loại khách hàng");
        String loaiKhach = scanner.nextLine();
        System.out.println("Nhập địa chỉ");
        String diaChi = scanner.nextLine();
        Customer customer = new Customer(id, ten, ngaySinh, gioiTinh, cmnd, sdt, mail, loaiKhach, diaChi);
        customers.add(customer);
        System.out.println("Đã thêm mới khách hàng thành công");
    }

    @Override
    public void edit(String hoTen) {
        for (int i = 0; i < customers.size(); i++) {
            if (hoTen.equals(customers.get(i).getHoVaTen())) {
                System.out.println("Nhập tên khách hàng");
                customers.get(i).setHoVaTen(scanner.nextLine());
                System.out.println("Nhập id");
                customers.get(i).setMaID(scanner.nextLine());
                System.out.println("Nhập ngày sinh");
                customers.get(i).setNgaySinh(scanner.nextLine());
                System.out.println("Nhập giới tính");
                customers.get(i).setGioiTinh(scanner.nextLine());
                System.out.println("Nhập CMND");
                customers.get(i).setSoCMND(Integer.parseInt(scanner.nextLine()));
                System.out.println("Nhập số điện thoại");
                customers.get(i).setSoDienThoai(Integer.parseInt(scanner.nextLine()));
                System.out.println("Nhập email");
                customers.get(i).setEmail(scanner.nextLine());
                System.out.println("Nhập loại khách hàng");
                customers.get(i).setLoaiKhach(scanner.nextLine());
                System.out.println("Nhập địa chỉ");
                customers.get(i).setDiaChi(scanner.nextLine());
                break;
            }
        }
        disPlay();
    }

    @Override
    public void writeFile() {
        try {
            FileWriter fileWriter = new FileWriter("E:\\Download\\Module2\\src\\case_study\\data\\customers.csv",false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer customer : customers) {
                bufferedWriter.write(customer.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void readFile() {
        List<Customer> list2 = new ArrayList<>();
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("E:\\Download\\Module2\\src\\case_study\\data\\customers.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] array = line.split(",");
                Customer customer = new Customer(array[0],array[1],array[2],array[3],Integer.parseInt(array[4]),Integer.parseInt(array[5]),array[6],array[7],array[8]);
                list2.add(customer);
            }
            bufferedReader.close();
            for (Customer customer : list2) {
                System.out.println(customer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
