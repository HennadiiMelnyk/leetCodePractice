package ua.melnyk.leetCodePractice.twoSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * Example:
 * <p>
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * nums = [3, 2, 3], target = 6,
 * return [ 0, 2].
 */
public class TwoSum {


    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        TwoSum twoSum = new TwoSum();
        System.out.println(Arrays.toString(twoSum.twoSum(arr, target)));
    }

    private int[] twoSum(int[] nums, int target) {
        int[] tmp = new int[nums.length];
        int k = 0;
        int counter = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    tmp[k] = i;
                    tmp[k + 1] = j;
                    counter += 2;
                }
            }
        }

        return Arrays.copyOfRange(tmp, k, counter);
    }
}
