package com.mianshi150.topic1;

import java.util.Arrays;

public class _1shuzuhebing {
    //给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
    //请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
    //注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。
    // 为了应对这种情况，nums1 的初始长度为 m + n，
    // 其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。
    //示例 1：
    //输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
    //输出：[1,2,2,3,5,6]
    //解释：需要合并 [1,2,3] 和 [2,5,6] 。
    //合并结果是 [1,2,2,3,5,6] ，其中斜体加粗标注的为 nums1 中的元素。


    //我使用了尾部插法,从两个数组尾部比较,把大的放在a的末尾(此时为0),
    // 被放入数的数组下标--,这样不会需要a,b再进行额外比较(若从头部开始比较小数),会存在a的最小值比b的最大值还大,引发大量比较
    //重点是,此方法存放数组的下标永远不会碰触到a的下标,就算b全部放入,a不动存放数组的指针也仅仅只是贴上a的下标
    public static void main(String[] args) {
        int[] a= {2,9,8,6,11,0,0,0,0,0};
        int[] b={2,8,9,6,8};
        Arrays.sort(a,0,4);
        System.out.println(Arrays.toString(a));
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));
        for (int i=a.length- b.length-1, j=b.length-1,n=a.length-1;n>=0;n--){
            if(i<0){
                System.arraycopy(b,0,a,0,j);
                break;
            } else if (j<0) {
                break;
            }
            if (a[i]>b[j]){
                a[n]=a[i--];
            }else {
                a[n]=b[j--];
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
