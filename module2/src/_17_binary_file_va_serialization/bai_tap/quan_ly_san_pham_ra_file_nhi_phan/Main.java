package _17_binary_file_va_serialization.bai_tap.quan_ly_san_pham_ra_file_nhi_phan;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<ListCar> listCars1= new ArrayList<>();

        listCars1.add(new ListCar("1", "mazda2", "Mazda", "650,000,000"));
        listCars1.add(new ListCar("2", "camry", "Toyota", "1,1000,000"));
        listCars1.add(new ListCar("3", "lamboAvendator", "Lamboghini", "4,000,000,000"));
        listCars1.add(new ListCar("4", "ferari", "Ferari", "3,500,000,000"));
        listCars1.add(new ListCar("5", "bmw-i10", "BMW", "3,000,000,000"));

//        System.out.println("Danh sách xe: " + listCars1);
        while (true) {
            System.out.println("1.Add new product"
                    + "\n2.Show product"
                    + "\n3.Find product by ID"
                    + "\n4.Exit");
            Scanner input;
            input = new Scanner(System.in);
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    Product.add((ArrayList<ListCar>) listCars1);
                    break;
                case 2:
                    Product.display((ArrayList<ListCar>) listCars1);
                    break;
                case 3:
                    Product.search((ArrayList<ListCar>) listCars1);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong input please try again!");
            }
        }
    }
}
