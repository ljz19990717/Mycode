package com.mianshi150.topic2;

import java.util.Arrays;

public class _2yichuyuansu {
    //给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素。
    // 元素的顺序可能发生改变。然后返回 nums 中与 val 不同的元素的数量。
    //假设 nums 中不等于 val 的元素数量为 k，要通过此题，您需要执行以下操作：
    //更改 nums 数组，使 nums 的前 k 个元素包含不等于 val 的元素。nums 的其余元素和 nums 的大小并不重要。
    //返回 k。
    //
    //双指针一块推进,当找到相同值时,数组置零,k还是指向之前找到的该清空的数值,
    // 直到找到不删除的数值,取得该值,然后加一
    public static void main(String[] args) {
        int[] nums = {3,3}; // 输入数组
        int val =3; // 要移除的值


        int k = removeElement(nums, val); // 调用你的实现
        int[] expectedNums = {};// 长度正确的预期答案。
        // 它以不等于 val 的值排序。
        assert k == expectedNums.length;
        Arrays.sort(nums, 0, k); // 排序 nums 的前 k 个元素
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
        System.out.println(Arrays.toString(expectedNums));
    }
    public static int removeElement(int[] nums, int val) {
        int k =0;
        for (int i=0;i<=nums.length-1;i++){
            if (nums[i]==val){
                    nums[i]= 0;
                    continue;
            }
            nums[k++]=nums[i];
        }
        return nums.length-k;
    }
}
