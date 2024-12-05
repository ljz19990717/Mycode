package com.mianshi150.top12;

import java.util.*;

public class _12new2 {

    int[] s;
    public _12new2() {
        s = new int[]{};
    }

    public boolean insert(int val) {
        if (s.length==0) {
            int[] s1 = new int[s.length+1];
            s1[s1.length-1]=val;
            s=s1;
            return true;
        }else if (jianyan(val,s)){
            int[] s1 = new int[s.length+1];
            System.arraycopy(s, 0, s1, 0, s.length);
            s1[s1.length-1]=val;
            s=s1;
            return true;
        }
        return false;
    }
    public boolean remove(int val) {
        if (s.length==0){
            return false;
        }
        for (int i=0 ;i<s.length;i++) {
            if (s[i]==val){
                s[i]=s[s.length-1];
                int[] s1 = new int[s.length-1];
                if (s1.length==0){
                    s=new int[]{};
                    return true;
                }
                System.arraycopy(s, 0, s1, 0, s.length-1);
                s=s1;
                return true;
            }
        }
        return false;
    }

    public int getRandom() {

        Random random=new Random();
        return  s[random.nextInt(s.length)];

    }
    public boolean jianyan(int val,int[] s){
        for (int i : s) {
            if (i==val){
                return false;
            }
        }
        return true;
    }


}
