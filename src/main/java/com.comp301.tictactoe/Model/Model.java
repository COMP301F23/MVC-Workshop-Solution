package com.comp301.tictactoe.Model;

public interface Model {

    /** Gets the current player */
    String getCurrentPlayer();

    /** Reset's the board/game */
    void make_board();

    /** Gets the board */
    String[][] getBoardLocations();

    /** Switches the player */
    void switch_player();

    /** Checks the position to see if X */
    boolean isX(int x, int y);

    /** Checks the position to see if O */
    boolean isO(int x, int y);

    /** Adds an "X" to the board */
    void addX(int x, int y);

    /** Adds a "O" from the board */
    void addO(int x, int y);

    /** Checks every possible way for a player to win */
    void checkGameOver(String player);

    /** Adds an observer to the model */
    void addObserver(ModelObserver observer);

    /** Gets the state of the game */
    boolean getGameOver();

    /**
     * Removes an observer from the model... won't be using this for this project but good to
     * implement it as practice!
     */
    void removeObserver(ModelObserver observer);
}
