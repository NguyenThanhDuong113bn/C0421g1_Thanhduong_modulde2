package controllers;

import java.util.Scanner;

public class ManagerBooking {
    public static void bookingManagerment() {
        int count = 0;
        while (count < 1) {
            System.out.println("Ứng dụng quản lý khu nghỉ dưỡng Furama\n" +
                    "Please enter your choice :\n " +
                    "1.\tAdd new booking\n" +
                    "2.\tDisplay list booking\n" +
                    "3.\tCreate new constracts \n" +
                    "4.\tDisplay list contracts\n"+
                    "5.\tEdit contracts\n"+
                    "6.\tReturn main menu\n");

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
