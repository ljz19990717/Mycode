package com.mianshi150.topic4;

import java.util.Arrays;

public class _4shanchuyouxuchonfu {
    //给你一个有序数组 nums ，请你 原地 删除重复出现的元素，
    // 使得出现次数超过两次的元素只出现两次 ，
    // 返回删除后数组的新长度。
    //不要使用额外的数组空间，
    // 你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。


    public static void main(String[] args) {
        int[] nums={0,0,1,1,1,1,2,3,3};//[0,0,1,1,1,1,2,3,3]
        int len=removeDuplicates(nums);
        System.out.println(len);
        System.out.println(Arrays.toString(nums));
    }

    private static int removeDuplicates(int[] nums) {
//        int k=0,i=0;
//        while(i<nums.length-1){
//            if (nums[i]==nums[i+1]){
//                int x=0;
//                for (int j=i+1;j< nums.length-1;j++){
//                if (nums[j]==nums[j+1]){
//                    x++;
//                }else {
//                    break;
//                }
//                }
//                if (i==nums.length-2){
//                    nums[k++]=nums[i];
//                    nums[k++]=nums[i];
//                }else {
//                nums[k++]=nums[i];
//                nums[k++]=nums[i++];
//                i+=x;
//                continue;}
//                }else if (i!=nums.length-2){
//                nums[k++]=nums[i++];
//            }
//            if (i==nums.length-2){
//                nums[k]=nums[i+1];
//            }
//            }
//            return k;

            int i = 0;
            for (int num : nums) {
                if (i < 2 || num > nums[i - 2]) {
                    nums[i++] = num;
                }
            }
            return i;
        }

}
