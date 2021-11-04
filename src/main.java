import array.MyArray;

public class main {
    public static void main(String[] args) {
        MyArray array = new MyArray();
        int[] nums = {1,2,3,3,3,4,4,5,6,6,7};
        System.out.println(array.RemoveDuplicates(nums));

        int[] prices = {1,2,3,4,5};
        System.out.println(array.MaxProfit(prices));

        int[] nums2 = {1,2,3,4,5};
        nums2 = array.RotateArray(nums2, 3);
        for (int i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();
        int[] nums3 = {1,2,3,4,5};
        System.out.println(array.ContainsDuplicate(nums3));

        int[] nums4 = {1,2,4,4,5};
        System.out.println(array.ContainsDuplicate(nums4));

        int[] nums5 = {1,1,2,4,4,5,5};
        System.out.println(array.singleNumber(nums5));

    }
}
