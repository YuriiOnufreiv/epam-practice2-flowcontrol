/**
 * Flow control. Task 2
 */
package ua.onufreiv.flowcontrol.task2;

import java.util.Scanner;

/**
 * Runner class for demonstrating the solution for Task 2 - finding amount of numbers,
 * minimal, maximal and average values for the randomly generated array
 *
 * @version 1.0
 * @author Yurii Onufreiv
 */
public class ArrayProcessorRunner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount of numbers: ");
        int amountOfNumbers = input.nextInt();
        int[] numbers = new int[amountOfNumbers];

        for (int i = 0; i < amountOfNumbers; i++)
        {
            System.out.printf("[%d]: ", i);
            numbers[i] = input.nextInt();
        }

        ArrayProcessor arrayProcessor = new ArrayProcessor(numbers);
        System.out.println("\nResult of precessing:");
        System.out.println(arrayProcessor);
    }

}
