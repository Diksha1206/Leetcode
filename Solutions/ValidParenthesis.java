package Solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {

    static Map<Character, Character> validParenthses = new HashMap<>();

    public static void fillStack() {
        validParenthses.put(')', '(');
        validParenthses.put('}', '{');
        validParenthses.put(']', '[');
    }

    public static boolean isValid(String s) {
        Stack<Character> parenthesisStack = new Stack<Character>();

        char poppedCharacter;
        for (int i = 0; i < s.length(); i++) {

            if (validParenthses.containsKey(s.charAt(i))) {
                System.out.println(parenthesisStack);
                poppedCharacter = !parenthesisStack.isEmpty() ? (char) parenthesisStack.pop() : '#';
                if (poppedCharacter != validParenthses.get(s.charAt(i))) {
                    return false;
                }
            } else {
                parenthesisStack.push(s.charAt(i));
            }
        }
        return parenthesisStack.isEmpty();
    }

    public static void main(String[] args) {
        fillStack();
        String parentheses = "()";
        boolean result = isValid(parentheses);
        System.out.println(result);
    }
}
