/**
 * Flow control. Task 2
 */
package ua.onufreiv.flowcontrol.task2;

import java.util.Arrays;

/**
 * Class allows to find the amount of numbers in array, it's minimal, maximal and average values
 *
 * @version 1.0
 * @author Yurii Onufreiv
 */
public class ArrayProcessor {
    private int[] initialArray;
    private int amount = 0;
    private int max = 0;
    private int min = 0;
    private double average;

    /**
     * Parametrized constructor. Receives the array for further processing, then finds the
     * amount of numbers in array, it's minimal, maximal and average values
     * @param numbers array for further processing
     */
    public ArrayProcessor(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("The length of array is 0");
        }

        processArray(numbers);
    }

    /**
     * Finds the amount of numbers in array, it's minimal, maximal and average values
     * @param numbers array of numbers
     */
    private void processArray(int[] numbers) {
        initialArray = numbers;
        min = initialArray[0];
        max = initialArray[0];
        amount = initialArray.length;

        double sum = 0.0;
        for (int number : initialArray) {
            if (number < min) {
                min = number;
            } else if (number > max) {
                max = number;
            }
            sum += number;
        }
        average = sum / amount;
    }

    public int[] getInitialArray() {
        return initialArray;
    }

    public int getAmount() {
        return amount;
    }

    public double getMax() {
        return max;
    }

    public double getMin() {
        return min;
    }

    public double getAverage() {
        return average;
    }

    /**
     * String representation of current object
     * @return string, containing initial array, numbers amount, minimal and maximal numbers,
     * and average value of all numbers
     */
    @Override
    public String toString() {
        return "Info for array: " + Arrays.toString(initialArray) +
                "\n" + String.format("Amount: %7d", amount) +
                "\n" + String.format("Minimal: %6d", min) +
                "\n" + String.format("Maximal: %6d", max) +
                "\n" + String.format("Average: %6.2f", average);
    }
}
