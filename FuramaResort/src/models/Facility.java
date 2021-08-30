package models;
// Villa, House, Room.
//Các loại dịch vụ này sẽ bao có các thông tin:
// Tên dịch vụ, Diện tích sử dụng, Chi phí thuê, Số lượng người tối đa, Kiểu thuê
// (bao gồm thuê theo năm, tháng, ngày, giờ.
public abstract class Facility {
    protected String id;
    private String servicesName;
    private double areUse;
    private double rentalCost ;
    private int numberOfPeople;
    private String rentalType;

    public Facility(String id, String servicesName, double areUse, double rentalCost, int numberOfPeople, String rentalType) {
        this.id = id;
        this.servicesName = servicesName;
        this.areUse = areUse;
        this.rentalCost = rentalCost;
        this.numberOfPeople = numberOfPeople;
        this.rentalType = rentalType;
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

    public double getAreUse() {
        return areUse;
    }

    public void setAreUse(double areUse) {
        this.areUse = areUse;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }
}
