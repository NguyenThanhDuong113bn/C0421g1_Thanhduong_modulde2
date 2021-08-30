package models;

import com.sun.xml.internal.ws.wsdl.writer.document.http.Address;

//Mã khách hàng, Họ tên , Ngày sinh, Giới tính, Số CMND, Số Điện Thoại, Email, Loại khách, Địa chỉ
public class Customer extends Person {
    private int idOfCustomer ;
    private CustomerType customerType;
    private String addressOfCustomer;

    public Customer(int idOfCustomer, CustomerType customerType, String addressOfCustomer) {

        this.idOfCustomer = idOfCustomer;
        this.customerType = customerType;
        this.addressOfCustomer = addressOfCustomer;
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
}
