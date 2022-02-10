package ss17_io_binary_file.bai_tap.QuanLySanPham.service;
import ss17_io_binary_file.bai_tap.QuanLySanPham.model.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductService implements IProductService {
    static ArrayList<Product> products = new ArrayList<>();
    static {
        products.add(new Product("A001", "Dream", "HonDa", 250000000, "năm 2021"));
        products.add(new Product("A002", "SH", "HonDa", 720000000, "năm 2021"));
        products.add(new Product("A003", "Vespa", "HonDa", 860000000, "năm 2021"));
    }
    Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        Product product = new Product();
        System.out.println("Mời bạn nhập mã sản phẩm ");
        product.setMaSanPham(scanner.nextLine());
        System.out.println("Mời bạn nhập tên sản phẩm");
        product.setTenSanPham(scanner.nextLine());
        System.out.println("Mời bạn nhập hãng sản xuất ");
        product.setHangSanXuat(scanner.nextLine());
        System.out.println("Mời bạn nhập giá sản phẩm");
        product.setGia(Double.parseDouble(scanner.nextLine()));
        System.out.println("Mời bạn nhập các mô tả khác");
        product.setCacMoTaKhac(scanner.nextLine());
        products.add(product);

    }

    @Override
    public void display() {
        for (Product product: products) {
            System.out.println(product);
        }
    }

    @Override
    public void search(String maSanPham) {
        for(int i=0;i<products.size();i++){
            if(products.get(i).getMaSanPham().equals(maSanPham)){
                System.out.println(products.get(i));
            }
        }
    }

    @Override
    public void exit() {

    }
}
