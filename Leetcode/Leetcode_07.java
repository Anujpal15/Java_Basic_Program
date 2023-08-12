package Leetcode;

import java.util.Stack;

public class Leetcode_07 {
    public static int reverse(int x) {
        Stack<Integer> st = new Stack<>();
        st.push(x);
        System.out.println(st.peek());
        return st.pop();
    }
    public static void main(String[] args) { 
        Stack<Integer> st = new Stack<>();
//        reverse(123);
        st.push(reverse(123));
    }

}
