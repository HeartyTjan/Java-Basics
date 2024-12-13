package codingChallenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MyDailyCodingChallengeTest {

    @Test
    public void quicksortTest(){
        int [] numbers = {9,2,1,7,4};
        int start = 0;
        int end = numbers.length - 1;
        int [] results = MyDailyCodingChallenge.quicksort(numbers,start,end);
        int [] expected = {1,2,4,7,9};
        assertArrayEquals(expected,results);
    }

    @Test
    public void findHighestProductTest(){
        int [] numbers = {2,3,-8,5,7,9,-9,10};
        int [] results = MyDailyCodingChallenge.findHighestProduct(numbers);
        int [] expected =  {9,10};
        assertArrayEquals(expected,results);

    }
}
