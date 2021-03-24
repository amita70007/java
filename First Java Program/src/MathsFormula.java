import java.util.*;

public class MathsFormula {

    public static void main(String[] args) {

        int a = 30;
        int b = 10;

        Scanner symbol = new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter your Symbol either +*/- : ");
        String y = symbol.nextLine();
        System.out.println("your entered symbol is : "+ y);

        if (y.equals("+")){
            System.out.println("total of "+ a + y + b + " is " + (a+b));
        }
        else if (y.equals("-")) {
            System.out.println("total of "+ a + y + b + " is " + (a-b));
        }
        else if (y.equals("*")) {
            System.out.println("total of "+ a + y + b + " is " + (a*b));
        }
        else if (y.equals("/")) {
            System.out.println("total of "+ a + y + b + " is " + (a/b));
        }
        else {
            System.out.println("please enter valid input only");
        }


    }



}
