package com.company;

import java.util.Scanner;

public class Palindrome {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Please enter your text: ");
        checkIfPalindrome(getTextFromConsole());
    }

    public static String getTextFromConsole() {
        String text = scanner.nextLine();
        return text;
    }

    public static boolean checkIfPalindrome(String text) {

        String reverse = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reverse = reverse + text.charAt(i);

            if (text.equals(reverse)) {
                System.out.println("Is palindrome.");
                return true;
            }
        }
        System.out.println("Is not palindrome.");
        return false;
    }
}
