package chess.objects;

import chess.PieceColor;
import chess.PieceType;

public class Knight extends Piece{

	public Knight(PieceColor color) {
		this.color = color;
		this.type = PieceType.KNIGHT;		
	}
	
	@Override
	boolean isMoveAllowed(Cell start, Cell end) {
		// TODO Auto-generated method stub
		return true;
	}
}
