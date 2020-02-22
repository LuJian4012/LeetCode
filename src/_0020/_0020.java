package _0020;

import java.util.Stack;

public class _0020
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.isValid("(])"));
		System.out.println(s.isValid("()[]{}"));
		System.out.println(s.isValid("(]"));
		System.out.println(s.isValid("([)]"));
		System.out.println(s.isValid("{[]}"));
	}
}

class Solution
{
	public boolean isValid(String s)
	{
		if (s == null || s.length() == 0)
			return true;
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			if (c == '(' || c == '{' || c == '[')
			{
				stack.push(c);
			}
			else if (c == ')' || c == ']' || c == '}')
			{
				if (stack.empty())
					return false;
				if ((c == ')' && stack.peek() == '(') || (c == '}' && stack.peek() == '{')
						|| (c == ']' && stack.peek() == '['))
					stack.pop();
				else
					return false;
			}
		}
		return stack.empty() ? true : false;
	}
}