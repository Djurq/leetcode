import array.MyArray;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        MyArray array = new MyArray();
        int[] nums = {1,2,3,3,3,4,4,5,6,6,7};
        System.out.println(array.RemoveDuplicates(nums));

        int[] prices = {1,2,3,4,5};
        System.out.println(array.MaxProfit(prices));


        int[] nums2 = {1,2,3,4,5};
        array.RotateArray(nums2, 3);
        System.out.println(Arrays.toString(nums2));

        System.out.println();
        int[] nums3 = {1,2,3,4,5};
        System.out.println(array.ContainsDuplicate(nums3));

        int[] nums4 = {1,2,4,4,5};
        System.out.println(array.ContainsDuplicate(nums4));

        int[] nums5 = {1,1,2,4,4,5,5};
        System.out.println(array.singleNumber(nums5));

    }
}
