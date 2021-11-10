import array.MyArray;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        RemoveDuplicates();
        MaxProfit();
        RotateArray();
        ContainsOneDuplicate();
        SingleNumber();

    }
    public static void RemoveDuplicates(){
        System.out.println("Remove duplicates");
        System.out.println();
        MyArray array = new MyArray();
        int[] nums = {1,2,3,3,3,4,4,5,6,6,7};
        System.out.println(Arrays.toString(nums));
        System.out.println(array.RemoveDuplicates(nums));
        System.out.println();
    }

    public static void MaxProfit(){
        System.out.println("Max profit");
        System.out.println();
        MyArray array = new MyArray();
        int[] prices = {1,2,3,4,5};
        System.out.println(Arrays.toString(prices));
        System.out.println(array.MaxProfit(prices));
        System.out.println();
    }

    public static void RotateArray(){
        System.out.println("Rotate Array");
        System.out.println();
        MyArray array = new MyArray();
        int[] nums2 = {1,2,3,4,5};
        System.out.println(Arrays.toString(nums2));
        array.RotateArray(nums2, 3);
        System.out.println(Arrays.toString(nums2));
        System.out.println();
    }

    public static void ContainsOneDuplicate(){
        System.out.println("Contains One Duplicate");
        System.out.println();
        MyArray array = new MyArray();
        int[] nums3 = {1,2,3,4,5};
        System.out.println(Arrays.toString(nums3));
        System.out.println(array.ContainsDuplicate(nums3));
        int[] nums4 = {1,2,4,4,5};
        System.out.println(Arrays.toString(nums4));
        System.out.println(array.ContainsDuplicate(nums4));
        System.out.println();
    }

    public static void SingleNumber(){
        System.out.println("Single Number");
        System.out.println();
        MyArray array = new MyArray();
        int[] nums5 = {1,1,2,4,4,5,5};
        System.out.println(Arrays.toString(nums5));
        System.out.println(array.singleNumber(nums5));
        System.out.println();
    }



}
