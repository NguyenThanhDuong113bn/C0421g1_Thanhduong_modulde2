package models;

import com.sun.xml.internal.ws.wsdl.writer.document.http.Address;

//Mã khách hàng, Họ tên , Ngày sinh, Giới tính, Số CMND, Số Điện Thoại, Email, Loại khách, Địa chỉ
public class Customer extends Person {
    private int idOfCustomer ;
    private CustomerType customerType;
    private String addressOfCustomer;

public Customer(String s){

}

    public Customer(String fullName, int dateOfBirth, String gender, int identityCardNumber, int phoneNumber, String email, int idOfCustomer, CustomerType customerType, String addressOfCustomer) {
        super(fullName, dateOfBirth, gender, identityCardNumber, phoneNumber, email);
        this.idOfCustomer = idOfCustomer;
        this.customerType = customerType;
        this.addressOfCustomer = addressOfCustomer;
    }

    public Customer(String idOfCustomer, String name, String birthday, String gender, String identityCardNumber, String phoneNumber, String email, String customerType, String address) {
    }

    public int getIdOfCustomer() {
        return idOfCustomer;
    }

    public void setIdOfCustomer(int idOfCustomer) {
        this.idOfCustomer = idOfCustomer;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
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
