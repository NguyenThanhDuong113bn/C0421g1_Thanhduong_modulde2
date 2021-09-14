package models;

public class Villa extends Facility {
    private String standardRoom;
    private double areaPool;
    private int numberOfFloors;

    public Villa(String id, String servicesName, double areUse, double rentalCost, int numberOfPeople, String rentalType, String standarRoom, double areaPool, int numberOfFloors) {
        super(id, servicesName, areUse, rentalCost, numberOfPeople, rentalType);
        this.standardRoom = standarRoom;
        this.areaPool = areaPool;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa(String tenDichvu, String dienTichSuDung, String chiPhiThue, String soNguoiToiDa, String kieuThue, String tieuChuanPhong, String dienTichHoBoi, String soTang) {
        super();
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
}
