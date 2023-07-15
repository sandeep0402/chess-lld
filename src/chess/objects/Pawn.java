package chess.objects;

import chess.PieceColor;
import chess.PieceType;

public class Pawn extends Piece{

	public Pawn(PieceColor color) {
		this.color = color;
		this.type = PieceType.PAWN;		
	}
	
	@Override
	boolean isMoveAllowed(Cell start, Cell end) {
		// TODO Auto-generated method stub
		return true;
	}
}
