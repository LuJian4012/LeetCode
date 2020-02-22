package _0079;

public class _0079
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.exist(
				new char[][] { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } }, "ABCCED"));
		System.out.println(s
				.exist(new char[][] { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } }, "SEE"));
		System.out.println(s.exist(
				new char[][] { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } }, "ABCB"));
	}
}

class Solution
{
	char[][] board;
	String word;

	public boolean exist(char[][] board, String word)
	{
		if (board == null)
			return false;
		this.board = board.clone();
		this.word = word;
		for (int i = 0; i < board.length; i++)
			for (int j = 0; j < board[0].length; j++)
				if (dfs(i, j, 0))
					return true;
		return false;
	}

	private boolean dfs(int x, int y, int index)
	{
		if (x < 0 || x >= board.length || y < 0 || y >= board[0].length)
			return false;
		if (board[x][y] != word.charAt(index))
			return false;
		board[x][y] = '\0';
		boolean ret = index == word.length() - 1 || dfs(x + 1, y, index + 1) || dfs(x - 1, y, index + 1)
				|| dfs(x, y + 1, index + 1) || dfs(x, y - 1, index + 1);
		board[x][y] = word.charAt(index);
		return ret;
	}
}