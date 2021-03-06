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
                    System.out.println("Nh???p id d???ch v???");
                    id = scanner.nextLine();
                    ValidateFacility validate = new ValidateFacility();

                    if (!validate.validateId(id)){
                        System.out.println("L???i!! Nh???p l???i");
                        continue;
                    }
                    break;
                } while (true);

        String serviceName = null;
        do {
            System.out.println("T??n d???ch v???");
            serviceName = scanner.nextLine();
            ValidateFacility validate = new ValidateFacility();

            if (!validate.validateServiceName(serviceName)) {
                System.err.println("L???I: ?????nh d???ng T??n D???ch V??? kh??ng h???p l???");
                continue;
            }
            break;
        }while (true);

        String areUse = null;
        do {
            System.out.println("Di???n t??ch s??? d???ng (m2)");
            areUse  =scanner.nextLine();
            ValidateFacility validate =new ValidateFacility();
            if (!validate.validateArea(areUse )){
                System.err.println("L???i! Di???n t??ch s??? d???ng ph???i l???n h??n 30(m2)");
                continue;
            }
            break;
        }while (true);

        String rentalCost = null;
        do {
            System.out.println("Nh???p chi ph?? thu??");
            rentalCost = scanner.nextLine();
            ValidateFacility validate =new ValidateFacility();
            if (!validate.validatePrice(rentalCost)){
                System.err.println(" L???i ! Gi?? ti???n kh??ng h???p l???");
                continue;
            }
            break;
        }while (true);

        String numberOfPeople=null;
        do {
            System.out.println("S??? ng?????i t???i ??a");
            numberOfPeople = scanner.nextLine();
            ValidateFacility validate = new ValidateFacility();
            if (!validate.validateMaxPeople(numberOfPeople)){
                System.err.println("L???i! S??? ng?????i t???i ??a ph???i l??n h??n 0 v?? nh??? h??n 20");
                continue;
            }
            break;
        }while (true);

        String rentalType = null;
        do {
            System.out.println(" Nh???p ki???u thu??");
            rentalType = scanner.nextLine();
            ValidateFacility validate = new ValidateFacility();
            if (!validate.validateRentalType(rentalType)){
                System.err.println("L???i !! Kieur thu?? kh??ng h???p l???");
                continue;
            }
            break;
        }while (true);

        String standarRoom= null;
        do {
            System.out.println("Nh???p ti??u chu???n ph??ng");
            standarRoom= scanner.nextLine();
            ValidateFacility validate = new ValidateFacility();
            if (!validate.validateRoomStandard(standarRoom)){
                System.err.println("L???i !! ?????nh d???ng ph??ng kh??ng h???p l???");
                continue;
            }
            break;
        }while (true);

        String areaPool = null;
        do {
            System.out.println("Di???n t??ch h??? b??i (m2)");
            areaPool = scanner.nextLine();
            ValidateFacility validate = new ValidateFacility();
            if (!validate.validateSwimmingPool(areaPool)){
                System.err.println("L???i ! Di???n t??ch h??? ph???i l???n h??n 30(m2) ");
                continue;
            }
            break;
        }while (true);

        String numberOfFloors = null;
        do {
            System.out.println("S??? t???ng");
            numberOfFloors = scanner.nextLine();
            ValidateFacility validate = new ValidateFacility();
            if (!validate.validateFloors(numberOfFloors)){
                System.err.println("L???i!! S??? t???ng ph???i l???n h??n 0");
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
        System.out.println("Nh???p id d???ch v???");
        String id =scanner.nextLine();
        System.out.println(" Nh???p t??n d???ch v???" );
        String serviceName = scanner.nextLine();
        System.out.println("Nh???p di???n t??ch s??? d???ng");
        String areUse = scanner.nextLine();
        System.out.println("Nh???p chi ph?? thu??");
        String rentalCost =scanner.nextLine();
        System.out.println("Nh??p s??? ng?????i t???i ??a");
        String numberOfPeople = scanner.nextLine();
        System.out.println("Nh???p ki???u thu??");
        String rentalType = scanner.nextLine();
        System.out.println("Nh???p ti??u chu???n ph??ng");
        String standardRoom = scanner.nextLine();
        System.out.println(" Nh???p s??? t???ng ");
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



