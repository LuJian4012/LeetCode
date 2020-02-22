package _0150;

import java.util.Stack;

public class _0150
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.evalRPN(new String[] { "2", "1", "+", "3", "*" }));
		System.out.println(s.evalRPN(new String[] { "4", "13", "5", "/", "+" }));
		System.out.println(
				s.evalRPN(new String[] { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+" }));
	}
}

class Solution
{
	public int evalRPN(String[] tokens)
	{
		Stack<Integer> stack = new Stack<>();
		for (String token : tokens)
		{
			Integer a, b;
			switch (token)
			{
				case "+":
					b = stack.pop();
					a = stack.pop();
					stack.push(a + b);
					break;
				case "-":
					b = stack.pop();
					a = stack.pop();
					stack.push(a - b);
					break;
				case "*":
					b = stack.pop();
					a = stack.pop();
					stack.push(a * b);
					break;
				case "/":
					b = stack.pop();
					a = stack.pop();
					stack.push(a / b);
					break;
				default:
					stack.push(Integer.parseInt(token));
			}
		}
		return stack.pop();
	}
}