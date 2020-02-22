package _0011;

public class _0011
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }));
	}

}

class Solution
{
	public int maxArea(int[] height)
	{
		if (height.length <= 1)
			return 0;
		int i = 0, j = height.length - 1, max = 0;
		while (i < j)
		{
			max = Math.max(max, (j - i) * Math.min(height[i], height[j]));
			if (height[i] < height[j])
				i++;
			else
				j--;
		}
		return max;
	}
}
