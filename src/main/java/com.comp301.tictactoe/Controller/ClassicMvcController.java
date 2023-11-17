package com.comp301.tictactoe.Controller;

public interface ClassicMvcController {
    /** Handles the user clicking on a cell */
     void clickCell(int x, int y);

     /** Gets the state of the game from model */
     boolean getGameOver();
}
