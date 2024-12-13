package codingChallenges;

import java.util.Arrays;

public class MyDailyCodingChallenge {
    public static int[] quicksort(int[] numbers, int start, int end) {
        if (start < end) {
            int partitionIndex = partition(numbers, start, end);
            quicksort(numbers, start, partitionIndex - 1);
            quicksort(numbers, partitionIndex + 1, end);

        }
        return numbers;
    }

    private static int partition(int[] numbers, int start, int end) {
        int pivot = numbers[end];
        int currentIndex = start;
        for (int index = start; index < end; index++) {
            if (numbers[index] < pivot) {
                swap(numbers, currentIndex, index);
                currentIndex++;
            }
        }
        swap(numbers, currentIndex, end);
        return currentIndex;
    }

    private static int [] swap(int[] numbers, int currentIndex, int end) {
        int temp = numbers[currentIndex];
        numbers[currentIndex] = numbers[end];
        numbers[end] = temp;
        return numbers;
    }

    public static int[] findHighestProduct(int[] numbers) {
        quicksort(numbers,0, numbers.length-1);
        int [] firstTwoAndLastTwo = new int[4];
        int count = 0;
        for (int index = 0; index < numbers.length; index++) {
                firstTwoAndLastTwo[count] = numbers[index];
                count++;
                if (index == 1) index = numbers.length -3;
        }

        if ( firstTwoAndLastTwo[0] * firstTwoAndLastTwo[1] > firstTwoAndLastTwo[2] * firstTwoAndLastTwo[3])
            return new int [] {firstTwoAndLastTwo[0],firstTwoAndLastTwo[1]};

        return new int[]{firstTwoAndLastTwo[2], firstTwoAndLastTwo[3]};
    }
}