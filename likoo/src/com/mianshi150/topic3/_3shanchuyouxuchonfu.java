package com.mianshi150.topic3;

import java.util.HashMap;

public class _3shanchuyouxuchonfu {
    /*
        给你一个 非严格递增排列 的数组 nums ，
        请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，
        返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。
        然后返回 nums 中唯一元素的个数。
        考虑 nums 的唯一元素的数量为 k ，你需要做以下事情确保你的题解可以被通过：
        更改数组 nums ，使 nums 的前 k 个元素包含唯一元素，
        并按照它们最初在 nums 中出现的顺序排列。nums 的其余元素与 nums 的大小不重要。
        返回 k 。
    */
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,2,3,4}; // 输入数组
        int[] expectedNums = {1,2,3,4}; // 长度正确的期望答案

        int k = removeDuplicates(nums); // 调用

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
            System.out.println(nums[i]);
        }

    }


    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int num : nums) {
            if (i<1||num!=nums[i-1]){
                nums[i++]=num;
            }
        }
        return i;
    }
    public int removeDuplicates1(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap();
        int count = 0;
        int x =0;
        for (int i = 0; i < nums.length; i ++) {
            if (map.get(nums[i]) == null) {
                count = 0;
                nums[x++]=nums[i];
            }
            map.put(nums[i], count+=1);
            if (map.get(nums[i]) > 2) {
                nums[i] = -1;
            }
        }
        return x;
    }
}
