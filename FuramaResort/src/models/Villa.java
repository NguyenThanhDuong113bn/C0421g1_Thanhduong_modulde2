package models;

public class Villa extends Facility {
    private String standardRoom;
    private String areaPool;
    private String numberOfFloors;

    public Villa(String id, String servicesName, String areUse, String rentalCost, String numberOfPeople,
                 String rentalType, String standarRoom, String areaPool, String numberOfFloors) {
        super(id, servicesName, areUse, rentalCost, numberOfPeople, rentalType);
        this.standardRoom = standarRoom;
        this.areaPool = areaPool;
        this.numberOfFloors = numberOfFloors;
    }
//
//    public Villa(String serviceName, String areUse, String rentalCost, String numberOfPeople, String rentalType, String standarRoom, String areaPool, String numberOfFloors) {
//    }
//
//    public Villa(String tenDichvu, String dienTichSuDung, String chiPhiThue, String soNguoiToiDa, String kieuThue, String tieuChuanPhong, String dienTichHoBoi, String soTang) {
//        super();
//    }


    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(String areaPool) {
        this.areaPool = areaPool;
    }

    public String getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(String numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Villa{" + super.toString()+
                "standardRoom='" + standardRoom + '\'' +
                ", areaPool='" + areaPool + '\'' +
                ", numberOfFloors='" + numberOfFloors + '\'' +
                '}';
    }
}
