package _11_generic_stack_queue.bai_tap.bai1_dao_nguoc_phan_tu_trong_mang_so_nguyen_su_dung_stack;

import java.util.Stack;

public class StackString {
    public static void main(String[] args) {
        Stack<String> wordStack = new Stack<>();
        wordStack.push("One");
        wordStack.push("Two");
        wordStack.push("Three");
        wordStack.push("Four");
        wordStack.push("Five");
        System.out.println(wordStack);
        Stack<String> mywordStack = new Stack<>();
        for (int i =(wordStack.size()-1); i >=0; i--){
            mywordStack.push(wordStack.pop());
        }
        System.out.println(mywordStack);


    }
}
