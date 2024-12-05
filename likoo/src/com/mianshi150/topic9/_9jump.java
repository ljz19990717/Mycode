package com.mianshi150.topic9;

public class _9jump {
    /*
        给你一个非负整数数组 nums ，你最初位于数组的 第一个下标 。
        数组中的每个元素代表你在该位置可以跳跃的最大长度。
        判断你是否能够到达最后一个下标，如果可以，返回 true ；否则，返回 false 。
    */




    //后跳,正跳  时间超时
    public boolean canJump(int[] nums) {
        if(nums[0]==0&&nums.length!=1) {
            return false;
        }
        if (jump(nums, nums.length-1)){
            return true;
        }
        return  false;
    }
    //j代表nums.length
        Boolean jump(int[] nums,int j){
        if (j==0){
            return true;
        }
        for (int i= j-1;i>=0;i--){
            if (nums[i]+i>=j){
                if (jump(nums,i)){
                    return true;
                };
            }
        }
        return false;
        }





}
