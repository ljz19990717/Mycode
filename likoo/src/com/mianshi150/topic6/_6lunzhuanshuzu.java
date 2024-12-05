package com.mianshi150.topic6;

import java.util.Arrays;

public class _6lunzhuanshuzu {

/*
    给定一个整数数组 nums，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
*/




    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int w=n-k%n;
        System.out.println(w);
        int[] num=new int[w];
        for (int i = 0; i < w; i++) {
            num[i]=nums[i];
        }
        for (int i=0;i<n-w;i++){
            nums[i]=nums[i+w];
        }
        System.arraycopy(num,0,nums,n-w,w);
    }

        public void rotate1(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        reverse(nums, 0, n - 1);
        reverse(nums, k, n - 1);
        reverse(nums, 0, k-1);

    }
    void reverse(int[] nums, int l, int r){
        while(l < r){
            int temp = nums[l]; nums[l] = nums[r]; nums[r] = temp;
            l++; r--;
        }
    }

}
