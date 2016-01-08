
public class TicTacToeBoard {
	//instance variables
	public static final int boardHeight = 3;
	public static final int boardWidth = 3;
	public String spaces[][];
	//Class Variables
	public static String EMPTY_SPACES = "_";
	public static String X_SPACE = "X";
	public static String O_SPACE = "O";
	//Constructor
	public TicTacToeBoard()
	{
		spaces = new String[boardHeight][boardWidth];
		clearBoard();
	}
	//other methods
	public void clearBoard()
	{
		for(int i = 0; i < boardWidth; i++)
		{
			for(int j = 0; j < boardHeight; j++)
			spaces[i][j] = EMPTY_SPACES;
		}
	}
	//draws the board
	public void drawBoard()
	{
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				System.out.print(spaces[i][j] + "|");
			}
			System.out.println();
		}
	}
	//checks the board horizontally to see if a player has won
	private boolean checkHorizontalVictory()
	{
		for(int i = 0; i < boardWidth; i++)
		{
			if(spaces[i][0].equals(spaces[i][1])&&(spaces[i][1].equals(spaces[i][2])))
			{
				if((spaces[i][0].equals(X_SPACE))&&(spaces[i][1].equals(X_SPACE))&&(spaces[i][2].equals(X_SPACE)))
				{
				return true;
				}
				if((spaces[i][0].equals(O_SPACE))&&(spaces[i][1].equals(O_SPACE))&&(spaces[i][2].equals(O_SPACE)))
				{
				return true;
				}
			}
		}
		return false;
	}
	//checks the board vertically to see if a player has won
	private boolean checkVerticalVictory()
	{
		for(int i = 0; i < boardHeight; i++)
		{
			if(spaces[0][i].equals(spaces[1][i])&&(spaces[1][i].equals(spaces[2][i])))
			{
				if((spaces[0][i].equals(X_SPACE))&&(spaces[1][i].equals(X_SPACE))&&(spaces[2][i].equals(X_SPACE)))
				{
				return true;
				}
				if((spaces[0][i].equals(O_SPACE))&&(spaces[1][i].equals(O_SPACE))&&(spaces[2][i].equals(O_SPACE)))
				{
				return true;
				}
			}
		}
		return false;
	}
	//checks the board diagonally to see if a player has won
	private boolean checkDiagonalVictory()
	{
		if(((spaces[0][0].equals(X_SPACE))&&(spaces[1][1].equals(X_SPACE))&&(spaces[2][2].equals(X_SPACE)))||
		((spaces[2][0].equals(X_SPACE))&&(spaces[1][1].equals(X_SPACE))&&(spaces[0][2].equals(X_SPACE))))
		{
			return true;
		}
		else if(((spaces[0][0].equals(O_SPACE))&&(spaces[1][1].equals(O_SPACE))&&(spaces[2][2].equals(O_SPACE)))||
		((spaces[2][0].equals(O_SPACE))&&(spaces[1][1].equals(O_SPACE))&&(spaces[0][2].equals(O_SPACE))))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	//if any of the three previous check methods are true it returns true to the driver
	public boolean checkVictory()
	{
		if((checkHorizontalVictory() == true)||(checkVerticalVictory() == true)||(checkDiagonalVictory() == true))
		{
			return true;
		}
		return false;
	}
	//checks the board for empty spaces
	public boolean checkFilledBoard()
	{
		for(int i = 0; i < boardWidth; i++)
		{
			for(int j = 0; j < boardHeight; j++)
			{
				if(spaces[i][j].equals(EMPTY_SPACES))
				{
					return false;
				}
			}	
		}
		return true;
	}
	//sets the players position and makes sure it makes sense
	public boolean setSpace(int xVal, int yVal, String player)
	{
		if((xVal < boardHeight||xVal > 0)||(yVal < boardWidth||yVal > 0))
		{
			if(spaces[xVal][yVal].equals(X_SPACE)||spaces[xVal][yVal].equals(O_SPACE))
			{
				return false;
			}
			else if(spaces[xVal][yVal].equals(EMPTY_SPACES))
			{
				spaces[xVal][yVal] = player;
				return true;
			}
		}
		else
		{
			return false;
		}
		return false;
	}
}
