package _11_generic_stack_queue.bai_tap.bai2_chuyen_doi_tu_he_thap_phan_sang_he_nhi_phan;

import java.util.Scanner;
import java.util.Stack;

public class Convert {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println(" Enter a decimal : ");
       int num = in.nextInt();
        while (num !=0) {
            int a = num % 2 ;
            stack.push(a);
            num =num /2;
        }
        System.out.println("Binary value is :");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
