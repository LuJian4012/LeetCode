package _0049;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _0049
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.groupAnagrams(new String[] { "eat", "tea", "tan", "ate", "nat", "bat" }));
	}
}

class Solution
{
	public List<List<String>> groupAnagrams(String[] strs)
	{
		Map<String, List<String>> map = new HashMap<>();
		for (String s : strs)
		{
			char[] chars = s.toCharArray();
			Arrays.sort(chars);
			String str = String.valueOf(chars);
			List<String> list = map.get(str);

			if (list != null)
				list.add(s);
			else
			{
				list = new ArrayList<>();
				list.add(s);
				map.put(str, list);
			}
		}
		return new ArrayList<>(map.values());
	}
}