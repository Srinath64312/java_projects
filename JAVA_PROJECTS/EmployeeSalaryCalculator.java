import java.util.*;

public class EmployeeSalaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        int[] id = new int[n];
        double[] salary = new double[n];
        double sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Employee ID: ");
            id[i] = sc.nextInt();
            System.out.print("Salary: ");
            salary[i] = sc.nextDouble();
            sum += salary[i];
        }

        double avg = sum / n;
        System.out.println("Average Salary: " + avg);
        System.out.println("Above average:");
        for (int i = 0; i < n; i++)
            if (salary[i] > avg)
                System.out.println("ID: " + id[i] + ", Salary: " + salary[i]);

        System.out.println("Below average:");
        for (int i = 0; i < n; i++)
            if (salary[i] < avg)
                System.out.println("ID: " + id[i] + ", Salary: " + salary[i]);

                        sc.close();

    }

}
