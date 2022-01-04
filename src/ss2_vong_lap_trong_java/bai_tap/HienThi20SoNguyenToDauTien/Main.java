package ss2_vong_lap_trong_java.bai_tap.HienThi20SoNguyenToDauTien;

import java.util.Scanner;

public class Main {
    public static boolean snt(int n ){
        if (n < 2 ){
            return false ;
        }
        for (int i = 2 ; i < n; i++){
            if ( n % i == 0){
                return false ;
            }
        }
        return true ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố ");
        int count = 0 ;
        int n = 2 ;
        int numBer = sc.nextInt();
        while (count < numBer){
            if (snt(n)){
                System.out.println(n);
                count++;
            }
            n++;
        }
    }
}
