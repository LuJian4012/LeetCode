package _0191;

public class _0191
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.hammingWeight(11));
		System.out.println(s.hammingWeight(-3));
	}
}

class Solution
{
	public int hammingWeight(int n)
	{
		int weight = 0;
		int mask = 1;
		for (int i = 0; i < 32; ++i)
		{
			if ((n & mask) != 0)
				++weight;
			mask <<= 1;
		}
		return weight;
	}
}