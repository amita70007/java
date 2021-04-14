import java.util.*;
public class ArrayDoWhile {

    //*********Question no 1 ************************
    public static void checkArrayEquality(){
        System.out.println("**** Program 1 ****");

        Scanner s = new Scanner(System.in);
        System.out.println("Enter length Your array :");  // taking input from user
        int length = s.nextInt();
        int [] myArray1 = new int[length];
        int [] myArray2 = new int[length];
        System.out.println("Enter the elements of the array1:");

        for(int i=0; i<length; i++ ) {
            myArray1[i] = s.nextInt();
        }

        System.out.println("Enter the elements of the array2:");

        for(int i=0; i<length; i++ ) {
            myArray2[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(myArray1));  // sorting both arrays
        System.out.println(Arrays.toString(myArray2));


        boolean result1 = Arrays.equals(myArray1,myArray2);  // checking equality function

        if (result1) {
            System.out.println("both Arrays are equal");
        }
        else{
            System.out.println("both Arrays are not equal");
        }

    }

    public static void arraysSort(){
        System.out.println(" ");
        System.out.println("**** Program 2 ****");

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the array:");  // taking input from user
        int length = s.nextInt();
        int [] myArray1 = new int[length];

        System.out.println("Enter the elements of the array1:");  // taking input from user

        for(int i=0; i<length; i++ ) {
            myArray1[i] = s.nextInt();
        }

        int [] newArray = myArray1.clone();
        Arrays.sort(newArray);                  // sorting the array

        System.out.println("original Array is : "+ Arrays.toString(myArray1));
        System.out.println("Sorted Array is : "+ Arrays.toString(newArray));
    }

    public static void checkChar(){
        System.out.println(" ");
        System.out.println("**** Program 3 ****");

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your string to check 'a':");  // taking input from user
        String a1 = s.nextLine();
        a1 = a1.toLowerCase();
        int count = 0;

        // logic to check no of 'a' in string
        for(int i=0; i<a1.length(); i++){
            if (a1.charAt(i) == 'a')
            {
                count++;
            }
        }
        System.out.println("Total no of 'a' found in given string is :" + count);
    }
    public static void multiplicationTable (){

        System.out.println(" ");
        System.out.println("**** Program 4 ****");

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your table no:");     // taking input from user
        int num1 = s.nextInt();
        int j=1;

        do {

            System.out.println(num1 + " x "+ j + " = "+ num1*j);
            j++;
        }
        while (j<=10);

    }

    public static void FindCommonElement()
    {
        System.out.println(" ");
        System.out.println("**** Program 5 ****");

        // create/enter your Array 1 here
        int[] arr1 = {2,3,5,8,9,10};
        // create/enter your Array 2 here
        int[] arr2 = {6,8,10,2,12,15};

        System.out.println("Original Array 1: " + Arrays.toString(arr1)); // print Array 1
        System.out.println("Original Array 2: " + Arrays.toString(arr2)); // print Array 2


        Arrays.sort(arr1);
        Arrays.sort(arr2);


        // process to find the common elements
        System.out.print("Common Elements in both arrays are: ");

        for (int i = 0; i<arr1.length; i++){
            for(int j = 0; j<arr2.length; j++){
                if (arr1[i]==arr2[j]){
                    System.out.print(arr1[i] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        checkArrayEquality();
        arraysSort();
        checkChar();
        multiplicationTable();
        FindCommonElement();



    }




}
