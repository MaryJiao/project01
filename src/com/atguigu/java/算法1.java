package com.atguigu.java;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Mary
 * @date 2020/2/13 - 7:21 上午
 * 拆分红包
 * @patam totalAmount 总金额(以分为单位)
 * @param totalPeopleNum 总人数
 *
 */
public class 算法1 {
    public static void main(String[] args) {
        List<Integer> amoutList=divideRedPackage(1000,10);
        for (int i = 0; i <amoutList.size(); i++) {
            int amout=amoutList.get(i);
            System.out.println("抢到的第"+(i+1)+"红包金额为："+new BigDecimal(amout).divide(new BigDecimal(100)));
        }
    }
    public static List<Integer> divideRedPackage(int totalAmount,int totalPeopleNum){
        List<Integer> amoutList= new ArrayList<>();
        Integer restTotalAmount=totalAmount;
        Integer restTotalPeopleNum=totalPeopleNum;
        Random random=new Random();
        //随机范围：[1，剩余人均金额的2倍-0。01]
        for(int i=restTotalPeopleNum-1;i>0;i--){
            //找到应该分的金额
            int amout=random.nextInt(restTotalAmount/restTotalPeopleNum*2-1)+1;
            amoutList.add(amout);
            restTotalAmount-=amout;
            restTotalPeopleNum--;
        }
        //最后一个人
        amoutList.add(restTotalAmount);
        return  amoutList;
    }

}
