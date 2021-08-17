package _3_Array_method.bai_tap;

import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        int[] array = { 5,8,10,12,16, 7};
        int index = minValue(array);
        System.out.println(" Gia tri nho nhat trong mang la : " + array[index]);
    }

    public static int minValue(int[] array) {
        int index = 0 ;
        for (int i=1; i < array.length; i++){
            if (array[i] < array[ index]){
                index = i;
            }
        }
        return  index;
    }


    }

