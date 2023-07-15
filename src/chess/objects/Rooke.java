package chess.objects;

import chess.PieceColor;
import chess.PieceType;

public class Rooke extends Piece{

	public Rooke(PieceColor color) {
		this.color = color;
		this.type = PieceType.ROOKE;		
	}
	
	@Override
	boolean isMoveAllowed(Cell start, Cell end) {
		// TODO Auto-generated method stub
		return true;
	}
}
