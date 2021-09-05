/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Parker McLeod
 */

import java.util.Scanner;

public class Solution02 {

    public static void main(String[] args) {
        /*
        1. Prompt user to input a string.
        2. Create a new scanner 'scanner'.
        3. Store the user's string response into 'word'
        4. Calculate 'word' length as'length'.
        5. Print "'name' has 'length' characters".1
         */
        System.out.print("What is the input string? ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int length = word.length();
        System.out.print(word + " has " + length + " characters.\n");
    }
}