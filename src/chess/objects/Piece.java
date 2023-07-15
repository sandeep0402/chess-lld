package chess.objects;

import chess.PieceColor;
import chess.PieceType;

public abstract class Piece {
	PieceColor color;
	PieceType type;
	
	abstract boolean isMoveAllowed(Cell start, Cell end);

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return type.name();
	}

}
