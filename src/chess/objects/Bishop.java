package chess.objects;

import chess.PieceColor;
import chess.PieceType;

public class Bishop extends Piece{

	public Bishop(PieceColor color) {
		this.color = color;
		this.type = PieceType.BISHOP;		
	}
	
	@Override
	boolean isMoveAllowed(Cell start, Cell end) {
		// TODO Auto-generated method stub
		return true;
	}
}
