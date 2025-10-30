import java.util.*;

public class PositiveNegativeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int posSum = 0, negSum = 0;

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] >= 0) posSum += arr[i];
            else negSum += arr[i];
        }

        System.out.println("Sum of Positive: " + posSum);
        System.out.println("Sum of Negative: " + negSum);
                sc.close();

    }
}
