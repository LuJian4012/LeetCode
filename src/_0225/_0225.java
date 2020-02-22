package _0225;

import java.util.LinkedList;
import java.util.Queue;

public class _0225
{
	public static void main(String[] args)
	{
		MyStack stack = new MyStack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.empty());
	}
}

class MyStack
{
	Queue<Integer> queue;

	/** Initialize your data structure here. */
	public MyStack()
	{
		queue = new LinkedList<>();
	}

	/** Push element x onto stack. */
	public void push(int x)
	{
		int size = queue.size();
		queue.add(x);
		for (int i = 0; i < size; i++)
			queue.add(queue.poll());
	}

	/** Removes the element on top of the stack and returns that element. */
	public int pop()
	{
		return queue.poll();
	}

	/** Get the top element. */
	public int top()
	{
		return queue.peek();
	}

	/** Returns whether the stack is empty. */
	public boolean empty()
	{
		return queue.isEmpty();
	}
}