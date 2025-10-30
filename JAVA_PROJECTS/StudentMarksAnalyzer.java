import java.util.*;

public class StudentMarksAnalyzer 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        int sum = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        System.out.println("Enter marks:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
            sum += marks[i];
            if (marks[i] > max) max = marks[i];
            if (marks[i] < min) min = marks[i];
        }

        double avg = (double) sum / n;
        System.out.println("Average: " + avg);
        System.out.println("Highest: " + max);
        System.out.println("Lowest: " + min);
                sc.close();

    }
}
