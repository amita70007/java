public class calculater01{


    public void addition01(int x, int y) {
        System.out.println("Addition of " + x + " and " + y + " = " + (x + y));
    }
    public  void substraction(int a, int b ){
        System.out.println("Substraction of " + a + "and " + b + " = " + (a-b));
    }
    public static void multiplication(int a,int b) {
        System.out.println("multiplication of " + a + "and " + b + " = " + (a * b));
    }

        public static void division1 (int a,int b) {
            System.out.println("division of " + a + "and " + b + " = " + (a / b));
        }

        public static void main(String[] args){

        calculater01 calculater01= new calculater01();
        calculater01.addition01(2,5);
        calculater01.substraction(10,5);
        multiplication(10,5);
        division1(10,5);



        }



    }


