package _0022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _0022
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.generateParenthesis(3));
	}
}

class Solution
{
	public List<String> generateParenthesis(int n)
	{
		if (n <= 0)
			return Collections.emptyList();
		List<String> res = new ArrayList<>();
		dfs(res, "", n, n);
		return res;
	}

	private void dfs(List<String> res, String str, int left, int right)
	{
		if (left == 0 && right == 0)
		{
			res.add(str);
			return;
		}
		if (left > 0)
			dfs(res, str + "(", left - 1, right);
		if (right > 0 && left < right)
			dfs(res, str + ")", left, right - 1);
	}
}