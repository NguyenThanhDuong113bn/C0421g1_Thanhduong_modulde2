package services.impl;

import controllers.FuramaController;
import models.House;
import models.Villa;
import utils.FuncWriteRead;
import utils.ValidateFacility;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FacilityServiceImpl {

    public static Scanner scanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }
    public static void facilityManagement  (){
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count < 1) {
            System.out.println(  "Please enter your choice :\n " +
                    "1.\tDisplay list facility\n" +
                    "2.\tAdd new facility\n" +
                    "3.\tDisplay list facility maintenance \n" +
                    "4.\tReturn main menu\n");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    displayListFacility();
                    break;
                case 2:
                    addNewFacility();
                    break;
                case 3:
                    //
                    break;
                case 4:
                    FuramaController.displayMainMenu();
            }
        }
    }

    private static void displayListFacility() {
    }

    private static void addNewFacility() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count < 1){
            System.out.println("Please enter your choice :\n " +
                    "1.\t Add New Villa \n" +
                    "2.\t Add New House \n" +
                    "3.\t Add New Room \n" +
                    "4.\tReturn menu\n");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    addVilla();
                    count++;
                    break;
                case 2:
                    addHouse();
                    count++;
                    break;
                case 3:
                    addRoom();
                    count++;
                    break;
                case 4:
                    FuramaController.displayMainMenu();


            }
        }

    }

    private static void addVilla() {
        Scanner scanner = new Scanner(System.in);
        String id = null;
                do{
                    System.out.println("Nhập id dịch vụ");
                    id = scanner.nextLine();
                    ValidateFacility validate = new ValidateFacility();

                    if (!validate.validateId(id)){
                        System.out.println("Lỗi!! Nhập lại");
                        continue;
                    }
                    break;
                } while (true);

        String serviceName = null;
        do {
            System.out.println("Tên dịch vụ");
            serviceName = scanner.nextLine();
            ValidateFacility validate = new ValidateFacility();

            if (!validate.validateServiceName(serviceName)) {
                System.err.println("LỖI: Định dạng Tên Dịch Vụ không hợp lệ");
                continue;
            }
            break;
        }while (true);

        String areUse = null;
        do {
            System.out.println("Diện tích sử dụng (m2)");
            areUse  =scanner.nextLine();
            ValidateFacility validate =new ValidateFacility();
            if (!validate.validateArea(areUse )){
                System.err.println("Lỗi! Diện tích sử dụng phải lớn hơn 30(m2)");
                continue;
            }
            break;
        }while (true);

        String rentalCost = null;
        do {
            System.out.println("Nhập chi phí thuê");
            rentalCost = scanner.nextLine();
            ValidateFacility validate =new ValidateFacility();
            if (!validate.validatePrice(rentalCost)){
                System.err.println(" Lỗi ! Giá tiền không hợp lệ");
                continue;
            }
            break;
        }while (true);

        String numberOfPeople=null;
        do {
            System.out.println("Số người tối đa");
            numberOfPeople = scanner.nextLine();
            ValidateFacility validate = new ValidateFacility();
            if (!validate.validateMaxPeople(numberOfPeople)){
                System.err.println("Lỗi! Số người tối đa phải lơn hơn 0 và nhỏ hơn 20");
                continue;
            }
            break;
        }while (true);

        String rentalType = null;
        do {
            System.out.println(" Nhập kiểu thuê");
            rentalType = scanner.nextLine();
            ValidateFacility validate = new ValidateFacility();
            if (!validate.validateRentalType(rentalType)){
                System.err.println("Lỗi !! Kieur thuê không hợp lệ");
                continue;
            }
            break;
        }while (true);

        String standarRoom= null;
        do {
            System.out.println("Nhập tiêu chuẩn phòng");
            standarRoom= scanner.nextLine();
            ValidateFacility validate = new ValidateFacility();
            if (!validate.validateRoomStandard(standarRoom)){
                System.err.println("Lỗi !! Định dạng phòng không hợp lệ");
                continue;
            }
            break;
        }while (true);

        String areaPool = null;
        do {
            System.out.println("Diện tích hồ bơi (m2)");
            areaPool = scanner.nextLine();
            ValidateFacility validate = new ValidateFacility();
            if (!validate.validateSwimmingPool(areaPool)){
                System.err.println("Lỗi ! Diện tích hồ phải lớn hơn 30(m2) ");
                continue;
            }
            break;
        }while (true);

        String numberOfFloors = null;
        do {
            System.out.println("Số tầng");
            numberOfFloors = scanner.nextLine();
            ValidateFacility validate = new ValidateFacility();
            if (!validate.validateFloors(numberOfFloors)){
                System.err.println("Lỗi!! Số tầng phải lớn hơn 0");
                continue;
            }
            break;
        }while (true);
        System.out.println("Ok");
//        String id, String servicesName, double areUse, double rentalCost, int numberOfPeople,
//        String rentalType, String standarRoom, double areaPool, int numberOfFloors)
        Villa  villa = new Villa(id ,serviceName , areUse ,rentalCost, numberOfPeople,rentalType,
                standarRoom, areaPool,numberOfFloors);
        List<Villa> villaList = new ArrayList<>();
        villaList.add(villa);
        FuncWriteRead.writeVillaCSV(villaList);


    }

    private static void addHouse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id dịch vụ");
        String id =scanner.nextLine();
        System.out.println(" Nhập tên dịch vụ" );
        String serviceName = scanner.nextLine();
        System.out.println("Nhập diện tích sử dụng");
        String areUse = scanner.nextLine();
        System.out.println("Nhập chi phí thuê");
        String rentalCost =scanner.nextLine();
        System.out.println("Nhâp số người tối đa");
        String numberOfPeople = scanner.nextLine();
        System.out.println("Nhập kiểu thuê");
        String rentalType = scanner.nextLine();
        System.out.println("Nhập tiêu chuẩn phòng");
        String standardRoom = scanner.nextLine();
        System.out.println(" Nhập số tầng ");
        String  numberOfFloors = scanner.nextLine();
        System.out.println("Ok");
//        (String id, String servicesName, String areUse, String rentalCost, String numberOfPeople,
//                String rentalType, String standardRoom, String numberOfFloors)
        House house = new House(id, serviceName, areUse, rentalCost,numberOfPeople,rentalType,
                standardRoom,numberOfFloors);
        List<House> houseList =new ArrayList<>();
        houseList.add(house);
        FuncWriteRead.writeHouseCSV(houseList);

    }

    private static void addRoom() {
    }

    public static void facilityService(){
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count < 1) {
            System.out.println(" Please enter your choice :\n" +
                    "1.\t Show all Villa \n" +
                    "2.\t Show all House \n" +
                    "3.\t Show all Room \n" +
                    "4.\t Back to Menu \n");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    showAllVilla();
                    count++;
                    break;
                case 2:
                    showAllHouse();
                    count++;
                    break;
                case 3:
                    showAllRoom();
                    count++;
                    break;
               //back to menu
                default:
                    count++;
                    System.out.println("There is no option");
                    break;
            }
        }
    }

    private static void showAllRoom() {
    }

    private static void showAllHouse () {
        List<House> list = FuncWriteRead.readHouseCSV();
        for (House house : list){
            System.out.println(house.toString());
        }
    }

    private static void showAllVilla(){
        List<Villa> list =FuncWriteRead.readVillaCSV();
        for (Villa villa : list){
            System.out.println(villa.toString());
        }
    }

   {
    }
}



