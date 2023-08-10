/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort_demo;

import java.util.Scanner;

/**
 *
 * @author TNC
 */
public class Validator {

    private static Scanner in = new Scanner(System.in);

    static int checkNumber(String message) {

        while (true) {
            System.out.println(message);

            String result = in.nextLine().trim();

            if (result.trim().isEmpty()) {
                System.out.println("You can not input empty. Please enter a positive decimal number");
            } else if (result.trim().matches("^-?\\d*\\.\\d+$")) {
                System.out.println("Invalid! (" + result + ") is a double number. You have to input a positive decimal number. Please enter again!  ");
            } else if (result.matches("^-?\\d+$")) {
                int number = Integer.parseInt(result);
                if (number <= 0) {
                    System.out.println("Invalid! (" + result + ") is not positive. You have to input a positive decimal number. Please enter again! ");
                } else {
                    return number;
                }
            } else {
                System.out.println("Invalid! (" + result + ") is a string. You have to input a positive decimal number. Please enter again! ");
            }

        }

    }

}
