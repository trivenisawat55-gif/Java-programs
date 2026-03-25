import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Get input from user
        System.out.print("Enter a string: ");
        String original = sc.nextLine();
        
        String reversed = ""; // This will hold the backward version

        // 2. Reverse the string using a simple loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // 3. Compare original and reversed (ignoring Case)
        if (original.equalsIgnoreCase(reversed)) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }
    }
}
