package controllers;

import java.util.Scanner;

public class ManagerFacility {
    public static void facilityManagement() {
        int count = 0;
        while (count < 1) {
            System.out.println("Ứng dụng quản lý khu nghỉ dưỡng Furama\n" +
                    "Please enter your choice :\n " +
                    "1.\tDisplay list facility\n" +
                    "2.\tAdd new facility\n" +
                    "3.\tDisplay list facility maintenance \n" +
                    "4.\tReturn main menu\n");

            Scanner scanner = new Scanner(System.in);
            int chooseService = Integer.parseInt(scanner.nextLine());
            switch (chooseService) {
                case 1:
//                   ManagerService.displayEmployee();
                    break;
                case 2:
                    ManagerCustomer.customerManagement();
                    break;
                case 3:
                    ManagerFacility.facilityManagement();
                    break;
                case 4:
                    ManagerBooking.bookingManagerment();

            }
        }
    }
}
