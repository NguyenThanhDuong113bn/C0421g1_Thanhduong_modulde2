package _2_Vong_lap.thuc_hanh;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter number :");
        int number = scanner.nextInt();

        if (number < 2) {
            System.out.println(number + " is not a prime");

        } else {
            Boolean check = true;
            for (int i = 3; i < number; i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }

            if (check) {
                System.out.println(number + " is a prime");
            } else {
                System.out.println(number + " is not a prime");
            }

        }
    }
}



