package com.mianshi150.top15;

public class _15cadi {


    public int candy(int[] ratings) {
        int left=1;
        int right=0;
        int n=1;
        int m=1;
        if (ratings.length==1){
            return 1;
        }
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i]>ratings[i-1]){
                m=1;
                left+=++n;
            }else if (ratings[i]<ratings[i-1]){
                n=1;
                right+=++m;
            }else {
                n=m=1;
                left++;
            }
        }
        return left+right;
    }


}
