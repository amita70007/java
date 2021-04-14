import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HomeWork1 {

    //************************ Programme 01 *********************//
    // Random number function (Question 1).

    public static void getRandomNumber(Scanner sc) {
        System.out.println("");
        System.out.println("//************************ Programme 01 *********************// ");
        System.out.println("Enter your min number of range: ");
        int min = sc.nextInt();
        System.out.println("Enter your max number of range: ");
        int max = sc.nextInt();


        Random random = new Random();
        for (int i = 1; i <= 10; i++) {

            int k = random.nextInt(max - min) + min;
            System.out.println("random number " + i + " is : " + k);
        }
    }
    //************************ Programme 02 *********************//
    public static void fibonacciSeries(Scanner sc) {
        System.out.println("");
        System.out.println("//************************ Programme 02 *********************// ");
        System.out.println("Enter Fibonacci series number: ");
        int n = sc.nextInt();

        int count = n, num1 = 0, num2 = 1;
        System.out.print("Fibonacci Series of " + count + " numbers:");


        for (int i = 1; i <= count; i++) {
            System.out.print(num1 + " ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;

        }

    }
    //************************ Programme 03 *********************//
    public static void primeNumCheck(Scanner sc) {
        System.out.println("");
        System.out.println("//************************ Programme 03 *********************// ");
        int temp;
        boolean isPrime = true;

        System.out.println("Enter any number to check prime:");
        int num = sc.nextInt();

        for (int i = 2; i <= num / 2; i++) {
            temp = num % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        //If isPrime is true then the number is prime else not
        if (isPrime)
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is not a Prime Number");
    }
    //************************ Programme 04 *********************//
    public static void reverseNum(Scanner sc) {
        System.out.println("");
        System.out.println("//************************ Programme 04 *********************// ");
        System.out.println("Enter any number to reverse:");
        int num = sc.nextInt();

        int reversed = 0;

        for (; num != 0; num /= 10) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }

        System.out.println("Reversed Number: " + reversed);

    }

    //************************ Programme 05 *********************//
    public static void factorialNum(Scanner sc) {
        System.out.println("");
        System.out.println("//************************ Programme 05 *********************// ");

        System.out.println("Enter your number for Factorial:");
        int num1 = sc.nextInt();

        int z = 1;
        for (int i = 1; i <= num1; i++) {
            z = z * i;
        }
        System.out.println("Factorial of " + num1 + " is: " + z);


    }

    //************************ Programme 06 *********************//
    public static void totalOfNum(Scanner sc) {
        System.out.println("");
        System.out.println("//************************ Programme 06 *********************// ");
        System.out.println("Enter number for total:");
        int num = sc.nextInt();

        int count, total = 0;

        for (count = 1; count <= num; count++) {
            total = total + count;
        }

        System.out.println("Sum of first " + num + " natural numbers is: " + total);

    }

    //************************ Programme 07 *********************//
    public static void calculator(Scanner sc) {
        System.out.println("");
        System.out.println("//************************ Programme 07 *********************// ");
        System.out.println("Enter your number 1 for calculator:");
        Double num1 = sc.nextDouble();
        System.out.println("Enter your number 2 for calculator:");
        Double num2 = sc.nextDouble();
        System.out.println("Enter your operator + - * / for calculator:");
        char c1 = sc.next().charAt(0);

        switch (c1) {
            case '+':
                double total1 = num1 + num2;
                System.out.println("calculation of " + num1 + " " + c1 + " " + num2 + " = " + total1);
                break;

            case '-':
                double total2 = num1 - num2;
                System.out.println("calculation of " + num1 + " " + c1 + " " + num2 + " = " + total2);
                break;

            case '*':
                double total3 = num1 * num2;
                System.out.println("calculation of " + num1 + " " + c1 + " " + num2 + " = " + total3);
                break;

            case '/':
                double total4 = num1 / num2;
                System.out.println("calculation of " + num1 + " " + c1 + " " + num2 + " = " + total4);
                break;

            default:
                System.out.println("ERROR!! Please select valid numbers and operator: + - * /  ");
            }
        }



    //************************ Programme 08 *********************//
    public static void sumOfRange(Scanner sc) {
        System.out.println("");
        System.out.println("//************************ Programme 08 *********************// ");

        System.out.println("Enter your number from range 1-20: ");
        int num1 = sc.nextInt();
        int sum = 0;
        if (num1>20){
            System.out.println("please enter number from range 1-20 only");
        }
        else{
            for (int i = 1; i <= num1; ++i) {
                // sum = sum + i;
                sum += i;
            }

            System.out.println("Total Sum of range " + num1 + " is = " + sum);
        }
    }
    //************************ Programme 09 *********************//
    public static void numCheck() {
        System.out.println("");
        System.out.println("//************************ Programme 09 *********************// ");
        int i;
        ArrayList<Integer> myNum3 = new ArrayList<>();
        ArrayList<Integer> myNum5 = new ArrayList<>();
        ArrayList<Integer> myNum3to5 = new ArrayList<>();
        for (i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                myNum3.add(i);
                }

            }


        for (int j = 1; j <= 100; j++) {
            if (j % 5 == 0) {
                myNum5.add(j);
            }

        }
        System.out.println("list of number divided by 3 in range of 1-100 :" + myNum3);
        System.out.println("list of number divided by 5 in range of 1-100 :" + myNum5);

    }
    //************************ Programme 10 *********************//
    public static void multiplicationTable(Scanner sc) {
        System.out.println("");
        System.out.println("//************************ Programme 10 *********************// ");
        System.out.println("Enter your table number : ");
        int i = sc.nextInt();
        String text = sc.nextLine();


        System.out.println("Your table of selected number :" + i);
        for (int j = 1; j <= 10; j++) {
            System.out.println(i + " x " + j + " = " + j * i);
        }
    }
    //************************ Programme 11 *********************//
    public static void charCount(Scanner sc) {
        System.out.println("");
        System.out.println("//************************ Programme 11 *********************// ");
        System.out.println("Enter Word or Sentence : ");
        String text = sc.nextLine();

        int countWord = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.toLowerCase().charAt(i) == 'a') {
                countWord = countWord + 1;
            }
        }
        System.out.println("total number of 'a' found in selected word/sentence is :" + countWord);

    }
    //************************ Programme 12 *********************//
    public static void sumOfnum9(Scanner sc) {
        System.out.println("");
        System.out.println("//************************ Programme 12 *********************// ");

        System.out.println("Enter your first number of range: ");
        int first = sc.nextInt();
        System.out.println("Enter your second number of range: ");
        int second = sc.nextInt();
        int sum = 0;
        for (int i = first; i <= second; ++i) {
            if (i % 9 == 0) {
                System.out.println(i);
                sum += i;
                }
            }
        System.out.println("Total Sum of range " + first + " to " + second + " & divisible by 9 is = " + sum);
        }
    //************************ Programme 13 *********************//
    public static void smallLargeNum(Scanner sc){
        System.out.println("");
        System.out.println("//************************ Programme 13 *********************// ");
        System.out.println("program to find largest and smallest of three numbers");
        System.out.println("Please enter first number :");
        int first = sc.nextInt();
        System.out.println("Please enter second number :");
        int second = sc.nextInt();
        System.out.println("Please enter third number :");
        int third = sc.nextInt();

        int largest = largest(first, second, third);
        int smallest = smallest(first, second, third);
        System.out.printf("largest of three numbers %d, %d, and %d is : %d %n", first, second, third, largest);
        System.out.printf("smallest of three numbers %d, %d, and %d is : %d %n", first, second, third, smallest);


        }
    public static int largest(int first, int second, int third) {
        int max = first;
        if (second > max) {
            max = second;
            }
        if (third > max) {
            max = third;
            }
        return max;
        }
    public static int smallest(int first, int second, int third) {
        int min = first;
        if (second < min) {
            min = second;
            }
        if (third < min) {
            min = third;
            }
        return min;
        }
    //************************ Programme 14 *********************//
    public static void sumAveOfRange(Scanner sc){
        System.out.println("");
        System.out.println("//************************ Programme 14 *********************// ");
        System.out.println("Enter your min number of range: ");
        int min = sc.nextInt();
        System.out.println("Enter your max number of range: ");
        int max = sc.nextInt();


        int sum = 0;
        int count = 0;

        for (int i = min+1; i < max; ++i) {
            // sum = sum + i;
            sum += i;
            count=max-min+1;
        }
        double average = sum/count;
        System.out.println("Total Sum of range " + min + " to " + max + " is = " + sum);
        System.out.println("Average of "  + min + " to " + max + " is = " + average);


    }
    //************************ Programme 15 *********************//
    public static void triangularPattern(Scanner sc){
        System.out.println("");
        System.out.println("//************************ Programme 15 *********************// ");
        System.out.println("Please enter your number for triangle pattern :");
        int row = sc.nextInt();

        for (int i=0; i<row; i++){
            for (int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }



    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


         getRandomNumber(sc);              // Random number function (Question 1).
          fibonacciSeries(sc);             // Fobonacci series function (Question 2).
          primeNumCheck(sc);              // Prime number checks function (Question 3).
          reverseNum(sc);                  // reverse number function (Question 4).
          factorialNum(sc);               // factorial number function (Question 5).
          totalOfNum(sc);                   // total of natural number function (question 6).
          calculator(sc);                    // Calculator for user numbers and operator(Question 7).
          sumOfRange(sc);                   // sum of range function (Question 8).
          numCheck();                       // Function to print number divided by 3 and 5 (Question 9).
          multiplicationTable(sc);         // Function to create table of selected number (Question 10).
          charCount(sc);                    // function to checks 'a' word count in user input (Question 11).
          sumOfnum9(sc);                   //  sum of numbers between a & b which are divisible by 9 (Question 12).
          smallLargeNum(sc);               // function to find smallest and largest of 3 number (question 13).
         sumAveOfRange(sc);               // 	Find the average & sum between two numbers which user enters (Question 14).
        triangularPattern(sc);            // Triangular pattern function (Question 15).




    }

}

