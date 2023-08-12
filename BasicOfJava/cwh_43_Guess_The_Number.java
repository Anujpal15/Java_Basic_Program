package BasicOfJava;

import java.util.Random;
import java.util.Scanner;

class game{
    public int number;
    public int InputFromUser;
    public int NoOfGuess =0;

    public int getNoOfGuess(){
        return NoOfGuess;
    }
    public void setNoOfGuess(int NoOfGuess){
        this.NoOfGuess = NoOfGuess;
    }
    game(){
        Random rand = new Random(100);
        this.number = rand.nextInt();
    }
    void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        this.InputFromUser = sc.nextInt();
    }
    boolean isCorrectNumber(){
       NoOfGuess++;
       if (InputFromUser == number){
           System.out.println("you chose correct the  number");
           return true;
       }
       else if (InputFromUser<number){
           System.out.println(" too small ");
       }
       else if (InputFromUser>number){
           System.out.println(" too high");
       }
       return false;
    }
}


    public class cwh_43_Guess_The_Number {
        public static void main(String[] args) {


//            Create a class Game, which allows a user to play "Guess the Number" game once.
//
//            Game should have the following methods:
//           1, Constructor to generate the random number
//           2, takeUserInput() to take a user input of number
//           3, isCorrectNumber() to detect whether the number entered by the user is true
//           4, getter and setter for noOfGuesses
//           Use properties such as noOfGuesses(int), etc to get this task done!

            Game g = new Game();
            boolean b= false;
            while(!b){
            

        }
    }
}
