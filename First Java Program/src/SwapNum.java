public class SwapNum {

    public static void main(String[] args) {

        int temp;
        int a = 10; // given value to each
        int b = 20; // given value to each

        System.out.println("Numbers before swapping a is " + a + " & b is "+ b );
        temp = a;
        a = b;
        b = temp;
        System.out.println("Numbers after swapping a is " + a + " & b is "+ b );

    }

}
