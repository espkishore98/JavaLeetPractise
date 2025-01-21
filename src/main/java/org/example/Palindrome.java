package org.example;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));

    }
    public static boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
        int temp =0;
        int target=x;
        while(x>0){
            int r = x % 10;
            x= x/10;
            temp = 10 * temp + r;
        }
        return target == temp;
    }
}
