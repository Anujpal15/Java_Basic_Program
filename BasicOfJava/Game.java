package BasicOfJava;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        //Exercise 2
        //Create a simple Rock, Paper Scissors game in Java. (#Use Conditional Statements)
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.println("0 for rock");
        System.out.println("1 for paper");
        System.out.println("2 for scissor");
        System.out.println("what do you chose  ");

        int computerInput = rd.nextInt(3);
        int userInput = sc.nextInt();
        System.out.println("you chose:");
        System.out.println(userInput);
        System.out.println("Computer chose:");
        if (userInput>2 || userInput<0){
            System.out.println(" You chose a wrong number please enter correct number 0 to 2");
        }
        if (userInput == computerInput){
            System.out.println("Draw");
        } else if (userInput == 0 && computerInput == 1) {
            System.out.println("you win");
        } else if (userInput == 1 && computerInput == 2) {
            System.out.println("computer win");
        } else if (userInput == 2 && computerInput == 0) {
            System.out.println("computer win");
        }
        if (computerInput ==0 && userInput == 1){
            System.out.println("computer win");
        } else if (computerInput == 1 && userInput == 2) {
            System.out.println("you win");
        } else if (computerInput == 2 && userInput == 0) {
            System.out.println("you win");
        }
    }
}
