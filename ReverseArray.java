import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Get the size of the array
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // 2. Declare the array
        int[] numbers = new int[n];

        // 3. Read 'n' values into the array
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // 4. Display the array in reverse order
        System.out.println("\nNumbers in Reverse Order:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        
        System.out.println(); // Just for a clean new line at the end
    }
}
