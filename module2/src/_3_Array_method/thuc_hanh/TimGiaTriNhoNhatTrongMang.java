package _3_Array_method.thuc_hanh;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        int[] arr = {8, 11, 5, 7, 1, 6, 9};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);
    }

    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
