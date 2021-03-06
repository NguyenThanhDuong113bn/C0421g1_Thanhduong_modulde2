package _15_xu_ly_ngoai_le_va_amp_debug.thuc_hanh.bai1_debug_ung_dung_java;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as ' a * x + b = 0', please enter constants");

        Scanner scanner = new Scanner(System.in);

        System.out.println("a:");
        double a= scanner.nextDouble();

        System.out.println("b:");
        double b = scanner.nextDouble();

        if (a != 0) {
            double solution = -b / a;
            System.out.printf("The solution is: %f!", solution);
        } else {
            if (b == 0) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }
}
