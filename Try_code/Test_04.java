package Try_code;

import java.util.Scanner;

public class Test_04 {
    public static boolean findPerfectSqaure(double num){
        double square = Math.sqrt(num);
        return (square - Math.floor(square)==0);
    }
    public static void isSunny(double n){
        if (findPerfectSqaure(n+1)){
            System.out.println("Sunny number ");
        }else System.out.println("Not Sunny number");
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();
        isSunny(number);
    }
}
