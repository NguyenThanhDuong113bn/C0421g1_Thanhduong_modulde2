package _17_binary_file_va_serialization.bai_tap.quan_ly_san_pham_ra_file_nhi_phan;

import java.io.Serializable;

public class ListCar implements Serializable {
    private String id;
    private String name;
    private String brand;
    private String price;

    public ListCar(String id, String name, String brand, String price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }
    public ListCar(int id, String name, String brand, int price) {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "list{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", brand ='" + brand + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
    }

