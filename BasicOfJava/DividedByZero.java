package BasicOfJava;

import java.util.Scanner;

class DividedByZero{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();

        try
        {
            int answer = DividedTheseNumber(a,b);
        }catch (Exception e)
        {
            System.out.println("Tried twice, "
                    + "still didn't work!");
        }
    }
    static int DividedTheseNumber(int a, int b)
    throws Exception
    {
        int c;
        try
        {
            c=a/b;
        }catch (Exception e)
        {
            System.out.println("Didn't work the first time.");
            c = a / b;
            System.out.println("It worked the second time!");
        }
        finally
        {
            System.out.println("Better clean up my mess.");
        }
        System.out.println("It worked after all.");
        return c;
    }

}