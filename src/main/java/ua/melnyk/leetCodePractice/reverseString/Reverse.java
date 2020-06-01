package ua.melnyk.leetCodePractice.reverseString;

import java.util.Stack;

/** Reverse input string
 * regular expression, stack structure, char array, StringBuilder
 */
public class Reverse {

    public static void main(String[] args) {
        String input = "hello";
        Stack<String> stringStack = new Stack<>();
        stringStack.push("input");
        //System.out.println(stringStack.pop().toString());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(input);
        char[] chars = input.toCharArray();
        for (char aChar : chars) {
           // System.out.println(aChar);
        }
        System.out.println(reverse(input));
        //System.out.println(stringBuilder.reverse());
    }

    /**
     *
     * @param input
     * @return
     */
    private static String reverse(String input) {

        if (input == null) {
            return input;
        }

        String output = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            output = output + input.charAt(i);
        }

        return output;
    }

    /**
     *
     * @param sentence
     * @return
     */
    private static String reverseTheOrderOfWords(String sentence) {
        if (sentence == null) {
            return null;
        }

        StringBuilder output = new StringBuilder();
        String[] words = sentence.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            output.append(words[i]);
            output.append(" ");
        }

        return output.toString().trim();
    }
}
