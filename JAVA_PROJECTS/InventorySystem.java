import java.util.*;

public class InventorySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] products = new String[10];
        int[] quantity = new int[10];
        int count = 0;

        while (true) {
            System.out.println("\n1.Add 2.Update 3.Search 4.Delete 5.Display 6.Exit");
            int ch = sc.nextInt(); sc.nextLine();
            if (ch == 1) {
                System.out.print("Product name: "); products[count] = sc.nextLine();
                System.out.print("Quantity: "); quantity[count] = sc.nextInt();
                count++;
            } else if (ch == 2) {
                System.out.print("Enter product name to update: ");
                String name = sc.nextLine();
                for (int i = 0; i < count; i++) {
                    if (products[i].equalsIgnoreCase(name)) {
                        System.out.print("New quantity: ");
                        quantity[i] = sc.nextInt();
                    }
                }
            } else if (ch == 3) {
                System.out.print("Enter product name to search: ");
                String name = sc.nextLine();
                for (int i = 0; i < count; i++)
                    if (products[i].equalsIgnoreCase(name))
                        System.out.println(name + ": " + quantity[i]);
            } else if (ch == 4) {
                System.out.print("Enter product name to delete: ");
                String name = sc.nextLine();
                for (int i = 0; i < count; i++) {
                    if (products[i].equalsIgnoreCase(name)) {
                        for (int j = i; j < count - 1; j++) {
                            products[j] = products[j + 1];
                            quantity[j] = quantity[j + 1];
                        }
                        count--;
                        break;
                    }
                }
            } else if (ch == 5) {
                for (int i = 0; i < count; i++)
                    System.out.println(products[i] + " - " + quantity[i]);
            } else break;
        }
                sc.close();

    }
}
