package com.mianshi150.top12;

import java.util.*;

public class bestMapList {

/*
    Map完成了add和remove,但没法在o1情况下随机取一个值..因为需要遍历
    全部键值对,o(n)
*/
    public Map<Integer, Integer> map;
    public List<Integer> array;
    public Random random = new Random();

    public bestMapList() {
        map = new HashMap<>();
        array = new ArrayList<>();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
       if (!map.containsKey(val)){
           array.add(val);
           map.put(val,array.size()-1);
           return true;
       }
       return false;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if (map.containsKey(val)){
            int x=map.get(val);
            map.remove(val);
            if (x!=array.size()-1){
                map.put(array.get(array.size()-1),x);
                array.set(x,array.get(array.size()-1));
            }
            array.remove(array.size()-1);

            return true;
        }
        return false;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        return array.get(random.nextInt(array.size()));
    }

}
