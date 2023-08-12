package BasicOfJava;

public class cwh_14_String_Class {
    public static void main(String[] args) {
        String name = "Tony Stark";
        String Name = name.toLowerCase();
        System.out.println(Name);
        name = name.toUpperCase();
        System.out.println(name);
        String text = "Mareval Star Tony Stark";
        text = text.replace(" ","-");
        System.out.println(text);

        String letter = "Dear <|name|>, thanks a lots.";
        letter = letter.replace("<|name|>","anuj");
        System.out.println(letter);

        String mystring = "this string contain  double    and triple spaces ";
        System.out.println(mystring.indexOf("  "));
        System.out.println(mystring.indexOf("   "));


        String myname = "Dear Harry,\n\tThis java couse is very useful for me,\n\tthanks a lots";
        System.out.println(myname);

        String no_name = "Hello";
        String A = String.valueOf(no_name.length());
        System.out.println(A);

    }
}
