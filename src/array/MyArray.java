package array;

import java.util.HashMap;
import java.util.HashSet;

public class MyArray {
    public int RemoveDuplicates(int[] nums) {
        int arrayLength = nums.length;
        int freePosition = 1;
        for (int i = 1; i < arrayLength; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;
            }
            nums[freePosition++] = nums[i];
        }

        return freePosition;
    }

    public int MaxProfit(int prices[]) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }

    public int[] RotateArray(int[] nums, int k) {
        int[] rotatedArray = new int[nums.length];
        for (int i = 0; i <= k; i++) {
            rotatedArray[i] = nums[nums.length - i - 1];
            System.out.println(nums[nums.length - k]);
        }
        for (int i = 0; i < nums.length - k; i++) {
            rotatedArray[i + k] = nums[i];
        }
        return rotatedArray;
    }

    public boolean ContainsDuplicate(int[] nums) {
        HashSet<Integer> integers = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (integers.contains(nums[i])) {
                return true;
            } else {
                integers.add(nums[i]);
            }

        }
        return false;
    }

    public int singleNumber(int[] nums) {
        HashSet<Integer> integers = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (integers.contains(nums[i])){
                integers.remove(nums[i]);
            }else{
                integers.add(nums[i]);
            }
        }
        return integers.iterator().next();
    }
}
