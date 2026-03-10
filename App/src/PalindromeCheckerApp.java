import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
<<<<<<< HEAD
        String input = "radar";
        char[] chars = input.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome = false;
        while(start<end){
            if(chars[start] == chars[end]){
                isPalindrome = true;
            }
            start++;
            end--;
        }
        System.out.println("Input: " + input);
        System.out.println("is Palindrome? " + isPalindrome);
=======
        System.out.println("Welcome to Palindrome Checker App Management System");

        System.out.println("Enter string to check: ");
        String input = scanner.nextLine();

        String front = "";
        for (int i = 0; i < input.length(); i++) {
            front += input.charAt(i); // add each character
        }
        System.out.println("Front collected: " + front);




        String reverse = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse += input.charAt(i);
        }

        System.out.println("Reverse collected: " +reverse);
        if (reverse.equals(front)) {
            System.out.println("Palindrome");}
        else
            System.out.println("Not Palindrome");

>>>>>>> 940ac01a22a0d8d526b10e09ad24c86afed41c6c
    }
}