package ss12_java_collection_framework.bai_tap.LuyenTapSuDungArrayList.model.service;

public interface IProductService {
    void add();
    void edit(String maSanPham);
    void delete(String maSanPham);
    void disPlay();
    void search(String tenSanPham);
    void writeFile();
    void readFile();
}
