package models;

//Mã khách hàng, Họ tên , Ngày sinh, Giới tính, Số CMND, Số Điện Thoại, Email, Loại khách, Địa chỉ
public class Customer extends Person {
    private String idOfCustomer ;
    private String customerType;
    private String addressOfCustomer;
//
//public Customer(String s){
//
//


    public Customer(String fullName, String dateOfBirth, String gender, String identityCardNumber,
                    String phoneNumber, String email, String idOfCustomer, String customerType,
                    String addressOfCustomer) {
        super(fullName, dateOfBirth, gender, identityCardNumber, phoneNumber, email);
        this.idOfCustomer = idOfCustomer;
        this.customerType = customerType;
        this.addressOfCustomer = addressOfCustomer;
    }

//    public Customer(String idOfCustomer, String name, String birthday, String gender, String identityCardNumber, String phoneNumber, String email, String customerType, String address) {
//
//    }


    public String getIdOfCustomer() {
        return idOfCustomer;
    }

    public void setIdOfCustomer(String idOfCustomer) {
        this.idOfCustomer = idOfCustomer;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddressOfCustomer() {
        return addressOfCustomer;
    }

    public void setAddressOfCustomer(String addressOfCustomer) {
        this.addressOfCustomer = addressOfCustomer;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "idOfCustomer=" + idOfCustomer +
                super.toString() +
                ", customerType=" + customerType +
                ", addressOfCustomer='" + addressOfCustomer + '\'' +
                '}';
    }
}
