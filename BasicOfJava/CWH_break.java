package BasicOfJava;

public class CWH_break {
    public static void main(String[] args) {
        //using for loop
        for(int i=10;i>0;i--){
            if(i==7){
                break;   //break the loop
            }
            System.out.println(i);
        }

        for(int i=7;i>0;i--){
            if(i==3){
                continue;//continue skips the rest statement
            }
            System.out.println(i);
        }
    }
}
