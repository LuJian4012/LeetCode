package solution;

public class _0043
{
	private static String multiply(String num1, String num2)
	{
		if (num1 == null || num2 == null || num1.length() == 0 || num2.length() == 0)
			return null;
		char[] res = new char[num1.length() + num2.length()];
		for (int i = 0; i < res.length; i++)
		{
			res[i] = '0';
		}
		for (int i = num1.length() - 1; i >= 0; i--)
		{
			for (int j = num2.length() - 1; j >= 0; j--)
			{
				int temp = res[i + j + 1] - '0' + (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
				res[i + j + 1] = (char) (temp % 10 + '0');
				temp = res[i + j] - '0' + temp / 10;
				res[i + j] = (char) (temp + '0');
			}
		}
		String ans = new String(res);
		for (int i = 0; i < res.length; i++)
		{
			if (res[i] != '0')
				return ans.substring(i);
		}
		return "0";
	}

	public static void main(String[] args)
	{
		System.out.println(multiply(new String("9"), new String("99")));
		System.out.println(multiply(new String("123"), new String("456")));
	}

}
