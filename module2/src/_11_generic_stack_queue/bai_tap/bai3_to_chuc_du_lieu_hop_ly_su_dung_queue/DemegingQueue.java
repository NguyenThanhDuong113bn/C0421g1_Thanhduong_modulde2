package _11_generic_stack_queue.bai_tap.bai3_to_chuc_du_lieu_hop_ly_su_dung_queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;

public class DemegingQueue {
    public static void main(String[] args) {
        ArrayList<Personnel> personnels = new ArrayList<Personnel>();
        ArrayList<Personnel> personnels1 = new ArrayList<Personnel>();

        personnels.add(new Personnel(" Nguyễn Văn A","11/1/2000","Nam","1"));
        personnels.add(new Personnel(" Nguyễn Văn B","22/2/2001","Nam","2"));
        personnels.add(new Personnel(" Nguyễn Văn C","12/3/2002","Nam","3"));
        personnels.add(new Personnel(" Nguyễn Thị Hoa","15/5/2005","Nữ","4"));
        personnels.add(new Personnel(" Nguyễn Thị Đào","19/8/1999","Nữ","5"));

        System.out.println(" Danh sách nhâp ban đầu:" + personnels);
        Collections.sort(personnels);
        for (Personnel personnel : personnels){
            System.out.println(personnel.toString());
        }
        Queue<Personnel> Nu =new ArrayDeque<>();
        Queue<Personnel> Nam =new ArrayDeque<>();
        for (Personnel personnel : personnels){
            if (personnel.getGender().equals("Nữ")){
                Nu.add(personnel);
            } else {
                Nam.add(personnel);
            }
        }
        while (! Nam.isEmpty()){
            personnels1.add(Nam.poll());
        }
        while (!Nu.isEmpty()){
            personnels1.add(Nu.poll());
        }
        System.out.println("Danh sách");
        for (Personnel personnel :personnels){
            System.out.println(personnels.toString());
        }


    }
}
