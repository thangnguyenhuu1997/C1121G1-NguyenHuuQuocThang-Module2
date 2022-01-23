package ss14_thuat_toan_sap_xep.bai_tap.MinhHoaThuatToanSapXepChen;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter list size : ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Nhập " + list.length + " phần tử :");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.println("List nhập vào là: ");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + "\t");
        }
        System.out.println("Sort Start : ");
        insersionSort(list);

    }
    public static void insersionSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int x = list[i];
            int index = i;
            while (index > 0 && x < list[index - 1]) {
                list[index] = list[index - 1];
                index--;
                System.out.println("Dịch chuyển phần tử : " + list[index]);
            }
            if (index!=i) {
                System.out.println("chèn phần tử " + x +"tại vị trí " + index);
                list[index] = x;
            }
        }
        for (int j = 0; j < list.length; j++) {
            System.out.print(list[j] + "\t");
        }
        System.out.println();
    }
}
