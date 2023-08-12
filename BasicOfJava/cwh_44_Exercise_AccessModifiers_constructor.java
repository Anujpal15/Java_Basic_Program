package BasicOfJava;
import java.util.Scanner;

class Cylinder {
    int height;
    int radius;

    //    static Scanner sc= new Scanner(System.in);
    public Cylinder(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int n) {
        this.radius = n;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea() {
        System.out.println("The surface Area of Cylinder is : ");
        return 2 * radius * height * Math.PI + 2 * Math.PI * radius * radius;
    }

    public double volume() {

        System.out.println("The Volume of Cylinder is : ");
        return Math.PI * radius * radius * height;
    }
}

public class cwh_44_Exercise_AccessModifiers_constructor {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int heigth = sc.nextInt();
            int redius = sc.nextInt();

            Cylinder cr = new Cylinder(5,5);
            cr.setRadius(heigth);
            cr.setHeight(redius);
            System.out.println(cr.surfaceArea());
            System.out.println(cr.volume());
    }
}
