public class LeapYear {

    public static void main(String[] args) {

        int selectyr = 1992 ; // input your year

        if ( (selectyr % 4) == 0  && (selectyr % 100) == 0  || (selectyr % 400) ==0 )
        {
            System.out.println("This is Leap year : ");
        }
        else {
            System.out.println("This is NOT Leap year : ");
        }

    }








}
