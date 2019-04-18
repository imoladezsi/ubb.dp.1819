package ro.ubb.dezsi.imola.lab3.exercises.pieces;

import ro.ubb.dezsi.imola.lab3.exercises.mediator.BoardMediator;

public class Horse extends ChessPiece {
    public Horse(int vertPos, int horizPos, boolean isAlive, ChessPieceColor color, BoardMediator med) {
        super(new Position(vertPos, horizPos), isAlive, color, med);
    }
}
