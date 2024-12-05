package com.mianshi150.topic5;

import java.util.Arrays;
import java.util.HashMap;

public class _5majorityelement {
    /*
        给定一个大小为 n 的数组 nums ，返回其中的多数元素。
        多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
        你可以假设数组是非空的，并且给定的数组总是存在多数元素。
        给定一个大小为 n 的数组 nums ，返回其中的多数元素。
        多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
        你可以假设数组是非空的，并且给定的数组总是存在多数元素。
    */
    public static void main(String[] args) {


    }
    public int majorityElement(int[] nums) {
        int i=0;
        int value=0;
        int x = 0;
        while(i<nums.length){
           if (value==0){
               x=nums[i];
           }
           else if (x==nums[i]){
               value++;
           }else {
               value--;
           }
           i++;
        }
//        i=(int)hashMap.get(nums[0]);
        return x;
    }

    public int majorityElement2(int[] nums) {
        int len= nums.length/2;
        int i=0;
        int count=0;
        Arrays.sort(nums);
        int x=nums[0];
        while(i<nums.length){
           if (x!=nums[i]){
               x=nums[i];
               count=1;
           }else {
               count++;
           }
           if (count>len){
               return nums[i];
           }
           i++;
        }
//        i=(int)hashMap.get(nums[0]);
        return 0;
    }


    public int majorityElement3(int[] nums) {
        HashMap hashMap = new HashMap<>();
        int len= nums.length/2;
        int i=0;
        while(i<nums.length){
            if (hashMap.get(nums[i])==null){
                hashMap.put(nums[i],1);
            }else {
                hashMap.put(nums[i],(int)hashMap.get(nums[i])+1);
            }
            if ((int)hashMap.get(nums[i])>len){
                return nums[i];
            }
            i++;
        }
//        i=(int)hashMap.get(nums[0]);
        return 0;
    }
}
