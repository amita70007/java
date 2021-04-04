import java.util.*;

public class Demo1 {


    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter your number of table : ");

        int i = myObj.nextInt();  // Read user input
        System.out.println("table of your selected " + i +" number is : ");// Output user input

        int x = i;
        for (x=i; x<=i; x++) {
            for (int j = 1; j <= 10; j++){
                System.out.println(x + " x " + j + " = "+ x*j );
            }
        }
    }

}



