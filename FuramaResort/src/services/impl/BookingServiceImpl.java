package services.impl;

import controllers.FuramaController;
import services.IBookingService;

import java.util.Scanner;

public class BookingServiceImpl implements IBookingService {
    public static void bookingService(){
        Scanner scanner = new Scanner(System.in);
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

            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    EmployeeServiceImpl.employeeService();
                    break;
                case 2:
                    CustomerServiceImpl.customerService();
                    break;
                case 3:
                    FacilityServiceImpl.facilityManagement();
                    break;
                case 4:
                    BookingServiceImpl.bookingService();
                case 5:
                    //
                    break;
                case 6:
                    FuramaController.displayMainMenu();

            }
        }
    }

    {
    }

    @Override
    public void addList() {

    }

    @Override
    public void displayList() {

    }

    @Override
    public void editList() {

    }
}
