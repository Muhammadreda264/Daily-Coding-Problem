import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem7Test {
    @Test
    void emptyStringShouldReturnOne(){
        String message="";
        assertEquals(1,Problem7.numOfWays(message,message.length()));

    }
    @Test
    void oneLetterMessageShouldReturnOne(){
        String message ="1";
        assertEquals(1,Problem7.numOfWays(message,message.length()));
    }
    @Test
    void twoNumbersMessageExceptZeroInSecendLetterShouldReturnTwo(){
        String message ="11";
        assertEquals(2,Problem7.numOfWays(message,message.length()));
    }
    @Test
    void twoNumbersMessageWithtZeroInSecendLetterShouldReturnOne(){
        String message ="10";
        assertEquals(1,Problem7.numOfWays(message,message.length()));
    }
    @Test
    void threeNumbersMessageWitoutZeroShouldReturnThree(){
        String message ="111";
        assertEquals(3,Problem7.numOfWays(message,message.length()));
    }


}