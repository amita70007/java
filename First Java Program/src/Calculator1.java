public class Calculator1 {

        static int a = 10;
        static int b = 5;
        static int total = a+b;
        static int subtraction;
        static int multiplication;
        static int division;
        public static void main (String[] args){

            //total = a+b;
            subtraction = a-b;
            multiplication = a*b;
            division = a/b;

            System.out.println("Addition of " + a +" & "+ b +" = "+total);
            System.out.println("Substration of " + a + " & " + b + " = " + subtraction);
            System.out.println("Multiplication of "+ a + " & " + b + " = " + multiplication);
            System.out.println("Divison of " + a + " & "+ b + " = "+ division);

        }




}
