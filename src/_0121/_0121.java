package _0121;

public class _0121
{
	public static void main(String[] args)
	{
		test(new int[] { 7, 1, 5, 3, 6, 4 });
		test(new int[] { 7, 6, 4, 3, 1 });
	}

	private static void test(int[] prices)
	{
		Solution s = new Solution();
		System.out.println(s.maxProfit(prices));
	}
}

class Solution
{
	public int maxProfit(int[] prices)
	{
		int minPrice = Integer.MAX_VALUE, maxProfit = 0;
		for (int i = 0; i < prices.length; i++)
		{
			if (prices[i] < minPrice)
				minPrice = prices[i];
			else
				maxProfit = Math.max(maxProfit, prices[i] - minPrice);
		}
		return maxProfit;
	}
}