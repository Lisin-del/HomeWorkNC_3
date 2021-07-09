package hw_3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Palindrome palindrome = new PalindromeWork();
        int userNumber;

        System.out.print("Enter your number: ");
        userNumber = scanner.nextInt();
        palindrome.isPalindrome(userNumber);
    }
}
