package _0054;

import java.util.ArrayList;
import java.util.List;

public class _0054
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.spiralOrder(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }));
		System.out.println(s.spiralOrder(new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } }));
	}
}

class Solution
{
	public List<Integer> spiralOrder(int[][] matrix)
	{
		List<Integer> res = new ArrayList<>();
		if (matrix == null || matrix.length == 0)
			return res;
		int top = 0, bottom = matrix.length - 1, left = 0, right = matrix[0].length - 1;
		while (true)
		{
			if (top > bottom)
				break;
			for (int i = left; i <= right; i++)
				res.add(matrix[top][i]);
			top++;
			if (left > right)
				break;
			for (int i = top; i <= bottom; i++)
				res.add(matrix[i][right]);
			right--;
			if (top > bottom)
				break;
			for (int i = right; i >= left; i--)
				res.add(matrix[bottom][i]);
			bottom--;
			if (left > right)
				break;
			for (int i = bottom; i >= top; i--)
				res.add(matrix[i][left]);
			left++;
		}
		return res;
	}
}