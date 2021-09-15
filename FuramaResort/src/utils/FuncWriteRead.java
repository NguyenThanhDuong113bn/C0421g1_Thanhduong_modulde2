package utils;

import com.sun.deploy.net.MessageHeader;
import models.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FuncWriteRead {


    List<Person> readFileToList() {
        List<Person> list = new ArrayList<>();
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream("");
            objectInputStream = new ObjectInputStream(fileInputStream);
            Object object = null;
            while ((object = objectInputStream.readObject()) != null) {
                Person person = (Person) object;
                list.add(person);
            }
            fileInputStream.close();
            objectInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Lỗi File");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Lỗi File");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }
    void writeListProductToFile(List<Person> list) {
        list.addAll(readFileToList());
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            for (Person person : list) {
                objectOutputStream.writeObject(person);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Lỗi File");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Lỗi");
        }
    }
    // ghi file Employee
    public static void writeEmployeeCSV(List<Employee> employeeList) {
        FileWriter fileWriter =null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter("src/data/employee.csv");
            bufferedWriter = new BufferedWriter(fileWriter);

//            ullName, int dateOfBirth, String gender, int identityCardNumber, int phoneNumber,
//            String email, String employeeCode, int wage, int educationLevel, int position
            for (Employee employee : employeeList) {
                bufferedWriter.write(employee.getFullName() + "," + employee.getDateOfBirth() + "," + employee.getGender() + "," +
                        employee.getIdentityCardNumber() + "," + employee.getPhoneNumber() + "," + employee.getEmail() + "," + employee.getEmployeeCode() + "," +
                        employee.getWage() + "," + employee.getEducationLevel() + "," + employee.getPosition());
            }

            bufferedWriter.write("\n");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // doc file employee
    public static List<Employee> readEmployeeCSV() {
        List<Employee> employeeList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("src/data/employee.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] arr = null;
            Employee employee = null;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                employee = new Employee(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8], arr[9]);
                employeeList.add(employee);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employeeList;
    }
    // ghi file customer
    public static void writeCustomerCSV(List<Customer> customerList) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter("src/data/customer.csv");
            bufferedWriter = new BufferedWriter(fileWriter);
//
//            (String fullName, String dateOfBirth, String gender, String identityCardNumber,
//                    String phoneNumber, String email, String idOfCustomer, String customerType,
//                    String addressOfCustomer)
            for (Customer customer :customerList){
                bufferedWriter.write(customer.getFullName()+ "," +customer.getDateOfBirth()+","+customer.getGender()+","
                        +customer.getIdentityCardNumber() +"," +customer.getPhoneNumber()+","+customer.getEmail()+","
                +customer.getIdOfCustomer()+","+customer.getCustomerType()+","+customer.getAddressOfCustomer());
                bufferedWriter.write("");
                bufferedWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // doc file customer
    public static List<Customer> readCustomerCSV(){
        List<Customer> customerList = new ArrayList<>();
       FileReader fileReader= null;
       BufferedReader bufferedReader = null;
       try {
           fileReader = new FileReader("src/data/customer.csv");
           bufferedReader= new BufferedReader(fileReader);
           String line = null;
           String[] arr =null;
           Customer customer = null;
           while ((line = bufferedReader.readLine()) != null){
               arr =line.split(",");
               customer = new Customer(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8]);
               customerList.add(customer);
           }
           bufferedReader.close();

       } catch (IOException e) {
           e.printStackTrace();
       }
       return customerList;
    }

//ghi file villa
    public static void writeVillaCSV(List<Villa> villaList) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter =null;
        try {
            fileWriter =new FileWriter("src/data/villa.csv");
            bufferedWriter =new BufferedWriter(fileWriter);
//            id, serviceName, areUse, rentalCost,numberOfPeople,rentalType,
//                    standardRoom,numberOfFloors)
            for (Villa villa : villaList){
                bufferedWriter.write(villa.getId()+ "," + villa.getServicesName() +"," +villa.getAreUse()
                +","+villa.getRentalCost()+","+villa.getNumberOfPeople()+","+villa.getRentalType()
                +","+ villa.getStandardRoom()+"," +villa.getNumberOfFloors());
            }
            bufferedWriter.write("\n");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    // doc file villa

    public static List<Villa> readVillaCSV() {
        List<Villa> villaList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader=null;
        try {
            fileReader = new FileReader("src/data/villa.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] arr = null;
            Villa villa = null;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                villa = new Villa(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8]);
                villaList.add(villa);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return villaList;
    }

    //ghi file house

    public static void writeHouseCSV(List<House> houseList) {
        FileWriter fileWriter =null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter =new FileWriter("src/data/house.csv");
            bufferedWriter =new BufferedWriter(fileWriter);
//            (String id, String servicesName, String areUse, String rentalCost, String numberOfPeople,
//                    String rentalType, String standardRoom, String numberOfFloors)
            for (House house: houseList){
                bufferedWriter.write(house.getId() +","+house.getServicesName()+","+house.getAreUse()
                +","+house.getRentalCost()+","+house.getNumberOfPeople()+","+house.getRentalType()
                +","+house.getStandardRoom()+","+house.getNumberOfFloors());
            }
            bufferedWriter.write("\n");
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // doc file house
    public static List<House> readHouseCSV() {
        List<House>houseList =new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader= new FileReader("src/data/house.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] arr= null;
            House house = null;
            while ((line = bufferedReader.readLine())!= null){
                arr =line.split(",");
                house = new House(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7]);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  houseList;
    }
}
