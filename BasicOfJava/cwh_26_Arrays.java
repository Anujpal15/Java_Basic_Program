package BasicOfJava;

import java.text.NumberFormat;
import java.util.Arrays;

public class cwh_26_Arrays {

//    public static String [] getDaysofWeek(){
//        String[] Days = { "Sunday", "Monday", "Tuesday",
//                "Wednesday", "Thursday",
//                "Friday", "Saturday" };
//        return Days;
//    }
//    public static void printStringDays(String [] strings){
//        for(String s : strings){
//            System.out.println(s);
//        }
//    }
//    public static void main(String[] args) {
// /* Classroom of 500 students - You have to store marks of these 500 students
//        You have 2 options:
//        1. Create 500 variables
//        2. Use Arrays (recommended)
//        */
//        // There are three main ways to create an array in Java
//        // 1. Declaration and memory allocation
//        // int [] marks = new int[5];
//
////                 2. Declaration and then memory allocation
////        int [] marks;
////        marks = new int[5];
//////                 Initialization
////        marks[0] = 100;
////        marks[1] = 60;
////        marks[2] = 70;
////        marks[3] = 90;
////        marks[4] = 86;
//
////                // 3. Declaration, memory allocation and initialization together
////                int [] marks = {98, 45, 79, 99, 80};
////
////                // marks[5] = 96; - throws an error
////                System.out.println(marks[4]);
//
//
//        String[] days = getDaysofWeek();
//        printStringDays(days);
public static void main(String[] args) {
//    double[][] sales = new double[5][4];
//    sales[0][0] = 23853.0;
//
//    NumberFormat cf = NumberFormat.getCurrencyInstance();
//    System.out.println("North\t\tSouth\t\tEast\t\tWest");
//    int year = 2004;
//    for (int y = 0; y < 5; y++)
//    {
//        System.out.print(year + "\t");
//        for (int region = 0; region < 4; region++)
//        {
//            System.out.print(cf.format(sales[y][region]));
//            System.out.print("\t");
//        }
//        year++;
//        System.out.println();
//    }

    String[][] teams
            = { {"Henry Blake", "Johnny Mulcahy"},
            {"Benjamin Pierce", "John McIntyre",
                    "Jonathan Tuttle"},
            {"Margaret Houlihan", "Frank Burns"},
            {"Max Klinger", "Radar O'Reilly",
                    "Igor Straminsky"} };

//    for (int i = 0; i < teams.length; i++)
//    {
//        for (int j = 0; j < teams[i].length; j++)
//            System.out.println(teams[i][j]);
//        System.out.println();
        for (String[] team : teams)
        {
            for (String player : team)
                System.out.println(player);
            System.out.println();
        }
//    }



    }
}
