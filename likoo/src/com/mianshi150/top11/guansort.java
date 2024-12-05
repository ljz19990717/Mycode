package com.mianshi150.top11;

import java.util.Arrays;

public class guansort {

    /*
        排序后,从大到小若存在>h;则h++   输出h
        时间复杂度：O(nlogn)，其中 n 为数组 citations 的长度。即为排序的时间复杂度。
        空间复杂度：O(logn)，其中 n 为数组 citations 的长度。即为排序的空间复杂度。

    */
    public int hIndex(int[] citations) {
        Arrays.sort(citations);  //相比较自写这里 耗性能
        int h = 0;
        int i = citations.length - 1;
        while (i >= 0 && citations[i] > h) {
            h++;
            i--;
        }
        return h;
    }



}
