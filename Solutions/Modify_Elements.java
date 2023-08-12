package Solutions;

import java.util.ArrayList;
import java.util.Scanner;

public class Modify_Elements {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();

        Scanner sc =new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();

        marks.add(input1);
        marks.add(input2);
        marks.add(input3);

        System.out.println(marks);

        marks.set(1,sc.nextInt());
        System.out.println(marks);
        
    }
}
