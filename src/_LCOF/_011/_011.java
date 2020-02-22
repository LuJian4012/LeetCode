package _LCOF._011;

public class _011
{
	public static void main(String[] args)
	{
		test(new int[] { 3, 4, 5, 1, 2 });
		test(new int[] { 2, 2, 2, 0, 1 });
	}

	private static void test(int[] numbers)
	{
		Solution s = new Solution();
		System.out.println(s.minArray(numbers));
	}
}

class Solution
{
	public int minArray(int[] numbers)
	{
		for (int i = 1; i < numbers.length; i++)
			if (numbers[i] < numbers[i - 1])
				return numbers[i];
		return numbers[0];
	}
}