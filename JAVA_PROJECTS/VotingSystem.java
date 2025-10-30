import java.util.*;

public class VotingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of candidates: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] names = new String[n];
        int[] votes = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Candidate " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        System.out.print("Enter number of voters: ");
        int v = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < v; i++) {
            System.out.print("Vote for: ");
            String vote = sc.nextLine();
            for (int j = 0; j < n; j++)
                if (names[j].equalsIgnoreCase(vote))
                    votes[j]++;
        }

        int max = 0, winner = 0;
        for (int i = 0; i < n; i++)
            if (votes[i] > max) { max = votes[i]; winner = i; }

        System.out.println("Winner: " + names[winner] + " with " + max + " votes.");
                sc.close();

    }
}
