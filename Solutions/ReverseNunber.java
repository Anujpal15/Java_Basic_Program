package Solutions;

import java.util.Scanner;

public class ReverseNunber {
    static Scanner sc = new Scanner(System.in);

    static int reverse = 0;
    public static void ReverseNumber (int number){
        if(number<10){
            System.out.println(number);
            return;
        }
        else {
            System.out.print(number%10);
            ReverseNumber(number/10);
        }
    }
    public static void main(String[] args) {
        int number = sc.nextInt();


        //  Iterative
        // with while loop
        System.out.println("Using While loop");
        while(number!=0){
        int remainder = number % 10;
        reverse = reverse * 10 + remainder;
        number = number/ 10;
        }
        System.out.println("reverse number using while loop : "+reverse);
        System.out.println();

        // with for loop
        System.out.println("Using for loop");

        for (; number != 0; number = number/10){
            int remainder = number%10;
            reverse = reverse * 10 + remainder;
        }
        System.out.println("reverse number using while loop : "+reverse);
        System.out.println();

        // with recursion
        System.out.println("Using recursion");
        int nums = sc.nextInt();
        ReverseNumber(nums);
    }
}
