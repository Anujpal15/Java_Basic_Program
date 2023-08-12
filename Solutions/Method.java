package Solutions;


import static java.util.Arrays.copyOf;
import static java.util.Arrays.sort;

public class Method {
    public static void main(String[] args) {
        int number [] = {1,8,6,1,987,3,31,79,764};

        sort(number);

        int [] copy = copyOf(number, number.length);
        for (int print : copy){
            System.out.print(print  + " ");
        }
    }
}
