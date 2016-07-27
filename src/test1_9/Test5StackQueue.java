package test1_9;

import java.util.Stack;

public class Test5StackQueue {
	Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);
    }
    
    public int pop() {
    	if(!stack2.isEmpty()) return stack2.pop();
    	else{
    		while(!stack1.isEmpty()){
    			int popup = stack1.pop();
    			stack2.push(popup);
    		}
    		return stack2.pop();
    	}
    }
    
   public static void main(String[] args) {
	   Test5StackQueue queue = new Test5StackQueue();
	   queue.push(1);
	   queue.push(2);
	   queue.push(3);
	   System.out.println(queue.pop());
	   System.out.println(queue.pop());
	   queue.push(4);
	   System.out.println(queue.pop());
	   queue.push(5);
	   System.out.println(queue.pop());
	   System.out.println(queue.pop());
   }
}
