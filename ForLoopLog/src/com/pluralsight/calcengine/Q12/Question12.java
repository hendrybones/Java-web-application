package com.pluralsight.calcengine.Q12;
import java.util.Locale;
import java.util.Scanner;

public class Question12 {

    public static void main(String[] args) {
        char[] letters = { 'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R',
                'S','T','U','V','W','X','Y','Z'};

        int letter_num = 0;

        // array of strings & get the letter
        String[] diamond = new String[26];
        System.out.print("Enter a Char between A to Z : ");

        try (Scanner scanner = new Scanner(System.in))
        {
            char supplied_letter = scanner.next("[A-Z]").charAt(0);



            // search for letter number in the array letter
            for (int i = 0; i < letters.length; i++) {
                if (letters[i] == supplied_letter) {
                    letter_num = i;
                    break;
                }
            }

            // construct diamond
            for (int i = 0; i <= letter_num; i++) {
                diamond[i] = "";
                // add initial spaces
                for (int j = 0; j < letter_num - i; j++) {
                    diamond[i] += " ";
                }

                // add letter (first time)
                diamond[i] += letters[i];

                // add space between letters
                if (letters[i] != 'A') {
                    for (int j = 0; j < 2 * i - 1; j++) {
                        diamond[i] += " ";
                    }
                    // add letter (second time)
                    diamond[i] += letters[i];
                }
                // Draw the first part of the diamond
                System.out.println(diamond[i]);
            }

            // Draw the second part of the diamond. Reverse order diamond array.
            for (int i = letter_num - 1; i >= 0; i--) {
                System.out.println(diamond[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}