package BasicOfJava;

import java.util.Scanner;

class Motion {
    public static void main (String [] args ) {
        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
        String [] userName = new String[1];
        String [] Password = new String[1];
        for (int i=0; i<1; i++){
            System.out.println("Enter Your Username");
            userName[i] = sc.nextLine();
            }
        for(int j=0; j<1; j++){
            System.out.println("Enter Your Password");
           Password[j] = sc.nextLine();
        }
        sc.close();
        if (userName.equals(Password)){
            System.out.println("Hello "+ userName);
        }else {
            System.out.println("user Not Found");
        }

//        String userName , Password;
//        userName = sc.nextLine();
//        Password = sc.nextLine();
//        if (userName.equals(Password)){
//            System.out.println("Hello " + userName);
//        }else {
//            System.out.println(" user Not Found ");
//        }
    }
}