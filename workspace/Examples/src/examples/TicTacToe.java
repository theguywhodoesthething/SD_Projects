package examples;

public class TicTacToe {

	char[][] board = new char[3][3];
	
	public TicTacToe() {}

	public TicTacToe(char[][] board) {
		super();
		this.board = board;
	}
	
	public void startGame() {
		System.out.println("Welcome to TicTacToe.");
	}
	
	private char askUserForSymbol() {
		char s = ' ';
		return s;
	}
	
	private int[] askUserForWhichSquare() {
		int[] answer = new int[2];
		return answer;
	}
}
