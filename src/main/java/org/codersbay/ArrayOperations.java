package org.codersbay;

import java.util.Arrays;

/**
 * Utility class which performs various operations with integer arrays.
 */
public class ArrayOperations {
    private final int[] numbers;      // array that needs to be sorted.
    private final int[] unsorted;     // reference array which stays unsorted.

    public ArrayOperations(int[] numbers) {
        this.numbers = numbers;
        this.unsorted = numbers.clone();
    }

    /* **********************************************************
     *   Please implement the following methods.                 *
     *   It is intended that they are not static.                *
     * ***********************************************************/

    /**
     * Prints out the numbers array.
     */

    public void print() {
        System.out.print("[");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.print("]");
    }

    /**
     * @return the sorted numbers array.
     * @see <a href="sorting algortihms">http://faculty.cs.niu.edu/~hutchins/csci241/sorting.htm</a>
     */
    public int[] sort() {
        Arrays.sort(numbers);
        return numbers;
    }

    /**
     * @return the sorted array in reverse order
     */
    public int[] revertSort() {
        int [] result = new int[numbers.length];
        int j = 0;

        for (int i = numbers.length-1; i >= 0; i--) {
            result[j++] = numbers[i];
            System.out.println(result[i]);
        }
        return result;
    }

    /**
     * @return the unsorted array in reverted order.
     */
    public int[] reverted() {
        int [] resultSort = new int[unsorted.length];
        int j = 0;

        for (int i = numbers.length-1; i >= 0; i--) {
            resultSort[j++] = numbers[i];
            System.out.println(resultSort[i]);
        }
        return resultSort;
    }

    /**
     * @param value which should be searched for.
     * @return true if the array contains the value, false otherwise.
     */
        public boolean contains(int value) {
            for (int number : numbers) {
                if (number == value) {
                    return true;
                }
            }
            return false;
        }

    /**
     * @return the average value of all elements summed up.
     */
    public double average() {
        double sum = 0.0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum/numbers.length;
    }

    /**
     * @return the average value of all elements summed up, but without the highest and the lowest value.
     */
    public double trimmedMean() {
        int[] trimmed = new int[numbers.length - 2];
        int[] sorted = sort();
        int j  = 0;
        for (int i = 1; i < sorted.length - 1; i++) {
            trimmed[j++] = sorted[i];
        }

        return average(trimmed);
    }

    /**
     * @return the max value of the array. In the array [1,9,3] max would be 9.
     */
    public int maxValue() {
        return sort() [numbers.length-1];
    }

    /**
     * @return the min value of the array. In the array [1,9,3] min would be 1.
     */
    public int minValue() {
        return sort()[0];
    }

    /* **********************************************************
     *   Feel free to add as many private helper methods as      *
     *   you like.                                               *
     * ***********************************************************/

    private double average(int[] average) {
        double sum = 0.0;
        for (int number : average) {
            sum += number;
        }
        return sum / average.length;
    }
}