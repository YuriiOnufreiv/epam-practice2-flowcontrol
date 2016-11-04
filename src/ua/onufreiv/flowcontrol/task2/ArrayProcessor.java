package ua.onufreiv.flowcontrol.task2;

import java.util.Arrays;

/**
 * Created by yurii on 11/4/16.
 */
public class ArrayProcessor {
    private int[] initialArray;
    private int amount = 0;
    private int max = 0;
    private int min = 0;
    private double average;

    public ArrayProcessor(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("The length of array is 0");
        }

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

    @Override
    public String toString() {
        return "Info for array: " + Arrays.toString(initialArray) +
                "\n" + String.format("Amount: %7d", amount) +
                "\n" + String.format("Minimal: %6d", min) +
                "\n" + String.format("Maximal: %6d", max) +
                "\n" + String.format("Average: %6.2f", average);
    }
}
