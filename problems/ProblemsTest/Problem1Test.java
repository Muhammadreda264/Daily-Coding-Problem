import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Problem1Test {

    @Test
    void isTwoNumbersAddUpToJK() {
        Long[] array={1L,2L,3L,4L};
        List<Long> numbers=new ArrayList<>();
        assertEquals(false,Problem1.isTwoNumbersAddUpToK(numbers,0));
        numbers= Arrays.asList(array);
        assertEquals(true,Problem1.isTwoNumbersAddUpToK(numbers,5));
        assertEquals(false,Problem1.isTwoNumbersAddUpToK(numbers,8));


    }
}