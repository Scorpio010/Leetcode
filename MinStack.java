package leetcode.p155;

import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack= new Stack<>();
    private Stack<Integer> minstack = new Stack<>();
    public MinStack() {

    }

    public void push(int val) {
     stack.push(val);
     int e = minstack.pop();
     if (!minstack.isEmpty()&&val<e){
         minstack.push(val);
     }
    }

    public void pop() {
     stack.pop();
     minstack.pop();
    }

    public int top() {
     int e = stack.peek();
     return e;
    }

    public int getMin() {
    int e = minstack.peek();
    return e;
    }
}
