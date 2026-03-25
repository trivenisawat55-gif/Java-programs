import java.util.Scanner;
import java.util.Arrays; // Importing the tool to sort automatically

public class SimpleNameSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Get the number of names
        System.out.print("How many names do you want to enter? ");
        int count = sc.nextInt();
        sc.nextLine(); // This clears the "Enter" key from memory

        // 2. Create an array to store names
        String[] names = new String[count];

        // 3. Input the names
        System.out.println("Enter " + count + " names:");
        for (int i = 0; i < count; i++) {
            names[i] = sc.nextLine();
        }

        // 4. The Magic Line: This sorts everything alphabetically automatically
        Arrays.sort(names);

        // 5. Print the sorted list
        System.out.println("\nSorted Names (Ascending):");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
