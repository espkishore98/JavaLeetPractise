package org.example;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i <= nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                int value = nums[i] + nums[j];
                if (target == value) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] input = {2, 5, 5, 11};
        int[] result = twoSum(input, 10);
        System.out.println(result.toString());
    }
}
