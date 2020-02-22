package _0136;

public class _0136
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.singleNumber(new int[] { 2, 2, 1 }));
	}
}

class Solution
{
	public int singleNumber(int[] nums)
	{
		int ret = 0;
		for (int num : nums)
			ret ^= num;
		return ret;
	}
}