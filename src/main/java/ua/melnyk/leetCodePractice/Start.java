package ua.melnyk.leetCodePractice;

import java.io.IOException;

public class Start {

    public static void main(String[] args) throws IOException {
        String test = "abaaasassss";
        System.out.println(compressedString(test));
    }

    public static String compressedString(String message) {
        String result = "";
        int count = 1;
        char[] arr = message.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (i != 0 && arr[i] == arr[i - 1]) {
                char c = arr[i];
                ++count;
            } else {
                if (count != 1) {
                    result = result + count;
                }
                count = 1;
                result = result + arr[i];
            }
        }
        if (count != 1) {
            result = result + count;
        }
        return result;
    }


}
