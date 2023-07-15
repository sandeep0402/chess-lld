package chess.objects;

import chess.PieceColor;

public class Game {

	public static void main(String[] args) {
		Player player1 = new Player("P1", PieceColor.WHITE);
		Player player2 = new Player("P2", PieceColor.BLACK);
		Player currentPlayer = player1;
		Board board = new Board();
		board.init();
		board.printBoard();
		
		boolean valid = board.move(currentPlayer.color, 1, 0, 2, 0);
		if(valid) {
			currentPlayer = player2;
		}
		valid = board.move(currentPlayer.color, 6, 7, 5, 7);
		if(valid) {
			currentPlayer = player1;
		}
		board.printBoard();
		System.out.println("Next player: " + currentPlayer.name);
		
	}

}
