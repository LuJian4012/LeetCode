package _0179;

import java.util.Arrays;
import java.util.Comparator;

public class _0179
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.largestNumber(new int[] { 10, 2 }));
		System.out.println(s.largestNumber(new int[] { 3, 30, 34, 5, 9 }));
	}
}

class Solution
{
	public String largestNumber(int[] nums)
	{
		String[] strs = new String[nums.length];
		for (int i = 0; i < nums.length; i++)
			strs[i] = "" + nums[i];
		Arrays.sort(strs, new Comparator<String>()
		{
			public int compare(String o1, String o2)
			{
				String a = o1 + o2;
				String b = o2 + o1;
				return b.compareTo(a);
			};
		});
		if (strs[0].equals("0"))
			return "0";
		StringBuilder sb = new StringBuilder();
		for (String str : strs)
			sb.append(str);
		return sb.toString();
	}
}