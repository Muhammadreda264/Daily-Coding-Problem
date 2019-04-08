import java.util.Arrays;

/**
 * This problem was asked by Stripe.
 *
 * Given an array of integers, find the first missing positive integer in linear time and constant space.
 *
 * In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.
 *
 * For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
 * You can modify the input array in-place.
 */
public class Problem4 {

    static int firstMissingPostiveNumber(int [] input){
        int MaxMissingNumber=input.length+1;
        // as we will never use array[0]
        int [] array = new int[MaxMissingNumber+1];
        Arrays.stream(input).filter(number -> number >=0 && number <array.length)
                .forEach(e -> array[e]=1);
        for (int i=1 ;i<array.length;i++){
            if (array[i]!=1){
                return i;
            }
        }
        return 1;
    }


}
