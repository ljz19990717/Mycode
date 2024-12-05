package com.mianshi150.topic9;

public class _92 {

      /*
        给你一个非负整数数组 nums ，你最初位于数组的 第一个下标 。
        数组中的每个元素代表你在该位置可以跳跃的最大长度。
        判断你是否能够到达最后一个下标，如果可以，返回 true ；否则，返回 false 。
    */

    //自写第二种方法
    public boolean canJump1(int[] nums) {
        if (nums.length==1){
            return true;
        }
        int value=nums[0];
        int i=0;
        while(value>=0){
            if (i== nums.length-1){
                return true;
            }
            if (value<nums[i]){
                value=nums[i];
            }
            i++;
            value--;
        }
        return false;
    }



    //其他人 末尾可达性判断
        public boolean canJump(int[] nums) {
        int step=1;//最后一步开始只需要一步就能到终点
       for (int i= nums.length-2;i>=0;i--){
           if (nums[i]>=step){
               step=0;
           }
           step++;
       }
       return step==1;
    }

}
