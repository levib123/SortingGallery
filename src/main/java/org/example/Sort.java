package org.example;

public class Sort {

    /**
     * Should take in an array of two ints and changes it
     * to arrray with the numbers from smallest to largest.
     * @param nums
     */
    public static void sortTwo(int[] nums) {
      int temp = 0;

       if(nums[0] > nums[1]){
            temp = nums[0];
            nums[0] = nums[1];
            nums[1] = temp;

        }
    }

    /**
     * This function should take the two arrays and merge them into the inputArray.
     * The result should be in order from smallest to largest, with all the numbers from both arrays included.
     * @param inputArray - The original array that will come back changed.
     * @param array1 - A sorted list of numbers that is the size of half the length of the inputArray
     * @param array2 - A sorted list of numbers that is the size of half the length of the inputArray
     */
    public static void merge(int[] inputArray, int[] array1, int [] array2) {
            int i = 0; int j = 0; int k = 0;
            while(i < array1.length && j < array2.length){
                if(array1[i] <= array2[j] ){
                    inputArray[k] = array2[i];
                            i++;
                }
                else {
                    inputArray[k] = array2[j];
                    i++;

            }
            k++;
    }
            while (i < array1.length){
                inputArray[k] = array1[i];
                i++;
                k++;
            }
            while(j < array2.length){
                inputArray[k] = array2[j];
                j++;
                k++;
            }
        }
}
