import java.util.Scanner;

public class Demo2 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // code for scanner class

        // String input
        System.out.println("Enter name:");
        String name = myObj.nextLine();


        // Numerical input
        System.out.println("Enter age :");
        int age = myObj.nextInt();
        System.out.println("Enter Salary:");
        double salary = myObj.nextDouble();

        // Output input by user
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }


}
