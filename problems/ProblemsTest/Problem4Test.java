import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem4Test {
    @Test
    void emptyArrayShouldReturnOne(){
        assertEquals(1,Problem4.firstMissingPostiveNumber(new int[1]));
    }
    @Test
    void negativeNumbersShouldReturnOne(){
        int [] input = {-1,-2,-3};
        assertEquals(1,Problem4.firstMissingPostiveNumber(input));

    }
    @Test
    void PostiveNumbersShouldReturnFirstMissing(){
        int [] input={1,2,4};
        assertEquals(3,Problem4.firstMissingPostiveNumber(input));

    }
    @Test
    void duplicatesShouldNotEEffectResult(){
        int[] input ={1,1,1};
        assertEquals(2,Problem4.firstMissingPostiveNumber(input));

    }
    @Test
    void NegativeAndPostiveAndDuplicates(){
        int [] input={1,2,3,3,-1,-2};
        assertEquals(4,Problem4.firstMissingPostiveNumber(input));
    }
    @Test
    void numbersFromOneToArrayLengthShouldReturnArrayLengthPlus1(){
        int [] input = new int[10000];
        for (int i=1;i<=input.length;i++){
            input[i-1]=i;
        }
        assertEquals(input.length+1,Problem4.firstMissingPostiveNumber(input));

    }

}