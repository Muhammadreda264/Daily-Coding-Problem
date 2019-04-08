import java.util.Arrays;

/**
 * This problem was asked by Uber.
 * Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.
 * For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
 * Follow-up: what if you can't use division?
 */

public class Problem2 {


    /**
     * @param input
     * @return a new array such that each element at index i of the new array is the product of all the numbers except self
     * or array =={1} if the input array is null or has only one index.
     */
    public static long [] productArrayWithDivision(final int [] input){
        long[] result =new long[input.length];
        long productOfInputArray= Arrays.stream(input).reduce(1, (a, b) -> a * b);

        for (int i=0;i<result.length;i++){
            result[i]=1;
        }
        for (int i=0;i<input.length;i++){
            try {
                result[i]=productOfInputArray/input[i];

            }catch (ArithmeticException e){
                return result;
            }
        }
        return result;
    }

    public static long [] productArrayWithoutDivision(final int [] input){
        long[] result =new long[input.length];
        for (int i=0;i<result.length;i++){
            result[i]=1;
        }
        if (input.length<2){
            return result;
        }
        long leftProduct=1;

        for (int i=1 ;i<result.length;i++){
            leftProduct*=input[i-1];
            result[i]*=leftProduct;
        }
        long rightProduct=1;

        for (int i=result.length-2;i>-1;i--){
            rightProduct*=input[i+1];
            result[i]*=rightProduct;

        }

        return result;
    }

}
