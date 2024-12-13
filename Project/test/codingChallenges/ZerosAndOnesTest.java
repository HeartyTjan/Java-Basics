package codingChallenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ZerosAndOnesTest {

    @Test
    public void convertEvenAndOddToZeroAndOnesTest(){
        int [] numbers = {4,5,8,8,8,2,9};
        numbers = ZerosAndOnes.convertEvenAndOddToZeroAndOnes(numbers);
        int [] expected = {0,1,0,0,0,0,1};
        assertArrayEquals(numbers,expected);
    }

    @Test
    public void concatArrayTest(){
        int [] numbers = {1,2,3,4,5};
        int [] secondNumber = {6,7,8,9,10};

        int [] result = ZerosAndOnes.concatArray(numbers,secondNumber);
        int [] expected = {1,6,2,7,3,8,4,9,5,10};
        assertArrayEquals(result,expected);
    }
}
