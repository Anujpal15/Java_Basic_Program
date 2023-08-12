package BasicOfJava;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
public class Solution {
    static boolean isAnagram(String a, String b){

//       int a_length = a.length();
//       int b_length = b.length();
//
//       if (a_length  != b_length) return false;
//
//       int [] char_frequency = new int[26];
//       for (int i=0 ; 1<a_length; i++){
//
//       }

        char[] char1 = a.toLowerCase().replaceAll("\\s", "").toCharArray();
        char[] char2 = b.toLowerCase().replaceAll("\\s", "").toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        return Arrays.equals(char1,char2);
        }
    public static void main(String[] args) {


//        Scanner scanner = new Scanner(System.in);
//        double payment = scanner.nextDouble();
//        scanner.close();
//
//        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
//        String india = NumberFormat.getCurrencyInstance(new Locale("en","in")).format(payment);
//        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
//        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
//
//        System.out.println("US: " + us);
//        System.out.println("India: " + india);
//        System.out.println("China: " + china);
//        System.out.println("France: " + france);

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

