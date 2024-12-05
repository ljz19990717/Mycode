package com.mianshi150.top13;

import java.util.HashMap;
import java.util.Map;

public class shuzuchengji {
    /*
        给你一个整数数组 nums，返回 数组 answer ，其中 answer[i] 等于
        nums 中除 nums[i] 之外其余各元素的乘积 。
        题目数据保证数组 nums之中任意元素的全部前缀元素和后缀的乘积都在32位整数范围内。
        请 不要使用除法，且在 O(n) 时间复杂度内完成此题。


        //思路 一遍 遍历只能从前往后算或者从后往前算  所以分成i左边和i右边两个数组
        再结合
    */


        public int[] productExceptSelf(int[] nums) {
            int[] answer=new int[nums.length];
            int[] left=new int[nums.length];
            int[] right=new int[nums.length];
            int left0=1;
            int right0=1;
            for (int i=0;i< left.length;i++){

                    left[i]=left0;
                    left0=left0*nums[i];
                    answer[i]=left[i];
            }
            for (int i=right.length-1;i>=0;i--){
                    right[i]=right0;
                    right0=nums[i]*right0;
                    answer[i]*=right[i];
            }
            return answer;
        }

/*
    改进一个数组
*/
    public int[] productExceptSelf1(int[] nums) {
        int[] answer=new int[nums.length];
        int right0=1;
        answer[0]=1;
        for (int i=1;i< nums.length;i++){
            answer[i]=answer[i-1]*nums[i-1];
        }
        for (int i=nums.length-1;i>=0;i--){
            answer[i]=answer[i]*right0;
            right0=nums[i]*right0;
        }
        return answer;
    }

}
