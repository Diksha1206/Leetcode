

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    private static Map<Character, Integer> romanLetterMapping = new HashMap<>();
    static {
        romanLetterMapping.put('I', 1);
        romanLetterMapping.put('V', 5);
        romanLetterMapping.put('X', 10);
        romanLetterMapping.put('L', 50);
        romanLetterMapping.put('C', 100);
        romanLetterMapping.put('D', 500);
        romanLetterMapping.put('M', 1000);
    }

    public static int convertToInteger(ArrayList<Integer> integerList) {
        int result = 0;
        System.out.println("The integer list is: " + integerList);
        int size = integerList.size();
        System.out.println(size);
        for (int integerNumber = 0; integerNumber < integerList.size(); integerNumber++) {
            if (integerNumber == integerList.size() - 1) {
                result += integerList.get(integerNumber);
                return result;
            }
            if (integerList.get(integerNumber) >= integerList.get(integerNumber + 1)) {
                result += integerList.get(integerNumber);
            } else {
                result += integerList.get(integerNumber + 1) - integerList.get(integerNumber);
                integerNumber++;
            }
        }
        return result;
    }

    public static ArrayList<Integer> convertRomanToIntegerList(String romanLetters) {
        ArrayList<Integer> romanToInteger = new ArrayList<>();
        for (int romanChar = 0; romanChar < romanLetters.length(); romanChar++) {
            char character = romanLetters.charAt(romanChar);
            romanToInteger.add(romanLetterMapping.get(character));
        }
        System.out.println(romanToInteger.toString());
        return romanToInteger;
    }

    public static void main(String[] args) {
        // String romanLetters = "MCMXCIV";
        // String romanLetters = "MM";
        String romanLetters = "CMXCIX";
        ArrayList<Integer> romanToIntegerList = convertRomanToIntegerList(romanLetters);
        int integerNumber = convertToInteger(romanToIntegerList);
        System.out.println(integerNumber);
    }
}
