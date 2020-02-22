package _0071;

import java.util.Stack;

public class _0071
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.simplifyPath("/home/"));
		System.out.println(s.simplifyPath("/../"));
		System.out.println(s.simplifyPath("/home//foo/"));
		System.out.println(s.simplifyPath("/a/./b/../../c/"));
		System.out.println(s.simplifyPath("/a/../../b/../c//.//"));
		System.out.println(s.simplifyPath("/a//b////c/d//././/.."));
	}
}

class Solution
{
	public String simplifyPath(String path)
	{
		String[] dirs = path.split("/");
		Stack<String> stack = new Stack<>();
		for (String dir : dirs)
		{
			if (dir.equals(".") || dir.equals(""))
				continue;
			else if (dir.equals(".."))
			{
				if (stack.empty())
					continue;
				else
					stack.pop();
			}
			else
				stack.push(dir);
		}
		if (stack.empty())
			return "/";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < stack.size(); i++)
			sb.append("/" + stack.get(i));
		return sb.toString();
	}
}