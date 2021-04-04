public class SalesCommission {
    public static void main(String[] args) {
        int saleid = 05;
        String sellerName = "Thomas";
        double saleAmount = 50000;
        double basicSalary = 20000;

        if (saleAmount>=50000){
            System.out.println(sellerName + " basic Salary is "+ basicSalary + " & Commision from sale is "+ saleAmount*0.35);
        }
        else if (saleAmount>=30000){
            System.out.println(sellerName + " basic Salary is "+ basicSalary + " & Commision from sale is "+ saleAmount*0.20);
        }
        else if (saleAmount>=20000){
            System.out.println(sellerName + " basic Salary is "+ basicSalary + " & Commision from sale is "+ saleAmount*0.10);
        }
        else if (saleAmount>=10000){
            System.out.println(sellerName + " basic Salary is "+ basicSalary + " & Commision from sale is "+ saleAmount*0.05);
        }
        else {
            System.out.println(sellerName + " basic Salary is "+ basicSalary + " & Commision from sale is "+ saleAmount*0.02);
        }

    }

}
