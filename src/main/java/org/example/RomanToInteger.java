package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        romanToInt("LVIII");
    }
    public static int romanToInt(String s) {
        Map<String, Integer> romanMap = new HashMap<>();
        romanMap.put("I",1);
        romanMap.put("V", 5);
        romanMap.put("X", 10);
        romanMap.put("L", 50);
        romanMap.put("C", 100);
        romanMap.put("D", 500);
        romanMap.put("M", 1000);
        romanMap.put("IV", 4);
        romanMap.put("IX", 9);
        romanMap.put("XL", 40);
        romanMap.put("XC", 90);
        romanMap.put("CD",400);
        romanMap.put("CM", 900);
        char[] values = s.toCharArray();
        int result =0;
        for(int i=0; i < s.length(); i++) {
            Integer current = romanMap.get(String.valueOf(values[i]));
            //checking current is less than the next one
            if (i+1 < s.length() && romanMap.get(String.valueOf(s.charAt(i+1))) > current) {
                String val = ""+s.charAt(i) + s.charAt(i+1);
                result = result + romanMap.get(val);
                i++; //since combine increasing size to check by skipping added value
            } else {
                result = result + romanMap.get(String.valueOf(s.charAt(i)));
            }
        }

        return result;
    }
}
