package chess.objects;

import chess.PieceColor;
import chess.PieceType;

public class Queen extends Piece{

	public Queen(PieceColor color) {
		this.color = color;
		this.type = PieceType.QUEEN;		
	}
	
	@Override
	boolean isMoveAllowed(Cell start, Cell end) {
		// TODO Auto-generated method stub
		return true;
	}
}
