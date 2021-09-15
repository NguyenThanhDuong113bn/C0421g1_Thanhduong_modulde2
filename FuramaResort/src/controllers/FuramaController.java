package controllers;


import services.impl.*;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
        int count =0;
        while (count < 1){
            try {
                System.out.println( "Please enter your choice :\n " +
                        "1.\tEmployee Management\n" +
                        "2.\tCustomer Management\n" +
                        "3.\tFacility Management \n" +
                        "4.\tBooking Management\n" +
                        "5.\tPromotion Management\n" +
                        "6.\tExit\n");
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
                        break;
                    case 5:
                        PromotionServiceImpl.promotionService();
                        break;
                    case 6:
                        isExit();
                        break;
                    default:
                        System.err.println("There is no option");
                        break;
                }
            }catch (Exception e){
                System.out.println(" ban nhap ko dung ky tu");
            }

        }
    }

    private static void isExit() {
    }
}

//
////        ********************************************************
////        Scanner scanner = new Scanner(System.in);
////        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
////        CustomerServiceImpl customerService = new CustomerServiceImpl();
////        FacilityServiceImpl facilityService = new FacilityServiceImpl();
////        BookingServiceImpl bookingService = new BookingServiceImpl();
////        ContractServiceImpl contractService = new ContractServiceImpl();
////        PromotionServiceImpl promotionService = new PromotionServiceImpl();
//
////        int choice= -1;
////        while (choice != 6) {
////            System.out.println("\t Menu Furama \n");
////            System.out.println("\t1. Employee Management  ");
////            System.out.println("\t2. Customer Management  ");
////            System.out.println("\t3. Facility Management  ");
////            System.out.println("\t4. Booking Management  ");
////            System.out.println("\t5.  Promotion Management ");
////            System.out.println("\t6.  Exit ");
//////                    "Please enter your choice :\n " +
//////                    "1.\tEmployee Management\n" +
//////                    "2.\tCustomer Management\n" +
//////                    "3.\tFacility Management \n" +
//////                    "4.\tBooking Management\n" +
//////                    "5.\tPromotion Management\n" +
//////                    "6.\tExit\n");
////           choice = Integer.parseInt(scanner.nextLine());
////
////            switch (choice) {
////                case  1:
////                    while (choice != 4){
////                        System.out.println("Menu");
////                        System.out.println("\t1. Display list employees \n");
////                        System.out.println("\t2. Add new employees \n");
////                        System.out.println("\t3. Edit employees \n");
////                        System.out.println("\t4. Return main menu \n");
////                        System.out.println(" Enter your choice: ");
////                        choice = Integer.parseInt(scanner.nextLine());
////                        switch (choice){
////                            case 1:
////                                employeeService.display();
////                                break;
////                            case 2:
////                                employeeService.add();
////                                break;
////                            case 3:
////                                employeeService.edit();
////                                break;
////                            case 4:
////                                break;
////                        }
////                    }
////                    break;
////                case 2:
////                    while (choice != 4 ){
////                        System.out.println("Menu");
////                        System.out.println("\t1. Display list customers \n");
////                        System.out.println("\t2. Add new customers \n");
////                        System.out.println("\t3. Edit customers \n");
////                        System.out.println("\t4. Return main customers \n");
////                        System.out.println(" Enter your choice: ");
////                        choice = Integer.parseInt(scanner.nextLine());
////                        switch (choice){
////                            case 1:
////                                customerService.display();
////                                break;
////                            case  2:
////                                customerService.add();
////                                break;
////                            case 3:
////                                customerService.edit();
////                                break;
////                            case 4:
////                                break;
////                        }
////                    }
////                    break;
////                case 3:
////                    while (choice != 4){
////                        System.out.println("Menu");
////                        System.out.println("\t1. Display list facility \n");
////                        System.out.println("\t2. Add new facility \n");
////                        System.out.println("\t3. Edit facility maintenance \n");
////                        System.out.println("\t4. Return main menu \n");
////                        System.out.println(" Enter your choice: ");
////                        choice = Integer.parseInt(scanner.nextLine());
////                        switch (choice){
////                            case 1:
////                                facilityService.display();
////                                break;
////                            case  2:
////                                facilityService.add();
////                                break;
////                            case 3:
////                                facilityService.edit();
////                                break;
////                            case 4:
////                                break;
////                        }
////                    }
////                    break;
////                case 4:
////                    int choiceBooking = -1 ;
////                    while (choiceBooking != 6){
////                        System.out.println("Menu");
////                        System.out.println("\t1. Add new booking ");
////                        System.out.println("\t2.Display list booking  \n");
////                        System.out.println("\t3. Create new contracts \n");
////                        System.out.println("\t4. Display list contracts \n");
////                        System.out.println("\t5. Edit contracts");
////                        System.out.println("\t6. Return main menu \n");
////                        System.out.println(" Enter your choice: ");
////                        choiceBooking = Integer.parseInt(scanner.nextLine());
////                        switch (choiceBooking){
////                            case  1:
////                                bookingService.add();
////                                break;
////                            case  2:
////                                bookingService.display();
////                                break;
////                            case 3:
////                                contractService.add();
////                                break;
////                            case 4:
////                                contractService.display();
////                                break;
////                            case 5:
////                                contractService.edit();
////                                break;
////                        }
////                    }
////                    break;
////                case 5:
////                    while (choice != 3){
////                        System.out.println("Menu");
////                        System.out.println("\t1. Display list customers use service \n");
////                        System.out.println("\t2.Display list customers get voucher  \n");
////                        System.out.println("\t3. Return main menu \n");
////                        System.out.println(" Enter your choice :");
////                        choice = Integer.parseInt(scanner.nextLine());
////                    }
////                    break;
////                case  6:
////                    System.exit(0);
////                default:
////                    System.out.println("No choice");
////            }
////        }
//    }




