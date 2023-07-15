package chess.objects;

import chess.PieceColor;
import chess.PieceType;

public class King extends Piece{

	public King(PieceColor color) {
		this.color = color;
		this.type = PieceType.KING;		
	}
	
	@Override
	boolean isMoveAllowed(Cell start, Cell end) {
		// TODO Auto-generated method stub
		return true;
	}
}
