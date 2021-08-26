package _7_abstract_class_va_interface.thuc_hanh.bai1_lop_animal_va_interface_edible.animal;

public class AbstractAndInterfaceTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2] ;
        animals [0]= new Tiger();
        animals [1]= new Chicken();
        for (Animal animal : animals){
            animal.makeSound();
        }
        }
    }

