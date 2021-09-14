package models;

public class House extends Facility {
    private String standardRoom;// tieu chuan phong
    private String numberOfFloors;//so tang

  public House(String tenDichVu, String dienTichSuDung, String chiPhiThue, String soNguoiToiDa, String kieuThue, String tieuChuanPhong, String tienNgiKhac, String soTang) {

  }

    public House(String standardRoom, String numberOfFloors) {
        this.standardRoom = standardRoom;
        this.numberOfFloors = numberOfFloors;
    }

    public House(String id, String servicesName, double areUse, double rentalCost, int numberOfPeople, String rentalType, String standardRoom, String numberOfFloors) {
        super(id, servicesName, areUse, rentalCost, numberOfPeople, rentalType);
        this.standardRoom = standardRoom;
        this.numberOfFloors = numberOfFloors;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(String numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                super.toString()+
                "standardRoom='" + standardRoom + '\'' +
                ", numberOfFloors='" + numberOfFloors + '\'' +
                '}';
    }
}
