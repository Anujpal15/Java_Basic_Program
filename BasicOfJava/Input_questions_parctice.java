package BasicOfJava;

public class Input_questions_parctice {
    public static void main(String[] args) {
        //5. Write a Java program that takes two numbers as input and display the product of two numbers. Go to the editor
        //Test Data:
        //Input first number: 25
        //Input second number: 5
        //Expected Output :
        //25 x 5 = 125

//        Scanner sc = new Scanner(System.in);
       /* System.out.println("Question no.5 - Answer");
        System.out.println("Input first number:");
        float a = sc.nextFloat();
        System.out.println("Input second number:");
        float b = sc.nextFloat();
        System.out.println("Total is:");
        System.out.println(a*b);*/

        // 6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers
        //Test Data:
        //Input first number: 125
        //Input second number: 24
        //Expected Output :
        //125 + 24 = 149
        //125 - 24 = 101
        //125 x 24 = 3000
        //125 / 24 = 5
        //125 mod 24 = 5

      /*  System.out.println("Input first number:");
       int a = sc.nextInt();
        System.out.println("Input second number:");
        int b = sc.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);*/

        // 7. Write a Java program that takes a number as input and prints its multiplication table upto 10. Go to the editor
        //Test Data:
        //Input a number: 8
        //Expected Output :
        //8 x 1 = 8
        //8 x 2 = 16
        //8 x 3 = 24
        //...
        //8 x 10 = 80

       /* System.out.print("Input a number: ");
        int num1 = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println(num1 + " x " + (i + 1) + " = " +
                    (num1 * (i + 1)));*/

        // 12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

      /*  System.out.println("Question no.12: Answer-");
        System.out.println("first number is:");
        int num1 = sc.nextInt();

        System.out.println("second number is:");
        int num2 = sc.nextInt();

        System.out.println("third number is:");
        int num3 = sc.nextInt();

        System.out.println("sum of this number is:");
        System.out.println(num1 + num2 + num3);

        System.out.println("Average of this number is:");
        System.out.println((num1 + num2 + num3)/3);*/

       /* byte m1, m2 ,m3;
        System.out.println("marks in physics:");
        m1 = sc.nextByte();
        System.out.println("marks in maths:");
        m2 = sc.nextByte();
        System.out.println("marks in chemistry:");
        m3 = sc.nextByte();
        float avg = (m1+m2+m3)/3;
        System.out.println(("avg =" + avg));

        if (avg>=40 && m1>=33 && m2>=33 && m3>=33) {
            System.out.println("You are able to enter next class ");
        }
            else {
                System.out.println("You are not able to enter next class");
            }*/

        //Question 3 :Calculate income tax paid by an employee to the government as per the slabs mentioned below:
        //
        //Income Slab	Tax
        //2.5L – 5.0L  	5%
        //5.0L – 10.0L 	20%
        //Above 10.0L	30%

//        System.out.println("Enter your income in Lakhs per annum");
//        float tax = 0;
//        float income = sc.nextFloat();
//        if (income <= 2.5){
//            tax = tax + 0;
//        }
//        else if (income>2.5f && income <= 5.0f) {
//            tax = tax + 0.05f * (income - 2.5f);
//        }
//        else if (income>5.0f && income <= 10.0f){
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (income - 5f);
//        }
//        else if (income>10.0f){
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (10.0f - 5f);
//            tax = tax + 0.3f * (income - 10.0f);
//        }
//        System.out.println("income tax:"+ tax);
//
//

        // condition statement question
        // 1. Write a Java program to get a number from the user and print whether it is positive or negative.

//        System.out.println("input your Number:");
//        int a = sc.nextInt();
//        if (a>0){
//            System.out.println("Number is positive");
//        } else if (a<0) {
//            System.out.println("Number is negative");
//
//        }else {
//            System.out.println("Number is zero");
//        }


//        2. Write a Java program to solve quadratic equations (use if, else if and else).

//        System.out.println("Input a :");
//        double a = sc.nextDouble();
//        System.out.println("Input b :");
//        double b = sc.nextDouble();
//        System.out.println("Input c :");
//        double c = sc.nextDouble();
//
//        double resalt =b*b-4.0*a*c;
//
//        if (resalt>0.0) {
//            double r1 = (-b + Math.pow(resalt, 0.5) / (2.0 * a));
//            double r2 = (-b + Math.pow(resalt, 0.5)) / (2.0 * a);
//            System.out.println("The roots are:"+r1 +"and"+r2);
//
//        } else if (resalt==0.0) {
//            double r1 = (2.0*a);
//            System.out.println("The roots are:"+r1);
//        }else {
//            System.out.println("The equations has no real roots ");
//    }

        // 3. Take three numbers from the user and print the greatest number.


     /*   int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a>b){
            System.out.println(a+" is greatest");
        }else {
            if (b>a){
                System.out.println(b+" is greatest");
            } else if (a>c) {
                System.out.println(a+" is greatest");
            } else if (c>a) {
                System.out.println(c+" is greatest");
            } else if (b>c) {
                System.out.println(b+" is greatest");
            } else if (c>b) {
                System.out.println(c+" is greatest");
            } else {
                System.out.println("Some numbers are same");
            }
        }

      */

//        1.
//        Take 10 integer inputs from user and store them in an array and print them on screen.


//        int[] n;
//        n = new int[10];
//        for (int i= 0;i<n.length; i++){
//            System.out.println("Enter the value of n:"+n);
//            n[i]  = sc.nextInt();
//        }
//        for (int i= 0 ; i<n.length;i++){
//            System.out.println("The value of n"+i+" is "+ n[i]);
//        }
//  2.

//        Scanner sc = new Scanner(System.in);
//        String input = sc.next();
//        if (palindrome.isPalindrome(input))
//        {
//            System.out.println("Yes");
//        }
//        public static boolean







    }
}
