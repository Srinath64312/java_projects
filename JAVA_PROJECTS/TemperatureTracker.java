import java.util.*;

public class TemperatureTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] temp = new double[7];
        double sum = 0, max = Double.MIN_VALUE, min = Double.MAX_VALUE;
        int hotDay = 0, coldDay = 0;

        System.out.println("Enter temperatures for 7 days:");
        for (int i = 0; i < 7; i++) {
            temp[i] = sc.nextDouble();
            sum += temp[i];
            if (temp[i] > max) { max = temp[i]; hotDay = i + 1; }
            if (temp[i] < min) { min = temp[i]; coldDay = i + 1; }
        }

        System.out.println("Average Temp: " + sum / 7);
        System.out.println("Hottest Day: Day " + hotDay + " (" + max + ")");
        System.out.println("Coldest Day: Day " + coldDay + " (" + min + ")");
                sc.close();

    }
}
