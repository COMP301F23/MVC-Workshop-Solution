package com.comp301.tictactoe.Controller;

public interface ClassicMvcController {
    /** Handles the user clicking on a cell
     * If the cell is an X, add an X to the board.
     * If the cell is an O, add an O to the board. */
     void clickCell(int x, int y);

     /** Gets the state of the game from model */
     boolean getGameOver();
}
