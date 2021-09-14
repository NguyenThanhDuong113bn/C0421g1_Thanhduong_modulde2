package models;
//mã booking, ngày bắt đầu, ngày kết thúc, mã khách hàng, tên dịch vụ, loại dịch vụ.
public class Booking implements Comparable <Booking>{
    private String idOfBooking;
    private String startDate;
    private String endDate;
    private String idOfCustomer;
    private String nameOfServices;
    private String servicesOfType;

    public Booking(String idOfBooking, String startDate, String endDate, String idOfCustomer, String nameOfServices, String servicesOfType) {
        this.idOfBooking = idOfBooking;
        this.startDate = startDate;
        this.endDate = endDate;
        this.idOfCustomer = idOfCustomer;
        this.nameOfServices = nameOfServices;
        this.servicesOfType = servicesOfType;
    }

    public String getIdOfBooking() {
        return idOfBooking;
    }

    public void setIdOfBooking(String idOfBooking) {
        this.idOfBooking = idOfBooking;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getIdOfCustomer() {
        return idOfCustomer;
    }

    public void setIdOfCustomer(String idOfCustomer) {
        this.idOfCustomer = idOfCustomer;
    }

    public String getNameOfServices() {
        return nameOfServices;
    }

    public void setNameOfServices(String nameOfServices) {
        this.nameOfServices = nameOfServices;
    }

    public String getServicesOfType() {
        return servicesOfType;
    }

    public void setServicesOfType(String servicesOfType) {
        this.servicesOfType = servicesOfType;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idOfBooking='" + idOfBooking + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", idOfCustomer='" + idOfCustomer + '\'' +
                ", nameOfServices='" + nameOfServices + '\'' +
                ", servicesOfType='" + servicesOfType + '\'' +
                '}';
    }

    @Override
    public int compareTo(Booking o) {
        return 0;
    }
}
