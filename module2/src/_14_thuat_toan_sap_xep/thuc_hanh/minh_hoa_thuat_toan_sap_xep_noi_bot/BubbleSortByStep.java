package _14_thuat_toan_sap_xep.thuc_hanh.minh_hoa_thuat_toan_sap_xep_noi_bot;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter a size :");
        int size =scanner.nextInt();
        int[] list=new int[size];
        System.out.println("Enter "+list.length+"values;");
        for (int i = 0; i< list.length;i++){
            list[i]=scanner.nextInt();
        }
        System.out.println("Your input list:");
        for( int i = 0; i <list.length;i++){
            System.out.println(list[i] + "\t");
        }
    }
    public static void BubbleSortByStep(int[] list){
        boolean needNextPass = true;
        for ( int k =1; k < list.length && needNextPass; k++){
            needNextPass = false;
            for ( int i = 0;i< list.length - k;i++){
                if (list[i] >list[i+1]){
                    System.out.println("Swap" + list[i] + " with" + list[i+1]);
                    int temp =list[i];
                    list[i]=list[i+1];
                    list[ i+1]= temp;

                    needNextPass = true;

                }
            }
            if(needNextPass == false){
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }
            System.out.println(" List after the" + k + " sort:");
            for (int j=0; j< list.length; j++){
                System.out.println(list[j]+ "\t");
            }
            System.out.println();
        }
        System.out.println("\nBegin sort processing...");
        BubbleSortByStep(list);

    }
}
