package BasicOfJava;

import javax.swing.JOptionPane;

public class jOptionsPlan {
    public static void main(String[] args)
    {
//        String s;
       String s = JOptionPane.showInputDialog
        ("Enter an integer:");
        int x = Integer.parseInt(s);
        System.out.println("You entered " + x + ".");
    }
}