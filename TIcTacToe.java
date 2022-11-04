import java.util.Scanner;


enum Cell {
	X, O, EMPTY
};


class TicTacToe {
	private Cell[][] board;
	private Scanner input = new Scanner(System.in);


	/**
	 * constructor
	 */
	public TicTacToe() {
		this.board = new Cell[3][3];
		// The constructor should initialize the board elements to EMPTY.
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = Cell.EMPTY;
			}
		}
	}


	/**
	 * This method allows to play game
	 */
	public void displayBoard() {
		for (int i = 0; i < 3; i++) {
			if (i == 1 || i == 2) {
				System.out.println("——————————");
			}
			for (int j = 0; j < 3; j++) {
				System.out.print(cellToChar(board[i][j]));
				if (j < 2) {
					System.out.print(" | ");
				}
			}
			System.out.println();
		}
	}


	/**
	 * This method allows to play game
	 */
	public void play() {
		int move;
		System.out.print("Do you want to do first?(y/n): ");
		String goFirst = input.nextLine();
		boolean isWinner = false;
		for (move = 0; move < 9; move++) {
			displayBoard();
			// swap players
			if (goFirst.compareToIgnoreCase("y") == 0) {
				playerSelectsCell((move % 2 == 0) ? Cell.X : Cell.O);
			} else {
				playerSelectsCell((move % 2 == 0) ? Cell.O : Cell.X);
			}


			// check winner using aspect
			Cell winnerCell = isWinner();
			if (winnerCell != Cell.EMPTY) {
				displayBoard();
				System.out.println("\nPlayer " + cellToChar(winnerCell) + " won the game\n");
				move = 10;
				isWinner = true;
			}
		}
		if (!isWinner) {
			System.out.println("\nDraw\n");
		}
	}


	/**
	 * This method allows to select correct cell
	 * 
	 * @param playerCell
	 */
	private void playerSelectsCell(Cell playerCell) {
		int selectedRow = 0;
		int selectedColumn = 0;
		boolean isCorrectCell = false;
		System.out.println("\nPlayer " + cellToChar(playerCell) + " select cell\n");


		while (!isCorrectCell) {
			// get row from a user
			selectedRow = getCorrectPosition("row");
			// get column from a user
			selectedColumn = getCorrectPosition("column");
			if (board[selectedRow - 1][selectedColumn - 1] == Cell.EMPTY) {
				board[selectedRow - 1][selectedColumn - 1] = playerCell;
				isCorrectCell = true;
			} else {
				// display message: "Wrong cell, try again!"
				System.out.println("\nWrong cell, try again!\n");
			}
		}
		input.nextLine();
	}


	/**
	 * This function allows to get correct row or column
	 * 
	 * @param positionName
	 * @return
	 */
	private int getCorrectPosition(String positionName) {
		int position = -1;
		while (position == -1) {
			System.out.print("Enter the " + positionName + ": ");
			position = input.nextInt();
			// check if row or column is correct
			if (position < 1 || position > 3) {
				System.out.println("\nEnter a " + positionName + " on the board (between 1 and 3, inclusive).\n");
				position = -1;
			}
		}
		return position;
	}
	/**
	 * Cell to char
	 * @param cell
	 * @return
	 */
	public char cellToChar(Cell cell) {
		if (cell == Cell.X) {
			return 'X';
		}
		if (cell == Cell.O) {
			return 'O';
		}
		return ' ';
	}


	public Cell isWinner() {
		int horizontalCounter, verticalCounter, diagonalCounter;
		int diagonalStartIndex = 2;
		Cell player;
		// Check horizontal
		for (int row = 0; row < 3; row++) {
			horizontalCounter = 0;
			player = board[row][0];
			for (int column = 0; column < 3; column++) {
				if (board[row][column] == player) {
					horizontalCounter++;
				}
			}
			if (horizontalCounter == 3) {
				return player;
			}
		}
		// Check vertical
		for (int column = 0; column < 3; column++) {
			verticalCounter = 0;
			player = board[0][column];
			for (int row = 0; row < 3; row++) {
				if (board[row][column] == player) {
					verticalCounter++;
				}
			}
			if (verticalCounter == 3) {
				return player;
			}
		}
		// Check diagonal '\'
		player = board[0][0];
		diagonalCounter = 0;
		for (int row = 0; row < 3; row++) {
			if (board[row][row] == player) {
				diagonalCounter++;
			}
			if (diagonalCounter == 3) {
				return player;
			}
		}
		// Check diagonal '/'
		player = board[0][2];
		diagonalCounter = 0;
		for (int column = 0; column < 3; column++) {
			if (board[diagonalStartIndex][column] == player) {
				diagonalCounter++;
			}
			diagonalStartIndex--;
			if (diagonalCounter == 3) {
				return player;
			}
		}
		return Cell.EMPTY;


	}
}