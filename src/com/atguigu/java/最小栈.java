package com.atguigu.java;

import java.util.Stack;

public class 最小栈 {
    Stack<Integer> sk=new Stack<>();
    Stack<Integer> sk2=new Stack<>();
    public void push(int x) {
        sk.push(x);
        if(sk2.isEmpty() || sk.peek()>=x){
            sk2.push(x);
        }else{
            sk2.push(sk2.peek());
        }
    }

    public void pop() {
        sk.pop();
        sk2.pop();
    }

    public int top() {
        if(!sk.isEmpty()){
            sk.peek();
        }
        return -1;
    }

    public int getMin() {
        if(!sk2.isEmpty()){
            return sk2.pop();
        }
        return -1;
    }

}

