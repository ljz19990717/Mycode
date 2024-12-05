package com.mianshi150.top14;

public class _14GasStation {

/*
在一条环路上有 n 个加油站，其中第 i 个加油站有汽油 gas[i] 升。
你有一辆油箱容量无限的的汽车，
从第 i 个加油站开往第 i+1 个加油站需要消耗汽油 cost[i] 升。
你从其中的一个加油站出发，开始时油箱为空。
给定两个整数数组 gas 和 cost ，如果你可以按顺序绕环路行驶一周，
则返回出发时加油站的编号，否则返回 -1 。如果存在解，则 保证 它是 唯一 的。
*/
/*
    每个点分前后,记录每个点开始走过程中是否存在走不下去的情况
    内存占用较小,时间较长
*/

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int gocost=0;
        int x=0;
        int[] all=new int[n];
        for (int i=0;i<n;i++){
            if (i==0){
                all[i]=0;
            }else {
                all[i]=all[i-1]+gas[i-1]-cost[i-1];
            }
            if (i==n-1){
                return gas[i]-cost[i]+gocost+all[x]>=0?x:-1;
            }
            if (gas[i]-cost[i]+gocost>=0){
                gocost=gas[i]-cost[i]+gocost;
            }else {
                gocost=0;
                x=i+1;
            }
        }
        return -1;
    }


}
