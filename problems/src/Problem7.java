/**
 * This problem was asked by Facebook.
 * Given the mapping a = 1, b = 2, … z = 26, and an encoded message, count the number of ways it can be decoded.
 *
 * For example, the message ‘111’ would give 3, since it could be decoded as ‘aaa’, ‘ka’, and ‘ak’.
 *
 * You can assume that the messages are decodable. For example, ‘001’ is not allowed.
 */
public class Problem7 {

    public static int numOfWays(String message,int currentMessageLength){
        int result;
        if (currentMessageLength==0){
            return 1;
        }
        int firstChar=message.length()-currentMessageLength;
        if(message.charAt(firstChar)==48){
            return 0;
        }
        result=numOfWays(message,currentMessageLength-1);
        result+=isVaildTwoDigitLetter(message,firstChar) ? numOfWays(message,currentMessageLength-2):0;

        return result;
    }

    private static boolean isVaildTwoDigitLetter(String message,int firstChar){
        return (firstChar+2<=message.length()&& Integer.valueOf(message.substring(firstChar,firstChar+1))<=26)?
                true:false;
    }


}
