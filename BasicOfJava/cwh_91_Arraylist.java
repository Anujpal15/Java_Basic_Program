package BasicOfJava;

import java.util.ArrayList;

public class cwh_91_Arraylist {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(54);
        list.add(648);
        list.add(64);

        System.out.println(list);
        System.out.println("IndexOf method : " + list.indexOf(10));


    }
}
