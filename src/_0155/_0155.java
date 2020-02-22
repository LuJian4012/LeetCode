package _0155;

import java.util.Stack;

public class _0155
{
	public static void main(String[] args)
	{
		MinStack minStack = new MinStack();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		System.out.println(minStack.getMin());
		minStack.pop();
		minStack.top();
		System.out.println(minStack.getMin());
	}
}

class MinStack
{
	private Stack<Integer> stack;
	private Stack<Integer> minStack;

	public MinStack()
	{
		stack = new Stack<>();
		minStack = new Stack<>();
	}

	public void push(int x)
	{
		stack.push(x);
		if (minStack.empty())
			minStack.push(x);
		else
			minStack.push(Math.min(minStack.peek(), x));
	}

	public void pop()
	{
		stack.pop();
		minStack.pop();
	}

	public int top()
	{
		return stack.peek();
	}

	public int getMin()
	{
		return minStack.peek();
	}
}