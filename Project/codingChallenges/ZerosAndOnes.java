package codingChallenges;

import java.util.Arrays;

public class ZerosAndOnes {

        public static void main(String[] args) {
            int [] numbers = {1,2,3,4,5};
            int [] secondNumbers = {6,7,8,9,10};
            int [][] transposeNumbers = {{1,2,3},
                                        {4,5,6},
                                        {7,8,9}};

            int [] result =concatArray(numbers,secondNumbers);
            System.out.println(Arrays.toString(result));

           int [][] results = transposeArray(transposeNumbers);
           int count = 0;
           for(int [] values : results) {
               for(int value : values) {
                   System.out.print(value+" ");
                   count++;
                   if (count % 3 == 0)System.out.println();

               }
           }

        }
        public static int [] convertEvenAndOddToZeroAndOnes(int [] numberList){
            for (int index = 0; index < numberList.length; index++) {
                if(numberList[index] % 2 ==0)numberList[index] = 0;
                else numberList[index] = 1;
            }
            return numberList;
        }

        public static int[] concatArray(int[] numbers, int[] secondNumber) {
            int [] result = new int[numbers.length + secondNumber.length];
            for (int index = 0; index < result.length; index++) {
                if (index < numbers.length) {
                    result[index * 2] = numbers[index];
                }
                if (index < secondNumber.length) {
                    result[index * 2 + 1] = secondNumber[index];
                }
            }

            return result;
        }

        public static int [][] transposeArray(int[][] numbers) {

            int [][] transpose = new int[numbers.length][numbers.length];

            for(int index = 0; index < numbers.length; index++) {

                for (int index2 = 0; index2 < numbers.length; index2++) {

                    transpose[index][index2] = numbers[index2][index];
                }
            }
            return transpose;
        }
}



