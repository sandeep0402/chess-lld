package chess.objects;

import chess.PieceColor;
import chess.PieceType;

public class Board {
	Cell[][] cells;
	PieceColor previousColor;
	
	public void init() {
		cells = new Cell[8][8];
		for(int i=0; i<8; i++){
			for(int j=0; j<8; j++){
				cells[i][j] = new Cell(i,j);
			}
		}
		
		for(int i=0; i<8; i++){
			Piece piece = new Pawn(PieceColor.WHITE);
			cells[1][i].piece = piece;
		}	
		for(int i=0; i<8; i++){
			Piece piece = new Pawn(PieceColor.BLACK);
			cells[6][i].piece = piece;
		}	
		cells[0][0].piece=new Rooke(PieceColor.WHITE);
		cells[0][7].piece=new Rooke(PieceColor.WHITE);
		cells[7][0].piece=new Rooke(PieceColor.BLACK);
		cells[7][7].piece=new Rooke(PieceColor.BLACK);

		cells[0][1].piece=new Knight(PieceColor.WHITE);
		cells[0][6].piece=new Knight(PieceColor.WHITE);
		cells[7][1].piece=new Knight(PieceColor.BLACK);
		cells[7][6].piece=new Knight(PieceColor.BLACK);	

		cells[0][2].piece=new Bishop(PieceColor.WHITE);
		cells[0][5].piece=new Bishop(PieceColor.WHITE);
		cells[7][2].piece=new Bishop(PieceColor.BLACK);
		cells[7][5].piece=new Bishop(PieceColor.BLACK);	

		cells[0][3].piece=new King(PieceColor.WHITE);
		cells[0][4].piece=new Queen(PieceColor.WHITE);
		cells[7][3].piece=new King(PieceColor.BLACK);
		cells[7][4].piece=new Queen(PieceColor.BLACK);	
		
	}
	
	public void printBoard() {
		System.out.println();
		for(int i=0; i<8; i++){
			for(int j=0; j<8; j++){
				String ANSI_TEXT_COLOR = "";
				if(cells[i][j].piece!=null && cells[i][j].piece.color==PieceColor.WHITE) {
					ANSI_TEXT_COLOR = "\u001B[37m";
				}else if(cells[i][j].piece!=null && cells[i][j].piece.color==PieceColor.BLACK){
					ANSI_TEXT_COLOR = "\u001B[34m";
				}
				System.out.print("\u001B[46m" +ANSI_TEXT_COLOR+ cells[i][j].piece + " "+"\u001B[0m");
			}
			System.out.println();
		}
	}
	
	public boolean move(PieceColor pieceColor, int x1, int y1, int x2, int y2) {
		Cell start = cells [x1][y1];
		Cell end = cells[x2][y2];
		if(pieceColor==previousColor || start.piece == null || pieceColor!=start.piece.color || (end.piece!=null && end.piece.color==pieceColor) ) {
			System.out.println("Invalid move");
			return false;
		}
		if(start.piece.isMoveAllowed(start, end)) {
			end.piece = start.piece;
			start.piece = null;
		}
		previousColor = pieceColor;
		return true;
	}
}
