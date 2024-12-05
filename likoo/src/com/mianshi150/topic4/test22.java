package com.mianshi150.topic4;

import java.util.HashMap;
import java.util.stream.IntStream;

public class test22 {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap();
        int x =0;
        for (int i = 0; i < nums.length; i++) {

            if (map.get(nums[i]) == null) {
                nums[x++]=nums[i];
                map.put(nums[i], 1);
            }
            else if (map.get(nums[i])==1){
                map.put(nums[i], 2);
                 nums[x++]=nums[i];
            }
            else if (i==nums.length-1&&map.get(nums[i])<=1){
                nums[x]=nums[i];
            }
        }
        return x;
    }
}
