package _0078;

import java.util.LinkedList;
import java.util.List;

public class _0078
{

	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.subsets(new int[] { 1, 2, 3 }));
	}

}

class Solution
{
	public List<List<Integer>> subsets(int[] nums)
	{
		List<List<Integer>> res = new LinkedList<>();
		for (int i = 0; i < 1 << nums.length; i++)
		{
			List<Integer> sub = new LinkedList<>();
			for (int j = 0; j < nums.length; j++)
				if ((i >> j & 1) == 1)
					sub.add(nums[j]);
			res.add(sub);
		}
		return res;
	}
}