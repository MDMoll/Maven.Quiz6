package rocks.zipcode.io.fundamentals;


import java.util.*;

/**
 * @author leon on 10/01/2019.
 */
public class StringUtils {
    /**
     * @param string - string to be evaluated
     * @return collection containing all permutations of casing of this string
     */
    public static Collection<String> getAllCasings(String string) {
        // get length of string
        // get range of length
        // get power-set of range
        // for every set in power-set
        // uppercase indices of string using set
        ArrayList<String> arrList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        String word = string.toLowerCase();
        int combinations = 1 << word.length();
        for (int i = 0; i < combinations; i++) {
            char[] result = word.toCharArray();
            for (int j = 0; j < word.length(); j++) {
                if (((i >> j) & 1) == 1) {
                    result[j] = Character.toUpperCase(word.charAt(j));
                }
            }
                arrList.add(String.valueOf(result));
            }
        return arrList;
    }

//    public static Collection<String> recurse(String pref, String suff) {
//        ArrayList<String> arrString = new ArrayList<>();
//        if (suff.length() == 0) {
//            arrString.add(pref);
//        }
//
//        String first = suff.substring(0, 1);
//        String rest = suff.substring(1);
//
//        if (first.toLowerCase().equals(first.toUpperCase())) {
//            recurse(pref + first, rest);
//        } else {
//            recurse(pref + first.toLowerCase(), rest);
//            recurse(pref + first.toUpperCase(), rest);
//        }
//        return arrString;
//    }
    
    /**
     * @param string  - string to be evaluated
     * @param indices - indices to be evaluated
     * @return near-identical string whose characters at specified indices are capitalized
     */
    public static String upperCaseIndices(String string, Integer... indices) {
        StringBuilder sb = new StringBuilder(string);
        for (int i : indices) {
            sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
        }
        return sb.toString();
    }
    
    /**
     * @param stringToBeManipulated - string to be evaluated
     * @param valueToBeInserted     - value to insert into string
     * @param index                 - string-index at which to insert value into string
     * @return near-identical string with `valueToBeInserted` inserted at `index`
     */
    public static String insertAtIndex(String stringToBeManipulated, String
            valueToBeInserted, Integer index) {
        StringBuilder sb = new StringBuilder(stringToBeManipulated);
        return sb.insert(index, valueToBeInserted).toString();
    }
    
    /**
     * @param stringToBeManipulated - string to be evaluated
     * @param replacementValue      - value to insert at `index`
     * @param index                 - position of string to be manipulated
     * @return near-identical string with character at `index` replaced with `replacementValue`
     */
    public static String replaceAtIndex(String stringToBeManipulated, Character replacementValue, Integer index) {
        StringBuilder sb = new StringBuilder(stringToBeManipulated);
        String s = String.valueOf(replacementValue);
        return sb.replace(index, index + 1, s).toString();
    }
}
