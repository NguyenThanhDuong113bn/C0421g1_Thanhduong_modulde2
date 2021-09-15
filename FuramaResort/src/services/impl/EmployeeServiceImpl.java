package services.impl;

import controllers.FuramaController;
import models.Employee;
import services.IEmployeeService;
import utils.FuncWriteRead;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl  {


    private static Scanner scanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }
    public static void employeeService(){

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
                    EmployeeServiceImpl.displayEmployee();
                    break;
                case 2:
                    EmployeeServiceImpl.addNewEmployee();
                    break;
                case 3:
                   EmployeeServiceImpl.editEmployee();
                    break;
                case 4:
                 FuramaController.displayMainMenu();


            }


        }
    }



    private static void addNewEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Ma NV:");
        String employeeCode = scanner().nextLine();
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
        System.out.println("Nhap loai NV:");
        String guestType = scanner().nextLine();
        System.out.println("Nhap trinh do hoc van:");
        String educationLevel = scanner().nextLine();
        System.out.println("Nhap chuc vu :");
        String position = scanner().nextLine();
        System.out.println("Nhập email ");
        String email = scanner.nextLine();
        System.out.println(" Nhập lương");
        String wage =scanner.nextLine(); // wage:lương
//        String fullName, String dateOfBirth, String gender, String identityCardNumber, String phoneNumber, String email,
//                String employeeCode, String wage, String educationLevel, String position
        Employee employee = new Employee(fullName, dateOfBirth, gender, identityCardNumber, phoneNumber,
           email,employeeCode,wage,educationLevel,position);
        List<Employee> list = new ArrayList<>();
        list.add(employee);
        FuncWriteRead.writeEmployeeCSV(list);
    }



    public static void displayEmployee() {
        List<Employee> list =FuncWriteRead.readEmployeeCSV();
        for (Employee employee : list){
            System.out.println(employee.toString());
        }


    }
    private static void editEmployee() {
    }

    {
    }
}
