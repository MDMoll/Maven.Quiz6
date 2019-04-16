package rocks.zipcode.io.arrays;

import java.util.stream.IntStream;

/**
 * @author leon on 24/01/2019.
 */
public class ArrayUtils {
    /**
     * @param start - value to begin counting
     * @param end   - value to stop counting
     * @return array of all integers between `start` and `stop`
     */
    public static Integer[] getRange(Integer start, Integer end) {
        return IntStream.range(start, end + 1)
                .boxed()
                .toArray(Integer[]::new);
    }
    
    /**
     * @param array - array to be unboxed
     * @return array with identical contents in primitive-array form
     */
    public static char[] unbox(Character[] array) {
        char[] charArray = new char[array.length];
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = array[i];
        }
        return charArray;
    }
    
    /**
     * @param array - array to be boxed
     * @return array with identical contents in nonprimitive-array form
     */
    public static Character[] box(char[] array) {
        Character[] charArray = new Character[array.length];
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = array[i];
        }
        return charArray;
    }
}
