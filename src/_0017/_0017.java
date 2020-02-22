package _0017;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _0017
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.letterCombinations("23"));
	}
}

class Solution
{
	public List<String> letterCombinations(String digits)
	{
		String[][] hash = { {}, {}, { "a", "b", "c" }, { "d", "e", "f" }, { "g", "h", "i" }, { "j", "k", "l" },
				{ "m", "n", "o" }, { "p", "q", "r", "s" }, { "t", "u", "v" }, { "w", "x", "y", "z" } };
		if (digits == null || digits.length() == 0)
			return Collections.emptyList();
		if (digits.length() == 1)
			return Arrays.asList(hash[digits.charAt(0) - '0']);
		List<String> sub = letterCombinations(digits.substring(1));
		List<String> res = new ArrayList<>();
		int thisNum = digits.charAt(0) - '0';
		for (int i = 0; i < hash[thisNum].length; i++)
			for (int j = 0; j < sub.size(); j++)
				res.add(hash[thisNum][i] + sub.get(j));
		return res;
	}
}