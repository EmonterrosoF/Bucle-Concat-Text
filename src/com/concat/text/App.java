package com.concat.text;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> words = new ArrayList<>();
        words.add("first");
        words.add("second");
        words.add("third");
        words.add("for");

        concatText(words);
    }

    /**
     * concat text
     * @param worlds List of worlds
     */
    static void concatText(List<String> worlds) {
        String result = "";
        for (String word : worlds) {
            result += word + " ";
        }

        System.out.println(result);
    }
}
