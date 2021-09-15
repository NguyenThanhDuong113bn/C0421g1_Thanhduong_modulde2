package models;

public class House extends Facility {
    private String standardRoom;// tieu chuan phong
    private String numberOfFloors;//so tang
//
//  public House(String tenDichVu, String dienTichSuDung, String chiPhiThue, String soNguoiToiDa, String kieuThue, String tieuChuanPhong, String tienNgiKhac, String soTang) {
//
//  }

//    public House(String standardRoom, String numberOfFloors) {
//        this.standardRoom = standardRoom;
//        this.numberOfFloors = numberOfFloors;
//    }

    public House(String id, String servicesName, String areUse, String rentalCost, String numberOfPeople,
                 String rentalType, String standardRoom, String numberOfFloors) {
        super(id, servicesName, areUse, rentalCost, numberOfPeople, rentalType);
        this.standardRoom = standardRoom;
        this.numberOfFloors = numberOfFloors;
    }
//
//    public House(String standardRoom, String numberOfFloors) {
//        this.standardRoom = standardRoom;
//        this.numberOfFloors = numberOfFloors;
//    }


//    public House(String standardRoom, String numberOfFloors) {
//        this.standardRoom = standardRoom;
//        this.numberOfFloors = numberOfFloors;
//    }


    @Override
    public String toString() {
        return "House{" + super.toString()+
                "standardRoom='" + standardRoom + '\'' +
                ", numberOfFloors='" + numberOfFloors + '\'' +
                '}';
    }

    @Override
    public String getNumberOfFloors() {
        return null;
    }

    @Override
    public String getStandardRoom() {
        return null;
    }


}
