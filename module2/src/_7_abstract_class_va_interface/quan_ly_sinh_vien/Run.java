package _7_abstract_class_va_interface.quan_ly_sinh_vien;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
       while (true){
           System.out.println(" Chon chuc nang:\n" + "1.Add \n" + "2.Show\n" + "3.Exit");
           System.out.println("Chon");
           Scanner scanner = new Scanner(System.in);
          int choice = Integer.parseInt(scanner.nextLine());
          switch (choice){
              case 1:
                  StudentManager.addStudent();
                  break;
              case 2:
                  StudentManager.displayStudent();
                  break;
          }
       }
    }

}
