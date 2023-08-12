package Try_code;

import java.util.Scanner;

public class Test_03{

    public static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }else{
        return n * factorial(n-1);
        }
    }
    public static boolean Peterson_number(int n) {
       int num = n;
       int sum_of_factorial = 0;
       while (num>0){
           int fact = num % 10;
           int factorial_of_digit = factorial(fact);
           sum_of_factorial += factorial_of_digit;
           num = num / 10;
       }
       if (sum_of_factorial == n){
           return true;
       }
       else return false;

    }
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            System.out.println(Peterson_number(number));



    }
}