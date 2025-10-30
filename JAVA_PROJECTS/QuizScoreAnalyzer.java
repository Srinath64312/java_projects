import java.util.*;

public class QuizScoreAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int s = sc.nextInt();
        System.out.print("Enter number of subjects: ");
        int sub = sc.nextInt();
        int[][] scores = new int[s][sub];
        int[] total = new int[s];
        double[] avg = new double[s];

        for (int i = 0; i < s; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            for (int j = 0; j < sub; j++) {
                scores[i][j] = sc.nextInt();
                total[i] += scores[i][j];
            }
            avg[i] = (double) total[i] / sub;
        }

        for (int i = 0; i < s; i++)
            System.out.println("Student " + (i + 1) + " - Total: " + total[i] + ", Average: " + avg[i]);
                    sc.close();

    }
}
