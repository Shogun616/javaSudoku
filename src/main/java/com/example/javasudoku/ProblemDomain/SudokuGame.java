package com.example.javasudoku.ProblemDomain;

import com.example.javasudoku.constants.GameState;

import java.io.Serializable;

public class SudokuGame implements Serializable {

    private final GameState gameState;
    private final int[][] gridState;

    public static final int GRID_BOUNDARY = 9;

    public SudokuGame(GameState gameState, int[][] gridState) {
        this.gameState = gameState;
        this.gridState = gridState;
    }

    public GameState getGameState() {
        return gameState;
    }

    public int[][] getCopyOFGridState() {
        return sudokuUtilities.copyToNewArray(gridState);
    }
}
