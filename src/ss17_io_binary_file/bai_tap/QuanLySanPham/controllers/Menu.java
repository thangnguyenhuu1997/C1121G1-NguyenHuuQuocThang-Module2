package ss17_io_binary_file.bai_tap.QuanLySanPham.controllers;


import ss17_io_binary_file.bai_tap.QuanLySanPham.service.IProductService;
import ss17_io_binary_file.bai_tap.QuanLySanPham.service.ProductService;

import java.util.Scanner;

public class Menu {
    public void displayMenu() {
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        while (choice != 4) {
            System.out.println("Nhập 1 đến 4 để chọn chức năng:");
            System.out.println("1. Thêm");
            System.out.println("2. Hiển thị");
            System.out.println("3. Tìm kiếm thông tin");
            System.out.println("4. Thoát");
            choice = scanner.nextInt();
            IProductService iProductService = new ProductService();
            switch (choice) {
                case 1:
                    System.out.println("==================================");
                    iProductService.add();
                    System.out.println("===================================");
                    break;
                case 2:
                    System.out.println("====================================");
                    iProductService.display();
                    System.out.println("=====================================");
                    break;
                case 3:
                    System.out.println("========================================");
//                    iProductService.search();
                    System.out.println("=======================================");
                    break;
                default:
                    break;

            }
        }
    }
}
