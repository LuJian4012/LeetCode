package _0010;

public class _0010
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.isMatch("aa", "a"));
		System.out.println(s.isMatch("aa", "a*"));
		System.out.println(s.isMatch("ab", ".*"));
		System.out.println(s.isMatch("aab", "c*a*b"));
		System.out.println(s.isMatch("mississippi", "mis*is*p*."));
	}
}

class Solution
{
	public boolean isMatch(String s, String p)
	{
		int is = 0, ip = 0;
		if (ip + 1 < p.length() && p.charAt(ip + 1) == '*')
		{
			char c = p.charAt(ip);
			if(c=='.')
			{
				
			}
			else
			{
				ip += 2;
				while (ip < p.length() && p.charAt(ip) == c)
					ip++;
				return isMatch(s, p)
			}
			
		}
		return false;
	}
}