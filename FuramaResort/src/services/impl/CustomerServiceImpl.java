package services.impl;

import controllers.FuramaController;
import models.Customer;
import models.CustomerType;
import utils.FuncWriteRead;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl {

        public static Scanner scanner() {
            Scanner scanner = new Scanner(System.in);
            return scanner;
        }
    public static void customerService() {
            Scanner scanner = new Scanner(System.in);
            int count = 0;
            while (count < 1) {
                System.out.println("Ứng dụng quản lý khu nghỉ dưỡng Furama\n" +
                        "Please enter your choice :\n " +
                        "1.\tDisplay list customers\n" +
                        "2.\tAdd new customer\n" +
                        "3.\ttEdit customer \n" +
                        "4.\tReturn main menu\n");
                int chooseService = Integer.parseInt(scanner.nextLine());
                switch (chooseService) {
                    case 1:
                        displayLisCustomer();
                        break;
                    case 2:
                        addNewCustomer();
                        break;
                    case 3:
                            //
                        break;
                    case 4:
                        FuramaController.displayMainMenu();



                }

            }
        }

    private static void addNewCustomer() {
        System.out.println("Nhập mã KH");
        String idOfCustomer = scanner().nextLine();
        System.out.println("Nhập họ tên KH");
        String fullName = scanner().nextLine();
        System.out.println(" Nhập ngày sinh KH");
        String dateOfBirth = scanner().nextLine();
        System.out.println(" Nhập giới tính KH");
        String gender = scanner().nextLine();
        System.out.println(" Nhập số CMND KH");
        String identityCardNumber = scanner().nextLine();
        System.out.println(" Nhập số điện thoại KH");
        String phoneNumber = scanner().nextLine();
        System.out.println(" Nhập email KH");
        String email = scanner().nextLine();
        System.out.println("Nhập loại KH");
        String customerType = scanner().nextLine();
        System.out.println("Nhập địa chỉ KH");
        String addressOfCustomer = scanner().nextLine();
//
//        String fullName, String dateOfBirth, String gender, String identityCardNumber,
//                String phoneNumber, String email, String idOfCustomer, CustomerType customerType,
//                String addressOfCustomer)
        Customer customer =new Customer(fullName, dateOfBirth,gender,identityCardNumber,phoneNumber,email,idOfCustomer,
                customerType,addressOfCustomer);
        List<Customer> list = new ArrayList<>();
        list.add(customer);
        FuncWriteRead.writeCustomerCSV(list);

    }

    private static void displayLisCustomer() {
            List<Customer> list = FuncWriteRead.readCustomerCSV();
            for ( Customer customer : list) {
                System.out.println(customer.toString());
            }
    }


}

