package BasicOfJava;
class myEmployee{
    int id;
    int Salary;
    String name;
    public void printDetails(){
        System.out.println("My id is"+ id);
        System.out.println("and my name is"+ name);
    }
    public int getSalary() {
        return Salary;
    }
}
public class cwh_38_Custom_Class {
    public static void main(String[] args) {
        System.out.println("this is our custom class");
        myEmployee aditya  = new myEmployee(); // instantiating a new Employee Object
       myEmployee John = new myEmployee();// instantiating a new Employee Object

        // Setting Attributes for Harry
        aditya.id = 12;
        aditya.Salary = 34;
        aditya.name = "CodewithHarry";

        // Setting Attributes for
        John.id = 17;
        John.Salary = 12;
        John.name = "John Khnadelewal";

        // Printing the Attributes
        aditya.printDetails();
        aditya.printDetails();
        int Salary = John.getSalary();
        System.out.println(Salary);
        System.out.println(aditya.id);
        System.out.println(aditya.name);
    }
}
