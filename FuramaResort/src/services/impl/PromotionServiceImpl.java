package services.impl;

import java.util.Scanner;

public class PromotionServiceImpl {
    public static void promotionService() {
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
                    EmployeeServiceImpl.employeeService();
                    break;
                case 2:
                    CustomerServiceImpl.customerService();
                    break;
                case 3:
                    FacilityServiceImpl.facilityService();
                    break;
                case 4:
                    BookingServiceImpl.bookingService();

            }
        }
    }


}
