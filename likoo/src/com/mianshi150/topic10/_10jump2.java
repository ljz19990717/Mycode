package com.mianshi150.topic10;

import org.junit.Test;

public class _10jump2 {

        @Test
        public void test1(){
                System.out.println(jump1(new int[]{1,1,1,1,1}));

        }

    /*
        给定一个长度为 n 的 0 索引整数数组 nums。
        初始位置为 nums[0]。
    每个元素 nums[i] 表示从索引 i 向前跳转的最大长度。
    换句话说，如果你在 nums[i] 处，你可以跳转到任意 nums[i + j] 处:
    0 <= j <= nums[i]
    i + j < n
    返回到达 nums[n - 1] 的最小跳跃次数。
    生成的测试用例可以到达 nums[n - 1]。
    */

        //1 .方法一：反向查找出发位置
        //我们的目标是到达数组的最后一个位置，因此我们可以考虑最后一步跳跃前所在的位置，该位置通过跳跃能够到达最后一个位置。
        //
        //如果有多个位置通过跳跃都能够到达最后一个位置，那么我们应该如何进行选择呢？直观上来看，我们可以「贪心」地选择距离最后一个位置最远的那个位置，也就是对应下标最小的那个位置。因此，我们可以从左到右遍历数组，选择第一个满足要求的位置。
        //
        //找到最后一步跳跃前所在的位置之后，我们继续贪心地寻找倒数第二步跳跃前所在的位置，以此类推，直到找到数组的开始位置
        //时间复杂度：O(n
        //2
        // )，其中 n 是数组长度。有两层嵌套循环，在最坏的情况下，例如数组中的所有元素都是 1，position 需要遍历数组中的每个位置，对于 position 的每个值都有一次循环。
        //
        //空间复杂度：O(1)。
        //





        class Solution {
                public int jump(int[] nums) {
                        int position = nums.length - 1;
                        int steps = 0;
                        while (position > 0) {
                                for (int i = 0; i < position; i++) {
                                        if (i + nums[i] >= position) {
                                                position = i;
                                                steps++;
                                                break;
                                        }
                                }
                        }
                        return steps;
                }
        }


       // 2.最佳   正向查找可到达的最大位置
        //方法一虽然直观，但是时间复杂度比较高，有没有办法降低时间复杂度呢？
        //如果我们「贪心」地进行正向查找，每次找到可到达的最远位置，就可以在线性时间内得到最少的跳跃次数。
        //例如，对于数组 [2,3,1,2,4,2,3]，初始位置是下标 0，从下标 0 出发，最远可到达下标 2。下标 0 可到达的位置中，下标 1 的值是 3，
        // 从下标 1 出发可以达到更远的位置，因此第一步到达下标 1。
        //从下标 1 出发，最远可到达下标 4。下标 1 可到达的位置中，下标 4 的值是 4 ，
        // 从下标 4 出发可以达到更远的位置，因此第二步到达下标 4。
        //时间复杂度：O(n)，其中 n 是数组长度。
        //空间复杂度：O(1)。


        public int jump(int[] nums) {
                int length = nums.length;
                int end = 0;
                int maxPosition = 0;
                int steps = 0;
                for (int i = 0; i < length - 1; i++) {
                        maxPosition = Math.max(maxPosition, i + nums[i]);
                        if (i == end) {
                                end = maxPosition;
                                steps++;
                        }
                }
                return steps;
        }



        public int jump1(int[] nums) {
                int max = 0;
                int x=0;
                int jump=0;
                int i=0;
                while (i<nums.length-1) {
                        jump++;
                        max = Math.max(max, nums[i]+i);
                        if (x==i){
                                x = max;
                                jump++;
                        }
                        i++;
                }
                return jump;
        }

}

