package models;

public class Employee extends Person {

    public String employeeCode;// ma nv
    private String wage;//luong
    private String educationLevel;
    private String position;
//
//    public Employee(String fullName, String s, String gender, String s1, String s2, String email, String employeeCode, String s3, String s4, String s5){
////        super(fullName, dateOfBirth, gender, identityCardNumber, phoneNumber, email);
//
//    }

    public Employee(String fullName, String dateOfBirth, String gender, String identityCardNumber, String phoneNumber, String email,
                    String employeeCode, String wage, String educationLevel, String position) {
        super(fullName, dateOfBirth, gender, identityCardNumber, phoneNumber, email);
        this.employeeCode = employeeCode;
        this.wage = wage;
        this.educationLevel = educationLevel;
        this.position = position;
    }

//    public Employee(String fullName, String dateOfBirth, String gender, String identityCardNumber, String phoneNumber, String guestType, String idOfEmployee, String educationLevel, String position, String email, String wage) {
//
//
//
//    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +super.toString()+
                "employeeCode='" + employeeCode + '\'' +
                ", wage=" + wage +
                ", educationLevel=" + educationLevel +
                ", position=" + position +
                '}';
    }
}
