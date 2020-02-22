package solution;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class _0046
{
	private static List<List<Integer>> permute(int[] nums)
	{
		if (nums == null || nums.length == 0)
			return Collections.emptyList();
		List<List<Integer>> res = new LinkedList<>();
		if (nums.length == 1)
		{
			res.add(Arrays.asList(nums[0]));
		}
		else
		{
			List<List<Integer>> sub = permute(Arrays.copyOfRange(nums, 1, nums.length));
			for (int i = 0; i < sub.size(); i++)
			{
				for (int j = 0; j < nums.length; j++)
				{
					LinkedList<Integer> newList = new LinkedList<>(sub.get(i));
					newList.add(j, nums[0]);
					res.add(newList);
				}
			}
		}
		return res;
	}

	public static void main(String[] args)
	{
		System.out.println(permute(new int[] { 1, 2, 3 }));
	}

}
