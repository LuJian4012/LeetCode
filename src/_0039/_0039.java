package _0039;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class _0039
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.combinationSum(new int[] { 2, 3, 6, 7 }, 7));
	}
}

class Solution
{
	private List<List<Integer>> list = new ArrayList<>();
	private Stack<Integer> stack = new Stack<>();

	public List<List<Integer>> combinationSum(int[] candidates, int target)
	{
		if (candidates.length == 0 || candidates == null)
			return Collections.emptyList();
		Arrays.sort(candidates);
		combinationFromIndex(candidates, 0, target);
		return list;
	}

	private void combinationFromIndex(int[] candidates, int index, int target)
	{
		if (target == 0)
			list.add(new ArrayList<>(stack));
		else if (target > 0)
			for (int i = index; i < candidates.length; i++)
			{
				if (candidates[i] > target)
					break;
				stack.add(candidates[i]);
				combinationFromIndex(candidates, i, target - candidates[i]);
				stack.pop();
			}
	}
}