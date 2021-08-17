package _2_Vong_lap.thuc_hanh;

import java.util.Scanner;

public class TinhTienLai {
    public static void main(String[] args) {
        double Money;
        int month = 1;
        double interesRate = 2.0;
        Scanner input  = new Scanner( System.in);

        System.out.println( " Enter investment a month : ");
        Money = input.nextDouble();
        System.out.println(" Enter number of month :");
        month = input.nextInt();
        System.out.println( " Enter annual interes rate in percentage :" );
        interesRate = input.nextDouble();

        double totalInterest = 0;
        for ( int i =0 ; i < month; i++){
            totalInterest += Money * (interesRate /100) /12 *month;
        }
        System.out.println(" totalInterest :"+ totalInterest);




    }
}
