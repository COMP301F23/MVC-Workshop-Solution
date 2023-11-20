package com.comp301.tictactoe.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ModelImpl implements Model {
  private final List<ModelObserver> observers = null;
  private String[][] boardLocations;
  private String currentPlayer;
  private boolean gameOver;

  public ModelImpl() {
    /* TODO: initialize the model based on the class fields given
     *   Note: You can remove the values initialized above after doing this */

  }

  public void switch_player() {
    if (Objects.equals(currentPlayer, "X")) {
      currentPlayer = "O";
    } else {
      currentPlayer = "X";
    }
    /* TODO: What is missing from this method? */
  }

  public String getCurrentPlayer() {
    return currentPlayer;
  }

  public void make_board() {
      /* TODO Implement logic for creating a board for Tic-Tac-Toe */
  }

  public String[][] getBoardLocations() {
    return boardLocations;
  }

  public void addX(int x, int y) {
    /* TODO: Implement this method for adding an X to the gameboard */
  }

  public void addO(int x, int y) {
    /* TODO: Implement this method for adding an O to the gameboard */
  }

  public boolean isX(int x, int y) {
    /* TODO: Implement this method for checking if a location is an X on the game board */
      return false;
  }

  public boolean isO(int x, int y) {
      /* TODO: Implement this method for checking if a location is an O on the game board */
    return false;
  }

  public void checkGameOver(String player) {
    if ((Objects.equals(boardLocations[0][0], player)
            && Objects.equals(boardLocations[0][1], player)
            && Objects.equals(boardLocations[0][2], player))
        || (Objects.equals(boardLocations[1][0], player)
            && Objects.equals(boardLocations[1][1], player)
            && Objects.equals(boardLocations[1][2], player))
        || (Objects.equals(boardLocations[2][0], player)
            && Objects.equals(boardLocations[2][1], player)
            && Objects.equals(boardLocations[2][2], player))
        || (Objects.equals(boardLocations[0][0], player)
            && Objects.equals(boardLocations[1][0], player)
            && Objects.equals(boardLocations[2][0], player))
        || (Objects.equals(boardLocations[0][1], player)
            && Objects.equals(boardLocations[1][1], player)
            && Objects.equals(boardLocations[2][1], player))
        || (Objects.equals(boardLocations[0][2], player)
            && Objects.equals(boardLocations[1][2], player)
            && Objects.equals(boardLocations[2][2], player))
        || (Objects.equals(boardLocations[0][0], player)
            && Objects.equals(boardLocations[1][1], player)
            && Objects.equals(boardLocations[2][2], player))
        || (Objects.equals(boardLocations[2][0], player)
            && Objects.equals(boardLocations[1][1], player)
            && Objects.equals(boardLocations[0][2], player))) {
      currentPlayer = player;
      gameOver = true;
    }
    notifyObservers();
  }

  public boolean getGameOver() {
    return gameOver;
  }

  @Override
  public void addObserver(ModelObserver observer) {
    if (observer == null) {
      throw new IllegalArgumentException("Observer cannot be null");
    }
    observers.add(observer);
  }

  @Override
  public void removeObserver(ModelObserver observer) {
    observers.remove(observer);
  }

  private void notifyObservers() {
    /* TODO: You should be able to implement this method based off of your A8 Knowledge */
  }

}
