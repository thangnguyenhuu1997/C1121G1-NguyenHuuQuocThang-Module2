package ss2_vong_lap_trong_java.bai_tap.HienThiSoNguyenToNhoHon100;

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
        for (int i = 2; i < 100; i++){
            boolean check = snt(i);
            if (check ){
                System.out.println(i);
            }
        }

    }
}
