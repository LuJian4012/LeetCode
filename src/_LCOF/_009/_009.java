package _LCOF._009;

import java.util.Stack;

public class _009
{

	public static void main(String[] args)
	{
		CQueue queue = new CQueue();
		queue.appendTail(3);
		System.out.println(queue.deleteHead());
		System.out.println(queue.deleteHead());
	}

}

class CQueue
{
	Stack<Integer> s1 = new Stack<>();
	Stack<Integer> s2 = new Stack<>();

	public CQueue()
	{

	}

	public void appendTail(int value)
	{
		s1.push(value);
	}

	public int deleteHead()
	{
		if (s2.empty())
			while (!s1.empty())
				s2.push(s1.pop());
		return s2.empty() ? -1 : s2.pop();
	}
}