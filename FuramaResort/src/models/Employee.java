package models;

public class Employee extends Person {
    public String employeeCode;// ma nv
    private int wage;//luong
    private int educationLevel;
    private int position;

    public Employee(String fullName, String s, String gender, String s1, String s2, String email, String employeeCode, String s3, String s4, String s5){

    }

    public Employee(String fullName, int dateOfBirth, String gender, int identityCardNumber, int phoneNumber, String email, String employeeCode, int wage, int educationLevel, int position) {
        super(fullName, dateOfBirth, gender, identityCardNumber, phoneNumber, email);
        this.employeeCode = employeeCode;
        this.wage = wage;
        this.educationLevel = educationLevel;
        this.position = position;
    }

    public Employee(String fullName, String dateOfBirth, String gender, String identityCardNumber, String phoneNumber, String guestType, String idOfEmployee, String educationLevel, String position, String email, String wage) {
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(int educationLevel) {
        this.educationLevel = educationLevel;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeCode='" + employeeCode + '\'' +
                ", wage=" + wage +
                ", educationLevel=" + educationLevel +
                ", position=" + position +
                '}';
    }
}
