import java.util.*;

public class BankTransactionSummary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of transactions: ");
        int n = sc.nextInt();
        double[] trans = new double[n];
        double deposit = 0, withdraw = 0;

        System.out.println("Enter transactions (+ for deposit, - for withdrawal):");
        for (int i = 0; i < n; i++) {
            trans[i] = sc.nextDouble();
            if (trans[i] > 0) deposit += trans[i];
            else withdraw += trans[i];
        }

        double balance = deposit + withdraw;
        System.out.println("Total Deposits: " + deposit);
        System.out.println("Total Withdrawals: " + Math.abs(withdraw));
        System.out.println("Balance: " + balance);
                sc.close();

    }
}
