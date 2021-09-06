package _jame_mo_rong;

import com.sun.xml.internal.ws.wsdl.writer.document.http.Address;

public class Student implements Comparable<Student>{
    private String nameStudent;
    private int ageStudent;
    private String nameClass;

    public Student(String nameStudent, int ageStudent, String nameClass) {
        this.nameStudent = nameStudent;
        this.ageStudent = ageStudent;
        this.nameClass = nameClass;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public int getAgeStudent() {
        return ageStudent;
    }

    public void setAgeStudent(int ageStudent) {
        this.ageStudent = ageStudent;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + nameStudent + '\'' +
                ", age=" + ageStudent +
                ", nameClass='" + nameClass + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.getNameStudent().compareTo(o.getNameStudent());

    }
}
