package com.sioo.discover.api.test;


/**
 * 数组 两数之和 == 目标数
 *
 * @author : xywei
 * @date : 2020-08-12
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;

        System.out.println(TwoSum.twoSum(nums, target));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            int first = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int second = nums[j];
                if (target == (first + second)) {
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }
}
