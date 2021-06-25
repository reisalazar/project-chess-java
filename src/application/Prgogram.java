package application;

import chess.ChessMatch;

public class Prgogram {

	public static void main(String[] args) {

		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getpieces());

	}
}
