package ss1_introducing_to_java.bai_tap.DocSoThanhChu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int num;
        System.out.println("Nhập số cần đọc: ");
        num = scanner.nextInt();
        switch (num){
            case 1:
                System.out.println("Một");
                break;
            case 2:
                System.out.println("Hai");
                break;
            case 3:
                System.out.println("Ba");
                break;
            case 4:
                System.out.println("Bốn");
                break;
            case 5:
                System.out.println("Năm");
                break;
            case 6:
                System.out.println("Sáu");
                break;
            case 7:
                System.out.println("Bảy");
                break;
            case 8:
                System.out.println("Tám");
                break;
            case 9:
                System.out.println("Chín");
                break;
            case 10:
                System.out.println("Mười");
                break;
            default:
                System.out.println("Không in được");
        }
    }
}
