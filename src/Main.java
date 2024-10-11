//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Course c1 = Course.Math;
        //Course c2 = Course.Math;
        //Course c2 = Course.Database;
        Course c2 = Course.Database;

       // System.out.println(c1);
        System.out.println(c1.toString()); // Math
        System.out.println(c1.ordinal()); // Index = 2


        //System.out.println(c1.compareTo(c2)); // index Math = index Math => result 0;
        //System.out.println(c1.compareTo(c2)); // index Math > index Database => result +2;
        System.out.println(c2.compareTo(c1)); //index Database < index Math => result -2;


    }
}