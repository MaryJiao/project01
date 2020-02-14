package com.atguigu.java;

public class 七进制数 {
    public String convertToBase7(int num) {
        String pro="";
        if(num<0){
            num=-num;
            pro="-";
        }
        StringBuffer sb=new StringBuffer();
        while(num!=0){
            int ys=num%7;
            sb.append("ys");
            num/=7;
        }
        String res=pro+sb.reverse().toString();
        return res;

    }
}
