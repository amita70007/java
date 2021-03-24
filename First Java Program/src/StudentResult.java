public class StudentResult {

    public static void main(String[] args) {
        String sname = "jack";
        int rollNo = 15;
        double subject1 = 30.0;
        double subject2 = 40.0;
        double subject3 = 40.0;
        double result = subject1 + subject2 + subject3;
        double percentage = (result / 300 * 100);

        System.out.println("student name is " + sname + " & his/her roll no is " + rollNo + "");
        System.out.println( sname + " result is : " + result);
        System.out.println(sname + " percentage is : " + percentage + " %");

        // pass fail logic

        if (percentage >= 35 ) {
            System.out.println(sname + " is pass");

        } else {
            System.out.println(sname + " is failed");
        }

        // grade logic

        if (percentage >= 80) {
            System.out.println(sname + " grade is A+");
        }
        else if (percentage>=60) {
        System.out.println(sname + " grade is A");
        }
        else if (percentage>=50) {
            System.out.println(sname + " grade is B");
        }
        else if(percentage>=35){
            System.out.println(sname + " grade is C");
        }



    }


    }





