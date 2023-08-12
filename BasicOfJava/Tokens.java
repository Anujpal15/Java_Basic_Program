package BasicOfJava;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Tokens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        s = s.trim();

        if (s.length() == 0) {
            System.out.println(0);
            return;
        }

        /* Split on all non-alphabetic characters */
        String [] words = s.split("[^a-zA-Z]+");

        /* Print output */
        System.out.println(words.length);
        for (String word : words) {
            System.out.println(word);
        }


    }
}
