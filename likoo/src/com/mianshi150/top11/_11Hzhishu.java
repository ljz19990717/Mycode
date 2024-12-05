package com.mianshi150.top11;

import org.junit.Test;

import java.util.Arrays;

public class _11Hzhishu {
    /*
        给你一个整数数组 citations ，
        其中 citations[i] 表示研究者的第 i 篇论文被引用的次数。
        计算并返回该研究者的 h 指数。
        根据维基百科上 h 指数的定义：h 代表“高引用次数” ，
        一名科研人员的 h 指数 是指他（她）至少发表了 h 篇论文，
        并且 至少 有 h 篇论文被引用次数大于等于 h 。如果 h 有多种可能的值，h 指数 是其中最大的那个。
    {100}  h为1
    */


    /*
        解析
        h<=nums.length   存在h个数值大于等于h
        length 1   nums[0]>1    1
        length 2   max(0,1)<=2  wei h


        自写
        思路 以数组长度为准.引用次数大于长度的,万能数++;将引用次数在范围内的记录在数组中,
        从大到小遍历数组,每次加万能数
        若大于下标则为h.
        若不大于下标,因为是从大到小,所以此时大的引用次数也相当于小的万能数
        f(2n)
        时间复杂度：O(n)，其中 n 为数组 citations 的长度。需要遍历数组 citations 一次，以及遍历长度为 n+1 的数组 counter 一次。
        空间复杂度：O(n)，其中 n 为数组 citations 的长度。需要创建长度为 n+1 的数组 counter。

    */

    public int hIndex(int[] citations) {
        int value=citations.length;
        int[] a=new int[value+1];
        int x=0;
        for (int i=0;i<=value-1;i++){
            if (citations[i]<=value){
                a[citations[i]]++;
            }else {
                x++;
            }
        }

        for (int i = value; i >=0; i--) {
            if (a[i]+x>=i){
                return i;
            }
            x+=a[i];
        }
        return 0;
    }

}
