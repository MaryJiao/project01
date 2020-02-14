package com.atguigu.java;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Mary
 * @date 2020/2/12 - 9:11 上午
 */
public class 多数元素 {
    public int majorityElement(int[] nums) {
        int len=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i <len; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])>=len/2){
                return nums[i];
            }
        }
        return -1;
    }
}
