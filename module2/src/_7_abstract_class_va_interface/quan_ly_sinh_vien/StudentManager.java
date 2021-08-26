package _7_abstract_class_va_interface.quan_ly_sinh_vien;

import _5_Access_modifier.thuc_hanh.bai1_StaticMethod.Students;

import java.util.Scanner;

public class StudentManager {
    public static Student[]studentList = new Student[4];

     static {
         studentList [0] = new Student(" Hai", 18);
         studentList[1]= new Student("Hoa", 17);
         studentList[2]= new Student("Ha",19);
     }
     public static void addStudent(){
         Scanner scanner = new Scanner(System.in);
         System.out.println(" Enter name:");
         String name = scanner.nextLine();
         System.out.println(" Enter age:");
         int age =Integer.parseInt(scanner.nextLine());

         for (int i=0; i <studentList.length;i++){
             if(studentList [i] == null){
                 studentList[i]= new Student(name, age);
                 break;
             }
         }

     }
     public static void displayStudent(){
         for (Student student: studentList){
             if (student !=null){
                 System.out.println(student);
             }
         }
     }
}
