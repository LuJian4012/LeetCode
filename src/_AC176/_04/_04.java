package _AC176._04;

import java.util.Arrays;

public class _04
{

	public static void main(String[] args)
	{
		test(new int[] { 9, 3, 5 });
		test(new int[] { 1, 1, 1, 2 });
		test(new int[] { 8, 5 });

	}

	private static void test(int[] target)
	{
		Solution s = new Solution();
		System.out.println(s.isPossible(target));
	}
}

class Solution
{
	public boolean isPossible(int[] target)
	{
		Arrays.sort(target);
		int sum = 0;
		for (int i = 0; i < target.length; i++)
		{
			int temp = target[i];
			target[i] = 1;
			while (sum < temp)
			{
				for (int j = 0; j <= i; j++)
					sum += target[j];
				sum += target.length - i - 1;
				if (sum > temp)
					return false;
				if (sum == temp)
				{
					target[i] = temp;
					sum = 0;
					break;
				}
				target[i] = sum;
				sum = 0;
			}
		}
		return true;
	}
}