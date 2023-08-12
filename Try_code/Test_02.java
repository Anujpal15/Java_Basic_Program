package Try_code;

import java.util.Scanner;

public class Test_02 {
    static boolean autoMorphic(int num){
        int square = num * num;
        while (num > 0) {
            if (num % 10 != square % 10)
                return false;
            num /= 10;
            square /= 10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(autoMorphic(n));

    }
}
