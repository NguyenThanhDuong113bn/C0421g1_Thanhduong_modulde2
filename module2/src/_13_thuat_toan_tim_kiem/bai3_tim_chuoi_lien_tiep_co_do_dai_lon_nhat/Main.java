package _13_thuat_toan_tim_kiem.bai3_tim_chuoi_lien_tiep_co_do_dai_lon_nhat;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String string = scanner.nextLine();

        LinkedList<Character> list = new LinkedList<>();

        LinkedList<Character> max = new LinkedList<>();

        for (int i=0; i<string.length();i++){
            if (list.size()>1 && string.charAt(i) <= list.getLast() ){
                list.clear();
            }
            list.add(string.charAt(i));

            if (list.size()>max.size()){
                max.clear();
                max.addAll(list);
            }
        }
        for (Character character : max){
            System.out.println(character);
        }

    }
}
