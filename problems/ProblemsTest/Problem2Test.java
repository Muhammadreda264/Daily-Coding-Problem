import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem2Test {

    @Test
    void isEmptyArrayReturnArrayWithOneIndexAndTheIndexHaveValueOfOne(){
        int []input=new int[1];
        long [] result={1};
        assertArrayEquals(result,Problem2.productArrayWithDivision(input));
        assertArrayEquals(result,Problem2.productArrayWithoutDivision(input));
    }
    @Test
    void isOneElementArrayReturnOneElmentArray(){
        int [] input ={9};
        long [] result ={1};
        assertArrayEquals(result,Problem2.productArrayWithoutDivision(input));
        assertArrayEquals(result,Problem2.productArrayWithDivision(input));

    }
    @Test
    void isEachElementInTheNewArrayIsTheProductOfAllTheNumbersInTheOriginalArrayExceptSelf(){
        int [] input ={1, 2, 3, 4, 5};
        long [] result ={120, 60, 40, 30, 24};
        assertArrayEquals(result,Problem2.productArrayWithoutDivision(input));
        assertArrayEquals(result,Problem2.productArrayWithDivision(input));

    }


}