package com.atguigu.java;

/**
 * @author Mary
 * @date 2020/2/12 - 8:59 上午
 */
public class 旋转数组 {
    public void rotate(int[] nums, int k) {
        int len=nums.length;
        k=k%len;
        //进行旋转
        swap(nums,0,len-1-k);
        swap(nums,len-k,len-1);
        swap(nums,0,len-1);
   }
   public  static void swap(int [] nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
   }

}
