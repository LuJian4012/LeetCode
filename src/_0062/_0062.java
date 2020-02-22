package _0062;

import java.util.Arrays;

public class _0062
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.uniquePaths(3, 2));
		System.out.println(s.uniquePaths(7, 3));
		System.out.println(s.uniquePaths(1, 1));
	}
}

class Solution
{
	public int uniquePaths(int m, int n)
	{
		// dp
		int[] count = new int[n];
		Arrays.fill(count, 1);
		for (int i = 1; i < m; i++)
			for (int j = 1; j < n; j++)
				count[j] += count[j - 1];
		return count[n - 1];

		// 排列组合
//		return (int) C(m + n - 2, m - 1); // 在m + n - 2步中挑m - 1步往右走
	}

//	private long A(long n, long m)
//	{
//		long res = 1;
//		for (int i = 0; i < m; i++)
//		{
//			res *= n;
//			n--;
//		}
//		return res;
//	}
//
//	private long C(long n, long m)
//	{
//		long half = n / 2;
//		if (m > half)
//			return A(n, n - m) / A(n - m, n - m);
//		return A(n, m) / A(m, m);
//	}
}