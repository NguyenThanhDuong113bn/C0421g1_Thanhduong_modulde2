package _jame_mo_rong;



import java.util.*;

public class StudentManager {
    private static Map<Student, Integer> studentList = new TreeMap<>();

    static {
        studentList.put(new Student("Chanh", 35, "C0721G1"), 0);
        studentList.put(new Student("B", 24, "C0721G1"), 1);
        studentList.put(new Student("Duong", 23, "C0721G1"), 2);
        studentList.put(new Student("Cong", 21, "C0721G1"), 3);
        studentList.put(new Student("Nhật", 20, "C0721G1"), 4);
    }
    public static void display(){
        Set<Student>studentSet = studentList.keySet();
        for (Student student :studentSet){
            System.out.println("Ten sinh vien:" +student.getNameStudent()+ ", So buoi nghi:"
                    + studentList.get(student));
        }

    }
    public static void add(){

            Scanner scanner = new Scanner(System.in);
            System.out.print("Hãy nhập tên: ");
            String name = scanner.nextLine();
            System.out.print("Hãy nhập tuổi: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.print("Hãy nhập tên lớp: ");
            String nameClass = scanner.nextLine();

        Set<Student> studentSet = studentList.keySet();
        boolean check = false;
        for (Student student : studentSet) {
            if (name.equals(student.getNameStudent())) {
                check = true;
                studentList.put(student, (studentList.get(student) + 1));
            }
        }
        if (!check) {
            studentList.put(new Student(name, age, nameClass), 0);
        }
    }

}