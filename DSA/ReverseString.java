package DSA;

import java.util.Scanner;

public class ReverseString {
    static String reverseString (String s , int idx){
        if (idx == s.length()){
            return "";
        }
        String smallAns = reverseString(s,idx+1);

        return smallAns + s.charAt(idx);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rev = reverseString(s,0);
        if (rev.equals(s)){
            System.out.printf("%s is Palindrome ", s);
        }else {
            System.out.printf("%s is not Palindrome", s);
        }
        System.out.println(reverseString(s,0));
    }
}
