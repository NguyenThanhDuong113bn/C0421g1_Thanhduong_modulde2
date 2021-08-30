package controllers;

import models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerService {
    private static Scanner scanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }
    public static void employeeManagement() {

        int count = 0;
        while (count < 1) {
            System.out.println("Ứng dụng quản lý khu nghỉ dưỡng Furama\n" +
                    "Please enter your choice :\n " +
                    "1.\tDisplay list employees\n" +
                    "2.\tAdd new employee\n" +
                    "3.\ttEdit employee \n" +
                    "4.\tReturn main menu\n");

            Scanner scanner = new Scanner(System.in);
            int chooseService = Integer.parseInt(scanner.nextLine());
            switch (chooseService) {
                case 1:
                    ManagerService.displayEmployee();
                    break;
                case 2:
                    ManagerService.addNewEmployee();
                    break;
                case 3:
                   ManagerService.editEmployee();
                    break;
                case 4:
                 FuramaController.displayMainMenu();


            }


        }
    }



    private static void addNewEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Ma NV:");
        String idOfEmployee = scanner().nextLine();
        System.out.println("Nhap Ho Ten NV:");
        String fullName = scanner().nextLine();
        System.out.println("Nhap Ngay Sinh NV:");
        String dateOfBirth = scanner().nextLine();
        System.out.println("Nhap Gioi Tinh NV:");
        String gender = scanner().nextLine();
        System.out.println("Nhap so CMND NV:");
        String identityCardNumber = scanner().nextLine();
        System.out.println("Nhap sdt:");
        String phoneNumber = scanner().nextLine();
        System.out.println("Nhap :");
        String guestType = scanner().nextLine();
        System.out.println("Nhap sdt:");
        String educatinLevel = scanner().nextLine();
        System.out.println("Nhap :");
        String position = scanner().nextLine();


        Employee employee = new Employee(fullName, dateOfBirth, gender, identityCardNumber, phoneNumber,
                guestType,idOfEmployee,educatinLevel,position);
        List<Employee> list = new ArrayList<>();
        list.add(employee);
    }



    public static void displayEmployee() {

    }
    private static void editEmployee() {
    }
}
