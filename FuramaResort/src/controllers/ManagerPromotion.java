package controllers;

import java.util.Scanner;

public class ManagerPromotion {
    public static void promotionManagerment() {
        int count = 0;
        while (count < 1) {
            System.out.println("Ứng dụng quản lý khu nghỉ dưỡng Furama\n" +
                    "Please enter your choice :\n " +
                    "1.\tDisplay list customers\n" +
                    "2.\tAdd new customer\n" +
                    "3.\ttEdit customer \n" +
                    "4.\tReturn main menu\n");

            Scanner scanner = new Scanner(System.in);
            int chooseService = Integer.parseInt(scanner.nextLine());
            switch (chooseService) {
                case 1:
                    ManagerService.employeeManagement();
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
