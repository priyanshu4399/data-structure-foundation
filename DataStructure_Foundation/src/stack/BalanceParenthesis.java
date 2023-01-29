package stack;

import java.util.Stack;

public class BalanceParenthesis {

	public static boolean isBalanced(String str) {
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch=='(' || ch=='[' || ch=='{') {
				stack.push(ch);
				continue;
			}
			if(stack.isEmpty()) return false;
			
			char poppedChar = stack.pop();
			if(ch == ')' && poppedChar != '(') return false;
			if(ch == ']' && poppedChar != '[') return false;
			if(ch == '}' && poppedChar != '{') return false;
		}
		return stack.isEmpty();
	}
	public static boolean isBalanced2(String str) {
		Stack<Character> stack = new Stack<Character>();
		for (char c : str.toCharArray()) {
			if (c == '(')
				stack.push(')');
			else if (c == '{')
				stack.push('}');
			else if (c == '[')
				stack.push(']');
			else if (stack.isEmpty() || stack.pop() != c)
				return false;
		}
		return stack.isEmpty();
	}
	public static void main(String[] args) {
		String str = "[[{{}}{]]";
		System.out.println(isBalanced(str));
	}

	

}
