package _LCOF._012;

public class _012
{
	public static void main(String[] args)
	{
		test(new char[][] { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } }, "ABCCED");
		test(new char[][] { { 'a', 'b' }, { 'c', 'd' } }, "abcd");
	}

	private static void test(char[][] board, String word)
	{
		Solution s = new Solution();
		System.out.println(s.exist(board, word));
	}
}

class Solution
{
	private char[][] board;
	private String word;

	public boolean exist(char[][] board, String word)
	{
		if (board == null || board.length == 0 || board[0].length == 0)
			return false;
		if (word == null || word.length() == 0)
			return true;
		this.board = board;
		this.word = word;
		for (int i = 0; i < board.length; i++)
			for (int j = 0; j < board[0].length; j++)
				if (dfs(i, j, 0))
					return true;
		return false;
	}

	private boolean dfs(int i, int j, int idx)
	{
		if (idx == word.length())
			return true;
		if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] == ' ')
			return false;
		if (board[i][j] != word.charAt(idx))
			return false;
		char temp = board[i][j];
		board[i][j] = ' ';
		if (!dfs(i + 1, j, idx + 1) && !dfs(i - 1, j, idx + 1) && !dfs(i, j + 1, idx + 1) && !dfs(i, j - 1, idx + 1))
		{
			board[i][j] = temp;
			return false;
		}
		return true;
	}
}