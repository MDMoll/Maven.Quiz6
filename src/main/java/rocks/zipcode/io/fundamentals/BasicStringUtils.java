package rocks.zipcode.io.fundamentals;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BasicStringUtils {
    /**
     * @param chars - characters used to instantiate a new string object
     * @return new String which wraps the arguments passed in
     */
    public static String getString(char[] chars) {
        return new String(chars);
    }
    
    /**
     * @param chars - characters used to instantiate a new string object
     * @return new String which wraps the arguments passed in
     */
    public static String getString(Character[] chars) {
        String str = "";
        for (Character c : chars)
            str += c.toString();
        return str;
    }
    
    /**
     * @param string - string to be manipulated
     * @return identical string with lowercase and uppercase vowels removed
     */
    public static String removeAllVowels(String string) {
        return string.replaceAll("[AEIOUaeiou]+", "");
    }
    
    /**
     * @param string             - string to be manipulated
     * @param charactersToRemove - characters to be removed from string
     * @return
     */
    public static String removeSpecifiedCharacters(String string, String charactersToRemove) {
        StringBuilder result = new StringBuilder();
        for (char c : string.toCharArray()) {
            if (charactersToRemove.indexOf(c) == -1) {
                result.append(c);
            }
        }
        return result.toString();
    }
}
