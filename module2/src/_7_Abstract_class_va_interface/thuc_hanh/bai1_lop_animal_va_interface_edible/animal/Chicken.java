package _7_Abstract_class_va_interface.thuc_hanh.bai1_lop_animal_va_interface_edible.animal;

import _7_Abstract_class_va_interface.thuc_hanh.bai1_lop_animal_va_interface_edible.ediblle.Edible;

public class Chicken extends  Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken : cluck-cluck !!!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
