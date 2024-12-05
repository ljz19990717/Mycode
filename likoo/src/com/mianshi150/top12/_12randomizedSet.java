package com.mianshi150.top12;

import org.junit.Test;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class _12randomizedSet {
    /*
        实现_12randomizedSet 类：
    _12randomizedSet() 初始化 _12randomizedSet 对象
    bool insert(int val) 当元素 val 不存在时，向集合中插入该项，并返回 true ；否则，返回 false 。
    bool remove(int val) 当元素 val 存在时，从集合中移除该项，并返回 true ；否则，返回 false 。
    int getRandom() 随机返回现有集合中的一项（测试用例保证调用此方法时集合中至少存在一个元素）。
    每个元素应该有 相同的概率 被返回。
    你必须实现类的所有函数，并满足每个函数的 平均 时间复杂度为 O(1) 。
    */

    // 时间空间复杂度太高
    HashSet<Integer> s = new HashSet<>();
    public _12randomizedSet() {

    }

    public boolean insert(int val) {
        if (!s.contains(val)) {
            s.add(val);
            return true;
        }
        return false;
    }
    public boolean remove(int val) {
        if (s.remove(val)) {
            return true;
        }
        return false;
    }

    public int getRandom() {

        Random random=new Random();
        List<Integer> slist=new ArrayList<>(s);
        return  slist.get(random.nextInt(s.size()));

    }

@Test
public void test1(){
    insert(1);
    insert(2);
    insert(3);
    remove(3);
    System.out.println("s.size() = " + s.size());
    System.out.println(getRandom());
}

}
