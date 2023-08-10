/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort_demo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author TNC
 */
public class Main {

    public static void main(String[] args) {

        //Ask user to enter a positive decimal number
        int number = Validator.checkNumber("Enter number of array:");

        //generate random integer number in number range for each element of array
        int[] array = new int[number];

        inputArray(array);
//        //display the unsorted array
        displayArray("Unsorted Array: ", array);

        //using bubblesort to sort the array
        bubbleSort(array);

        //display the sorted array
        displayArray("Sorted Array: ", array);
    }

    private static int inputNumber() {
        //user enter number of array
        int number = Validator.checkNumber("Enter number of array:");
        return number;

    }

    private static void displayArray(String message, int[] array) {

        System.out.print(message);

        System.out.print(Arrays.toString(array));

    }

    private static void inputArray(int[] array) {
        Random random = new Random();
        //loop to gennerate all elements in array
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(array.length);
        }

    }

    private static void bubbleSort(int[] array) {
        System.out.println("");

        //treverse i from the first to the element before the last one
        for (int i = 0; i <= array.length - 1; i++) {
            //traverse j from to the firs
            for (int j = 0; j < array.length - i - 1; j++) {

                //compare to adjacent element,if the pre-element is  
                //greater than the next one then swap them
                if (array[j] > array[j + 1]) {
//                    System.out.println(Arrays.toString(array) + "\t " + array[j] + " > " + array[j + 1] + ", swap");

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

//                } else if (array[j] == array[j + 1]) {
//                    System.out.println(Arrays.toString(array) + "\t " + array[j] + " = " + array[j + 1] + ", ok");
//                } else {
//                    System.out.println(Arrays.toString(array) + "\t " + array[j] + " < " + array[j + 1] + ", ok");
                }
            }
//            System.out.println("");

        }
//        System.out.println(Arrays.toString(array) + "\t" + " sorted");
    }

    private static int[] sampleArray() {
        int[] array = {5, 1, 12, -5, 16};
        return array;
    }
}
