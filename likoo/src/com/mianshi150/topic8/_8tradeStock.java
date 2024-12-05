package com.mianshi150.topic8;

public class _8tradeStock{
    /*
        给你一个整数数组 prices ，其中 prices[i] 表示某支股票第 i 天的价格。

在每一天，你可以决定是否购买和/或出售股票。你在任何时候 最多 只能持有 一股 股票。
你也可以先购买，然后在 同一天 出售。

返回 你能获得的 最大 利润 。

    */

      public int maxProfit(int[] prices) {
        int value=0;
        for (int i =1;i<prices.length;i++){
//            if (prices[i]>prices[i-1]){
//                value+=prices[i]-prices[i-1];
//            }

//            value+=(prices[i]-prices[i-1]>0)?prices[i]-prices[i-1]:0;
            value+= Math.max(prices[i] - prices[i - 1], 0);
        }
        return value;
    }



//        public int maxProfit(int[] prices) {
//            int max=prices[0];
//            int min=max;
//            int value=0;
//            boolean b=false;
//            for (int i=1;i<prices.length;i++){
//                if (min==prices[prices.length-1]){
//                    break;
//                }
//                if (i==prices.length-1&&!b){
//                    if (prices[i]>=max){
//                        value+=prices[i]-min;
//                    }else {
//                        value+=max-min;
//                    }
//                }
//
//                if (prices[i]>=max){
//                    max=prices[i];
//                    if (prices[i+1]<max&&max!=min){
//                        value+=max-min;
//                        min=prices[i+1];
//                        max=prices[i+1];
//                    }
//                } else if (prices[i]<min) {
//                    min=prices[i];
//                    max=min;
//                }
//            }
//            return value;
//    }
//    public int maxProfitone(int[] prices) {
//        int ans = 0;
//        int minPrice = prices[0];
//        for (int p : prices) {
//            ans = Math.max(ans, p - minPrice);
//            minPrice = Math.min(minPrice, p);
//        }
//        return ans;
////            void max(int[] prices,int i){}
//    }






}
