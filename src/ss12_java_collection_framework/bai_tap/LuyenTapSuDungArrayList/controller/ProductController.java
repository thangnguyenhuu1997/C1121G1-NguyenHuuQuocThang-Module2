package ss12_java_collection_framework.bai_tap.LuyenTapSuDungArrayList.controller;

import ss12_java_collection_framework.bai_tap.LuyenTapSuDungArrayList.model.service.IProductService;
import ss12_java_collection_framework.bai_tap.LuyenTapSuDungArrayList.model.service.Impl.ProductService;

import java.util.Scanner;

public class ProductController {
    public static void main(String[] args) {
        IProductService iProductService = new ProductService();
        Scanner sc=new Scanner(System.in);
        System.out.println("Menu quản lý sản phẩm"+"\n"
                +"Chọn chức năng theo số (để tiếp tục):"+"\n"
                +"1. Thêm mới"+"\n" + "2. Sửa thông tin" + "\n" + "3. Xóa sản phẩm" + "\n" +
                "4. Hiển thị danh sách sản phẩm" + "\n" + "5. Tìm kiếm" + "\n" +
                "6. Sắp xếp"+"\n" + "Xin mời chọn chức năng");
        int choice= Integer.parseInt(sc.nextLine());
        switch (choice){
            case 1:
                iProductService.add();
                break;
            case 2:
                Scanner scanner = new Scanner(System.in);
                System.out.println("Nhập mã sản phẩm cần sữa");
                String maSanPham = scanner.nextLine();
                iProductService.edit(maSanPham);
                break;
            case 3:
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Nhập mã sản phẩm cần xóa");
                String maSanPham2 = scanner1.nextLine();
                iProductService.delete(maSanPham2);
                break;
            case 4:
                iProductService.disPlay();
                break;
            case 5:
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Nhập tên sản phẩm cần tìm kiếm");
                String tenSanPham1 = scanner2.nextLine();
                iProductService.search(tenSanPham1);
                break;
            case 6:
                break;
        }
    }
}
