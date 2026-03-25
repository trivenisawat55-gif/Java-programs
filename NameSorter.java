import java.util.Scanner;

public class NameSorter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Get the number of names
        System.out.print("Enter the number of names: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline character

        String[] names = new String[n];

        // 2. Input the names
        System.out.println("Enter " + n + " names:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }

        // 3. Bubble Sort Logic
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                // compareTo returns positive if names[j] > names[j+1]
                if (names[j].compareTo(names[j + 1]) > 0) {
                    // Swap names
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }

        // 4. Display the result
        System.out.println("\nNames in Ascending Order:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
