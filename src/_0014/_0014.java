package _0014;

public class _0014
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.longestCommonPrefix(new String[] { "flower", "flow", "flight" }));
		System.out.println(s.longestCommonPrefix(new String[] { "dog", "racecar", "car" }));
		System.out.println(s.longestCommonPrefix(new String[] { "c", "abc", "ccc" }));
	}
}

class Solution
{
	public String longestCommonPrefix(String[] strs)
	{
		if (strs == null || strs.length == 0)
			return "";
		int minLen = Integer.MAX_VALUE;
		for (String str : strs)
			minLen = Math.min(minLen, str.length());
		int low = 1, high = minLen;
		while (low <= high)
		{
			int middle = (low + high) / 2;
			if (isCommonPrifix(strs, middle))
				low = middle + 1;
			else
				high = middle - 1;
		}
		return strs[0].substring(0, (low + high) / 2);
	}

	private boolean isCommonPrifix(String[] strs, int len)
	{
		String prefix = strs[0].substring(0, len);
		for (int i = 1; i < strs.length; i++)
			if (!strs[i].startsWith(prefix))
				return false;
		return true;
	}
}