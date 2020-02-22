package _0003;

import java.util.Arrays;

public class _0003
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.lengthOfLongestSubstring("abcabcbb"));
		System.out.println(s.lengthOfLongestSubstring("bbbbb"));
		System.out.println(s.lengthOfLongestSubstring("pwwkew"));
		System.out.println(s.lengthOfLongestSubstring("aab"));
		System.out.println(s.lengthOfLongestSubstring("au"));
		System.out.println(s.lengthOfLongestSubstring("abba"));
		System.out.println(s.lengthOfLongestSubstring("tmmzuxt"));
	}
}

class Solution
{
	public int lengthOfLongestSubstring(String s)
	{
		int[] map = new int[128];
		Arrays.fill(map, -1);
		int begin = 0, maxLength = 0;
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++)
		{
			begin = Math.max(map[chars[i]] + 1, begin);
			maxLength = Math.max(i - begin + 1, maxLength);
			map[chars[i]] = i;
		}
		return maxLength;
	}
}