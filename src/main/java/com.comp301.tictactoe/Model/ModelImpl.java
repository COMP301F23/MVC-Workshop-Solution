package com.comp301.tictactoe.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ModelImpl implements Model {
    private final List<ModelObserver> observers;
    private String[][] boardLocations;
    private String currentPlayer;
    private boolean gameOver;

    public ModelImpl() {
        boardLocations = new String[3][3];
        observers = new ArrayList<>();
        currentPlayer = "X";
        gameOver = false;
    }

    public void switch_player() {
        if (Objects.equals(currentPlayer, "X")) {
            currentPlayer = "O";
        } else {
            currentPlayer = "X";
        }
        notifyObservers();
    }

    public String getCurrentPlayer() {
        return currentPlayer;
    }


    public void make_board() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                boardLocations[i][j] = "";
            }
        }
        this.gameOver = false;
        this.currentPlayer = "X";
        notifyObservers();
    }

    public String[][] getBoardLocations() {
        return boardLocations;
    }

    public void addX(int x, int y) {
        if (x >= 3 || x < 0 || y >= 3 || y < 0) {
            throw new IndexOutOfBoundsException("Outside of the board");
        }
        if (isO(x,y) || isX(x,y)){
            throw new IllegalArgumentException("Position has already been claimed");
        }
        boardLocations[x][y] = "X";
        checkGameOver("X");
        if (gameOver) {
            return;
        }
        switch_player();
        notifyObservers();
    }

    public void addO(int x, int y) {
        if (x >= 3 || x < 0 || y >= 3 || y < 0) {
            throw new IndexOutOfBoundsException("Outside of the board");
        }
//        if (isO(x,y) || isX(x,y)){
//            throw new IllegalArgumentException("Position has already been claimed");
//        }
        boardLocations[x][y] = "O";
        checkGameOver("O");
        if (gameOver) {
            return;
        }
        switch_player();
        notifyObservers();
    }

    public boolean isX(int x, int y) {
        if (x >= 3 || x < 0 || y >= 3 || y < 0) {
            throw new IndexOutOfBoundsException("Outside of the board");
        }
        if (Objects.equals(boardLocations[x][y], "X")){
            return true;
        }
        return false;
    }

    public boolean isO(int x, int y) {
        if (x >= 3 || x < 0 || y >= 3 || y < 0) {
            throw new IndexOutOfBoundsException("Outside of the board");
        }
        if (Objects.equals(boardLocations[x][y], "O")){
            return true;
        }
        return false;
    }

    public void checkGameOver(String player) {
        if ((Objects.equals(boardLocations[0][0], player) && Objects.equals(boardLocations[0][1], player) && Objects.equals(boardLocations[0][2], player))
            || (Objects.equals(boardLocations[1][0], player) && Objects.equals(boardLocations[1][1], player) && Objects.equals(boardLocations[1][2], player))
            || (Objects.equals(boardLocations[2][0], player) && Objects.equals(boardLocations[2][1], player) && Objects.equals(boardLocations[2][2], player))
            || (Objects.equals(boardLocations[0][0], player) && Objects.equals(boardLocations[1][0], player) && Objects.equals(boardLocations[2][0], player))
            || (Objects.equals(boardLocations[0][1], player) && Objects.equals(boardLocations[1][1], player) && Objects.equals(boardLocations[2][1], player))
            || (Objects.equals(boardLocations[0][2], player) && Objects.equals(boardLocations[1][2], player) && Objects.equals(boardLocations[2][2], player))
            || (Objects.equals(boardLocations[0][0], player) && Objects.equals(boardLocations[1][1], player) && Objects.equals(boardLocations[2][2], player))
            || (Objects.equals(boardLocations[2][0], player) && Objects.equals(boardLocations[1][1], player) && Objects.equals(boardLocations[0][2], player)))
            {
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
        for (ModelObserver observer : observers) {
            observer.update(this);
                }
        }
    }
