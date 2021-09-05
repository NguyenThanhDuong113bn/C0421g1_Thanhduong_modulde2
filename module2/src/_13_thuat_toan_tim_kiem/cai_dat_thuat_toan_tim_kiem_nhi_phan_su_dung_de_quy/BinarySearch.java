package _13_thuat_toan_tim_kiem.cai_dat_thuat_toan_tim_kiem_nhi_phan_su_dung_de_quy;

import java.util.Scanner;

public class BinarySearch {
    public static int searchBinarySeacrch(int[] array, int left, int right, int value){
        int mid =(left + right)/2;
        if(array[mid]==value){
            return  mid;
        }
        if (value <array[mid]){
            return searchBinarySeacrch(array, left, mid -1, value);
        }else if(value > array[mid]){
            return searchBinarySeacrch(array, mid+1, right,value);
        }
        return -1;

    }

    public static void main(String[] args) {
        int[]list ={2,4,8,10,14,16};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num= scanner.nextInt();
        int result;
        result =searchBinarySeacrch(list,0,list.length-1,num);
        if (result==-1) {
            System.out.println("Khong tim thay " + num + " trong danh sach");
        }else {
            System.out.println(" Tim thay "+num+" tai vi tri "+(result+1));
        }
    }
}
