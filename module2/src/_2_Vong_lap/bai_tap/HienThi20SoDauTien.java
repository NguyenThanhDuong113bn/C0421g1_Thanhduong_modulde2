package _2_Vong_lap.bai_tap;

import java.util.Scanner;

public class HienThi20SoDauTien {
    public static void main(String[] args) {
        int count = 0, num = 2;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhap vao so nguyen to :");
        int number = scanner.nextInt();
        boolean check = false;
        while ( count <number) {
            for ( int i = 2 ; i <= Math.sqrt(num );i++){
                check = false;
                if ( num % i ==0){
                    check = true ;
                    break;
                }
            } if ( ! check) {
                System.out.println( num + " La so nguyen to");
                count ++;
            }
             num ++;

        }



    }
}
