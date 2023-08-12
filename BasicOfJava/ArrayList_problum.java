package BasicOfJava;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_problum {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();


        for (int i = 0; i <= n; i++) {
           int element = sc.nextInt();
            list.add(element);


        }
        for (int element : list) {
            System.out.print(element + " ");
        }
    }
}
