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
    // doc file Employee
    public static void writeEmployeeCSV(List<Employee> employeeList) {
        FileWriter fileWriter =null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter("src/data/employee.csv");
            bufferedWriter = new BufferedWriter(fileWriter);


            for (Employee employee : employeeList) {
                bufferedWriter.write(employee.getEmployeeCode() + "," + employee.getFullName() + "," + employee.getDateOfBirth() + "," +
                        employee.getGender() + "," + employee.getIdentityCardNumber() + "," + employee.getPhoneNumber() + "," + employee.getEmail() + "," +
                        employee.getEducationLevel() + "," + employee.getPosition() + "," + employee.getWage());
            }

            bufferedWriter.write("\n");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // Ghi file employee
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
    // doc file customer
    public static void writeCustomerCSV(List<Customer> customerList) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter("src/data/customer.csv");
            bufferedWriter = new BufferedWriter(fileWriter);

            for (Customer customer :customerList){
                bufferedWriter.write(customer.getIdOfCustomer()+ "," +customer.getFullName()+","+customer.getDateOfBirth()+","
                        +customer.getGender() +"," +customer.getIdentityCardNumber()+","+customer.getPhoneNumber()+","
                +customer.getEmail()+","+customer.getCustomerType()+","+customer.getAddressOfCustomer());
                bufferedWriter.write("");
                bufferedWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // ghi file customer
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


    public static void writeVillaCSV(List<Villa> villaList) {
    }

    public static List<Villa> readVillaCSV() {
        return null;
    }

    public static List<House> readHouseCSV() {
        return  null;
    }

    public static void writeHouseCSV(List<House> houseList) {
    }
}
