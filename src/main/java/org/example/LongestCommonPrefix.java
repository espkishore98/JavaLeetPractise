package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LongestCommonPrefix {
    public static void main(String[] args) {
     String[] input = {"flower","flow","flight"};
    longestCommonPrefix(input);
    }

    public static String longestCommonPrefix(String[] strs) {
        char[] initialString = strs[0].toCharArray();
        String temp = "";
        List<String> strings = Arrays.stream(strs).collect(Collectors.toList());
        for (int i=0; i<= initialString.length-1; i++) {
            int finalI = i;

            List<String> values=  strings.stream().filter(s-> s.startsWith(String.valueOf(initialString[finalI]))).collect(Collectors.toList());

            strings= strings.stream().filter(v -> v.length() > 0).map(v -> v.length() > 1 ? v.substring(1) : "").collect(Collectors.toList());
            if(values.size() == strs.length){
               temp = temp + (""+ initialString[i]);
           } else {
                break;
            }
        }
        return (temp);
    }
}
