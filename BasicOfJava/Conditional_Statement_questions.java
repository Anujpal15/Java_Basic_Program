package BasicOfJava;

import java.util.Scanner;

public class Conditional_Statement_questions {
    public static void main(String[] args) {
        //1. Write a Java program to get a number from the user and print whether it is positive or negative. Go to the editor
        //
        //Test Data
        //Input number: 35
        //Expected Output :
        //Number is positive

        Scanner sc = new Scanner(System.in);
        /*int Input = sc.nextInt();
        System.out.println("Input number is:  ");

        if (Input > 0) {
            System.out.println("number is positive");
        }
        else if (Input < 0)
        {
            System.out.println("number is negative");
        }
        else {
            System.out.println("number is zero");
        }*/

        // Question 2: Write a program to find out whether a student is pass or fail; if it requires a total of 40% and
        // at least 33% in each subject to pass.Assume 3 subjects and take marks as input from the user.

       /* System.out.println("Student percentage is: ");
        int input = sc.nextInt();


        if ( input > 33) {
            System.out.println(" You are pass boy ");
        }
        else {
            System.out.println("you are fail boy ");
        }*/
        System.out.print("Input a number: ");
        int num1 = sc.nextInt();

        for(int i = 0; i < 10; ++i) {
            System.out.println("" + num1 + " x " + (i + 1) + " = " + num1 * (i + 1));
        }


    }
}
