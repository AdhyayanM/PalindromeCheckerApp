import java.util.Scanner;
public class PalindroneCheckerApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Palindrome Checker App Management System");
<<<<<<< HEAD
        System.out.println("Enter string to check: ");
        String input = scanner.nextLine();
=======
        String input = "madam";
>>>>>>> baf42b4a3c073b9c614adb5fc8ea3ee1a4469de8
        String front = "";
        for (int i = 0; i < input.length(); i++) {
            front += input.charAt(i); // add each character
        }
        System.out.println("Front collected: " + front);
<<<<<<< HEAD
=======


>>>>>>> baf42b4a3c073b9c614adb5fc8ea3ee1a4469de8
        String reverse = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse += input.charAt(i);
        }

        System.out.println("Reverse collected: " +reverse);
        if (reverse.equals(front)) {
            System.out.println("Palindrome");}
        else
            System.out.println("Not Palindrome");

    }
}