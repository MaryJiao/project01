package com.atguigu.java;

import java.util.Arrays;

/**
 * @author Mary
 * @date 2020/2/12 - 9:59 上午
 */
public class 下一个排列 {
    public static void main(String[] args) {
        int [] nums={1,2,3};
        nextPermutation(nums);
    }
    public static void nextPermutation(int[] nums) {
        //从后向前，找到
        int index=getIndex(nums);

        if(index!=0){
            //没有更大的数
            exchange(nums,index);
            System.out.println(Arrays.toString(nums));
            //然后将元素进行排序
            Arrays.sort(nums,index+1,nums.length);
        }
    }
    public static int getIndex(int [] nums){
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                return i;
            }
        }
        return 0;
    }
    public static void exchange(int [] nums,int index){
        int minVal= Integer.MAX_VALUE;
        int dos=0;
        for(int i=index+1;i<nums.length;i++){
            if(nums[i]>nums[index]){
                if(minVal>nums[i]){
                    dos=i;
                    minVal=nums[i];
                }
            }
        }
        int temp=nums[index];
        nums[index]=minVal;
        nums[dos]=temp;
    }
}
