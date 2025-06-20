package questions;
import java.util.Scanner;
public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numEmployees = 10;
        double[][] employeeData = new double[numEmployees][2]; // [][0]=salary, [][1]=years of service
        double[] bonusArray = new double[numEmployees];
        double[] newSalaryArray = new double[numEmployees];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Enter details for employee " + (i + 1));

            System.out.print("Salary: ");
            double salary = input.nextDouble();
            System.out.print("Years of Service: ");
            double years = input.nextDouble();

            if (salary <= 0 || years < 0) {
                System.out.println("Invalid input. Please enter again.");
                i--;
                continue;
            }

            employeeData[i][0] = salary;
            employeeData[i][1] = years;
        }

        for (int i = 0; i < numEmployees; i++) {
            double salary = employeeData[i][0];
}
    }
}