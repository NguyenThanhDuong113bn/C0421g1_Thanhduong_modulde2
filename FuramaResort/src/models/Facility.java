package models;
// Villa, House, Room.
//Các loại dịch vụ này sẽ bao có các thông tin:
// Tên dịch vụ, Diện tích sử dụng, Chi phí thuê, Số lượng người tối đa, Kiểu thuê
// (bao gồm thuê theo năm, tháng, ngày, giờ.
public abstract class Facility {

    protected String id;
    private String servicesName;
    private String areUse;
    private String rentalCost ;
    private String numberOfPeople;
    private String rentalType;

    public Facility(String id, String servicesName, String areUse, String rentalCost, String numberOfPeople, String rentalType) {
        this.id = id;
        this.servicesName = servicesName;
        this.areUse = areUse;
        this.rentalCost = rentalCost;
        this.numberOfPeople = numberOfPeople;
        this.rentalType = rentalType;
    }

    public Facility() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getServicesName() {
        return servicesName;
    }

    public void setServicesName(String servicesName) {
        this.servicesName = servicesName;
    }

    public String getAreUse() {
        return areUse;
    }

    public void setAreUse(String areUse) {
        this.areUse = areUse;
    }

    public String getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(String rentalCost) {
        this.rentalCost = rentalCost;
    }

    public String getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(String numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "id='" + id + '\'' +
                ", servicesName='" + servicesName + '\'' +
                ", areUse=" + areUse +
                ", rentalCost=" + rentalCost +
                ", numberOfPeople=" + numberOfPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }

    public abstract String getNumberOfFloors();

    public abstract String getStandardRoom();
}
