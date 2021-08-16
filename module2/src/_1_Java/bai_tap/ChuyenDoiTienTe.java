package _1_Java.bai_tap;

import sun.font.DelegatingShape;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
       final int Rate = 23000;
        float Vnd, Usd;
        Scanner scanner = new Scanner( System.in);
        System.out.println(" Enter : 1. Vnd change Usd or 2. Usd change Vnd");
        int a ;
        a = scanner.nextInt();
        if (a==1) {
            System.out.println(" Enter money number");
            int vnd = scanner.nextInt();
            int usd = vnd / Rate;
            System.out.println(" Enter is Usd: " + usd);
        }
            else if (a==2){
            System.out.println(" Enter money number ");
            int usd = scanner.nextInt();
            int vnd = usd * Rate;
            System.out.println( " Enter is Vnd :"+ vnd);




        }


    }
}
