package models;

public class Employee extends Person {
    private int idOfEmployee;
    private int educatinLevel;
    private int position;

    public Employee(String fullName, String dateOfBirth, String gender, String identityCardNumber, String phoneNumber, String guestType, String idOfEmployee, String educatinLevel, String position) {
    }

    public Employee(int idOfEmployee, int educatinLevel, int position) {
        this.idOfEmployee = idOfEmployee;
        this.educatinLevel = educatinLevel;
        this.position = position;
    }

    public Employee(String fullName, int dateOfBirth, String gender, int identityCardNumber, int phoneNumber, String guestType, int idOfEmployee, int educatinLevel, int position) {
        super(fullName, dateOfBirth, gender, identityCardNumber, phoneNumber, guestType);
        this.idOfEmployee = idOfEmployee;
        this.educatinLevel = educatinLevel;
        this.position = position;
    }

    public int getIdOfEmployee() {
        return idOfEmployee;
    }

    public void setIdOfEmployee(int idOfEmployee) {
        this.idOfEmployee = idOfEmployee;
    }

    public int getEducatinLevel() {
        return educatinLevel;
    }

    public void setEducatinLevel(int educatinLevel) {
        this.educatinLevel = educatinLevel;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
