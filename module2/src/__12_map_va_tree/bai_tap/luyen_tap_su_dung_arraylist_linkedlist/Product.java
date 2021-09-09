package __12_map_va_tree.bai_tap.luyen_tap_su_dung_arraylist_linkedlist;

import java.util.ArrayList;

public class Product  {
    public static Object add;
    private int id;
    private String name;
    private  int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public static void add(ArrayList<ListCar> listCars1) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product {" +" id="+ id+", name ="+name+'\''+",price="+ price+'}';
    }
}
