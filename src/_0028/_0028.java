package _0028;

public class _0028
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.strStr("hello", "ll"));
		System.out.println(s.strStr("aaaaa", "bba"));
	}
}

class Solution
{
	public int strStr(String haystack, String needle)
	{
		if (needle.equals(""))
			return 0;
		KMP kmp = new KMP(needle);
		return kmp.search(haystack);
	}

	class KMP
	{
		private String pat;

		private int[][] dp;

		public KMP(String pat)
		{
			this.pat = pat;
			int M = pat.length();
			dp = new int[M][256];
			dp[0][pat.charAt(0)] = 1;
			int X = 0;
			for (int j = 1; j < M; j++)
			{
				for (int c = 0; c < 256; c++)
				{
					if (pat.charAt(j) == c)
						dp[j][c] = j + 1;
					else
						dp[j][c] = dp[X][c];
				}
				X = dp[X][pat.charAt(j)];
			}
		}

		public int search(String txt)
		{
			int M = pat.length();
			int N = txt.length();
			int j = 0;
			for (int i = 0; i < N; i++)
			{
				j = dp[j][txt.charAt(i)];
				if (j == M)
					return i - M + 1;
			}
			return -1;
		}
	}
}