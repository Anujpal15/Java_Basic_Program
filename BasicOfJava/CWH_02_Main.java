package BasicOfJava;
import java.util.Scanner;

public class CWH_02_Main {
    static int mySum(int a, int b){
        int c = a+b;
        return c;
    }
        public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        CWH_02_Main obj = new CWH_02_Main();
        int z = obj.mySum(x,y);
            System.out.println(z);
        }


    }
