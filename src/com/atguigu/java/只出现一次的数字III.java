package com.atguigu.java;

/**
 * @author Mary
 * @date 2020/2/12 - 11:30 上午
 */
public class 只出现一次的数字III {
    public int[] singleNumber(int[] nums) {
        //首先将所有元素进行异或
        int val=0;
        for(int i=0;i<nums.length;i++){
            val=val^nums[i];
        }
        //找到第一为0的位置
        int index=1;
        while((val^index)!=1){
            index=index<<1;
        }
        int [] res=new int[2];
        for (int i = 0; i <nums.length; i++) {
            if((nums[i]&index)==0){
                res[0]^=nums[i];
            }else{
                res[1]^=nums[i];
            }
        }
        return res;
    }
}
