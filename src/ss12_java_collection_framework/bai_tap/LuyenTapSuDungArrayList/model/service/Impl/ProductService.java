package ss12_java_collection_framework.bai_tap.LuyenTapSuDungArrayList.model.service.Impl;

import ss12_java_collection_framework.bai_tap.LuyenTapSuDungArrayList.model.model.Product;
import ss12_java_collection_framework.bai_tap.LuyenTapSuDungArrayList.model.service.IProductService;
import java.util.ArrayList;

import java.util.Scanner;

public class ProductService implements IProductService {
    Scanner scanner = new Scanner(System.in);
    static ArrayList<Product> products = new ArrayList<>();

    static {
        products.add(new Product("C00009", "Bánh Quy", 50.000));
        products.add(new Product("C00009", "Bánh Kẹo", 50.000));
        products.add(new Product("C00019", "Kẹo Ngọt", 49.000));
        products.add(new Product("C00020", "Bánh Chuối", 55.000));

    }

    @Override
    public void add() {
        Product product1 = new Product();
        System.out.println("nhập mã sản phẩm");
        product1.setMaSanPham(scanner.nextLine());
        System.out.println("nhập tên sản phẩm");
        product1.setTenSanPham(scanner.nextLine());
        System.out.println("nhập giá tiền của sản phẩm");
        product1.setGiaTien(Double.parseDouble(scanner.nextLine()));

        products.add(product1);
        disPlay();
    }
    @Override
    public void edit(String maSanPham) {
        for (int i = 0 ; i < products.size() ; i++){
            if (maSanPham.equals(products.get(i).getMaSanPham())){
                System.out.println("nhập mã sản phẩm");
                products.get(i).setMaSanPham(scanner.nextLine());
                System.out.println("nhập tên sản phẩm");
                products.get(i).setTenSanPham(scanner.nextLine());
                System.out.println("nhập giá tiền của sản phẩm");
                products.get(i).setGiaTien(Double.parseDouble(scanner.nextLine()));
                break;
            }
        }
        disPlay();
    }
    @Override
    public void delete(String maSanPham) {
        for (int i = 0 ; i < products.size() ; i++){
            if (maSanPham.equals(products.get(i).getMaSanPham())){
                products.remove(products.get(i));
            }
        }
        disPlay();

    }

    @Override
    public void disPlay() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    @Override
    public void search(String tenSanPham) {
        for (int i = 0 ; i < products.size() ; i++){
            if (products.get(i).getTenSanPham().contains(tenSanPham)){
                System.out.println(products.get(i));
            }
        }

    }
}
