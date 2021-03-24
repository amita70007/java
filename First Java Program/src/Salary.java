public class Salary {

    public static void main(String[] args) {
        int employeeid = 123;
        String name = "Nick";
        double basicsalary = 10000.00;
        double HRA = basicsalary*10/100;
        double DA = basicsalary*8/100;
        double TA = basicsalary*9/100;
        double PF = basicsalary*20/100;
        double GrossSalary = basicsalary + HRA + TA + DA - PF;

        System.out.println("basic salary of " + name + " : " + basicsalary);
        System.out.println("HRA of " + name + " : " +HRA);
        System.out.println("DA salary of " + name + " : " +DA);
        System.out.println("TA of " + name + " : " +TA);
        System.out.println("PF of " + name + " : " +PF);

        System.out.println("Gross salary of " + name + " : " +GrossSalary);








    }



}
