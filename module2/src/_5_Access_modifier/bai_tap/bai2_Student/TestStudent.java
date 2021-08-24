package _5_Access_modifier.bai_tap.bai2_Student;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student() ;
        System.out.println(student1.getName() + " học lớp " + student1.getClasses());
        Student student2 = new Student();
        student2.setName("Duong");
        student2.setClasses("C21");
        System.out.println(student2.getName() + " học lớp " + student2.getClasses());

    }
}
