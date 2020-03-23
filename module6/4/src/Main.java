import Employee.Company;
import Employee.Employee;

public class Main {

    //public static int quantityM;

    public static void main(String[] args) {

        int quantityM = 10;
        Company OOO = new Company(quantityM);
        System.out.println("getIncome Company" + Company.getIncome());

    }
}
