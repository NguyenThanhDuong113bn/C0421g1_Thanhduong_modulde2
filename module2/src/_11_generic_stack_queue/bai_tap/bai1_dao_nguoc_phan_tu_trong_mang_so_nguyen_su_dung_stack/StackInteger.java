package _11_generic_stack_queue.bai_tap.bai1_dao_nguoc_phan_tu_trong_mang_so_nguyen_su_dung_stack;

import java.util.Stack;

public class StackInteger {
    public static void main(String[] args) {
        Stack<Integer> numStack = new Stack<>();
        numStack.push(1);
        numStack.push(2);
        numStack.push(3);
        numStack.add(4);
        numStack.add(5);
        Stack<Integer> myNumStack = new Stack<>();
        System.out.println(numStack);
        for (int i = (numStack.size()-1); i>=0;i--){
//            IntDeque myNumStack = null;
            myNumStack.push(numStack.pop());
        }
        System.out.println(myNumStack);
    }



}
