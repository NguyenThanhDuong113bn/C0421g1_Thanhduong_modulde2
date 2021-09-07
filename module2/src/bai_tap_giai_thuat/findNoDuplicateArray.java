package bai_tap_giai_thuat;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class findNoDuplicateArray {

    public static void main(String[] args) {
        String string;
        char kytu;
        int count = 0;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhap vao 1 chuoi bat ky");
            string= scanner.nextLine();
        }while (string.length() > 100);
        System.out.println("Nhap vao ky tu can dem so lan xuat hien");
        kytu = scanner.next().charAt(0);
        for (int i = 0 ; i < string.length(); i++){
            if (kytu == string.charAt(i)){
                count ++;
            }
        }
        System.out.println(" So lan xuat hien ky tu " + kytu + " trong chuoi" + string + " = " +count);
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập phần tử của mảng");
//        String n = scanner.nextLine();
//        // khoi tao array
//        String [ ]array = new String[];
//        System.out.println(" Nhap cac phan tu cua mang:");
//        for (int i = 0; i < n; i++) {
//            System.out.printf("a[%d] = ", i);
//            array[i] = scanner.nextLine();
//        }
//        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
//        for (int i = 0; i < n; i++) {
//            int[] arr = new int[0];
//            addElement(map, arr[i]);
//        }
//        System.out.println(" Cac phan tu xuat hien 2 lan: \n");
//        for (Integer key : map.keySet()){
//            System.out.printf("%d xuất hiện %d lần.\n", key, map.get(key));
//        }
//


//    }
//
//    private static void addElement(Map<Integer, Integer> map, int element) {
//        if (map.containsKey(element)){
//            int count = map.get(element) + 1;
//            map.put(element, count);
//        }else {
//            map.put(element,1);
//        }
    }
}
