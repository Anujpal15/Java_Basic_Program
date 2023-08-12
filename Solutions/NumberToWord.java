package Solutions;

import java.util.Scanner;

public class NumberToWord
{

    static void numberToWords(char num[])
    {
        int length = num.length;
        if (length == 0)
        {
            System.out.println("The string is empty.");
            return;
        }
        if (length > 4)
        {
            System.out.println("\n The given number has more than 4 digits.");
            return;
        }
        String[] onedigit = new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] twodigits = new String[] {"", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

        String[] multipleoftens = new String[] {"",  "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String[] poweroftens = new String[] {"Hundred", "Thousand"};
        System.out.print(String.valueOf(num) + ": ");
        if (length == 1)
        {
            System.out.println(onedigit[num[0]-'0']);
            return;
        }
        int x = 0;
        while (x < num.length)
        {
            if (length >= 3)
            {
                if (num[x] - '0' != 0)
                {
                    System.out.print(onedigit[num[x] - '0'] + " ");
                    System.out.print(poweroftens[length - 3]+ " ");
                }
                --length;
            }
            else
            {
                if (num[x] - '0' == 1)
                {
                    int sum = num[x] - '0' + num[x + 1] - '0';
                    System.out.println(twodigits[sum]);
                    return;
                }

                else if (num[x] - '0' == 2 && num[x + 1] - '0' == 0)
                {
                    System.out.println("Twenty");
                    return;
                }
                else
                {
                    int i = (num[x] - '0');
                    if (i > 0)
                        System.out.print(multipleoftens[i]+ " ");
                    else
                        System.out.print("");
                    ++x;
                    if (num[x] - '0' != 0)
                        System.out.println(onedigit[num[x] - '0']);
                }
            }
            ++x;
        }
    }
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        numberToWords(s.toCharArray());
        numberToWords("".toCharArray());
    }
}