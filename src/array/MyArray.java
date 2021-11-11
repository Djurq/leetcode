package array;

import java.util.*;

public class MyArray {

    /**
     * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique
     * element appears only once. The relative order of the elements should be kept the same.
     * Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
     */
    public int RemoveDuplicates(int[] nums) {
        int freePosition = 1;
        for (int i = 1; i < nums.length; i++) {
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

    public void RotateArray(int[] nums, int k) {
        int[] rotatedArray = Arrays.copyOf(nums, nums.length);
        k = k % nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (i + k - 1 >= nums.length - 1) {
                nums[(i + k) - nums.length] = rotatedArray[i];
            } else {
                nums[i + k] = rotatedArray[i];
            }
        }
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
            if (integers.contains(nums[i])) {
                integers.remove(nums[i]);
            } else {
                integers.add(nums[i]);
            }
        }
        return integers.iterator().next();
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> intersects = new ArrayList<>();
        int i = 0;
        int j = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        while (i < nums1.length && j < nums2.length) {
                if (nums1[i] == nums2[j]){
                    intersects.add(nums1[i]);
                    i++;
                    j++;
                }else if(nums1[i] < nums2[j]){
                    i++;
                }else{
                    j++;
                }
        }

        int[] intersect = new int[intersects.size()];
        for (int k = 0; k < intersects.size(); k++) {
            intersect[k] = intersects.get(k);
        }
        return intersect;
    }

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9){
                digits[i] = digits[i] + 1;
                break;
            }else{
                digits[i] = 0;
                if (i == 0){
                    digits[i] = 1;
                    int[] newDigits = new int[digits.length + 1];
                    digits = newDigits;
                    digits[0] = 1;
                    break;
                }else if (digits[i - 1] != 9){
                    digits[i - 1] = digits[i - 1] + 1;
                    break;
                }
            }
        }
        return digits;
    }
}
