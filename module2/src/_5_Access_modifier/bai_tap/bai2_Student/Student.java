package _5_Access_modifier.bai_tap.bai2_Student;

public class Student {
    private String name= " join";
    private String classes = " C20";
    public Student () {

    }
    public Student (String name, String classes) {
        this.name = name;
        this.classes = classes;
    }
    public String getName () {
        return this.name;
    }
    public String getClasses () {
        return this.classes;
    }
    public void setName (String name) {
        this.name = name;
    }
    public void setClasses (String classes) {
        this.classes = classes;
    }
}
