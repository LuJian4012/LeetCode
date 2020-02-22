package _0224;

import java.util.Stack;

public class _0224
{
	public static void main(String[] args)
	{

	}
}

class Solution
{
	public int calculate(String s)
	{
		Stack<Integer> dataStack = new Stack<>();
		Stack<String> opStack=new Stack<>();
		char[] chars=s.toCharArray();
		int operand=0;
		for(int i=0;i<chars.length;i++)
		{
			if(Character.isDigit(chars[i]))
				operand=operand*10+chars[i]-'0';
			else if(chars[i]==' ')
				
		}
		
	}
}