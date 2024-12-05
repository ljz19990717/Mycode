package com.mianshi150.top14;

public class time {


    public int canCompleteCircuit(int[] gas, int[] cost) {
        // 最低可能的油量，可能为负，表示出发前借的油
        int minBalance = 0;
        // 达到最低油量的加油站索引，在此加油站出发
        // 油量不会低于最低值，所以此加油站即为题目所求
        int minIndex = 0;
        int balance = 0;
        for(int i = 0; i < gas.length; i++) {
            // 计算后的balance为到达下一加油站 i + 1的油量，如果创了新低则记录之(创新低值说明此节点油不能到下一个节点
            // 不能作为起始点)
            balance = balance + gas[i] - cost[i];
            if(balance < minBalance) {
                minBalance = balance;
                minIndex = i + 1;
            }

        }
        // 从第一个加油站出发，如果油量恢复到出发前以上，代表可能跑完一圈
        // 在中间出现负值也没有关系，可以想象出发前向别人借了一些油，最后
        // 能还上就可以了
        return balance >= 0 ? minIndex: -1;
    }
}
