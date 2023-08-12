package Try_code;

import java.util.Scanner;

public class Test_01{
    static void convertNumber (char [] num){
        int length = num.length;
        if (length == 0) {
            System.out.println("The String is Empty");
            return;
        }
        if (length > 4) {
            System.out.println("\n The given number has more than 4 digits.");
            return;
        }
        String[] oneDigit = new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] twoDigits = new String[] {"", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

        String[] multipleOfTens = new String[] {"",  "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String[] powerOfTens = new String[] {"Hundred", "Thousand"};
        System.out.println(String.valueOf(num)+": ");
        if (length == 1) {
            System.out.println(oneDigit[num[0]-'0']);
            return;
        }
        int x =0;
        while (x < num.length) {
            if (length >= 3) {
                if (num[x] - '0' != 0) {
                    System.out.println(oneDigit[num[0]-'0']+" ");
                    System.out.println(powerOfTens[length -3]+" ");
                }
                --length;
            }
            else {

                if (num[x]-'0' ==1){
                    int sum = num[x]-'0' + num[x+1]-'0';
                    System.out.println(twoDigits[sum]);
                    return;
                }
                else if (num[x]-'0' ==2 && num[x+1]-'0' == 0){
                    System.out.println("Twenty");
                    return;
                }
                else{
                    int i = (num[x]='0');
                    if (i > 0) System.out.println(multipleOfTens[i]+" ");
                    else System.out.println("");
                    ++x;
                    if (num[x] -'0' != 0) System.out.println(oneDigit[num[x]-'0']);
                }
            }
            ++x;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        convertNumber(s.toCharArray());
        convertNumber("".toCharArray());

    }
}