package Solution;

import java.util.Stack;

public class ReversePolishNotation {
	
	public static int evalRPN(String[] tokens) {
        int sum=0;
        String operator="+-*/";
        Stack<Integer>stack=new Stack<Integer>();
        for(String s:tokens){
        	if(!operator.contains(s)){
        		stack.push(Integer.valueOf(s));
        	}
        	else{
        		int a=stack.pop();
    			int b=stack.pop();
        		int index=operator.indexOf(s);
        		switch(index){
        		case 0:
        			stack.push(a+b);
        			break;
        		case 1:
        			stack.push(b-a);
        			break;
        		case 2:
        			stack.push(a*b);
        			break;
        		case 3:
        			stack.push(b/a);	
        			break;
        		}
        		
        			
        	}
        	
        }
        sum=stack.pop();
        return sum;
    }
	
	
	public static void main(String[] args){
		String[] tokens={"5","1","/"};
		System.out.print(evalRPN(tokens));
	}

}
