package com.comp301.tictactoe.Controller;

import com.comp301.tictactoe.Model.Model;

import java.util.Objects;

public class ControllerImpl implements ClassicMvcController{

    private final Model model;

    public ControllerImpl(Model model) {
        if (model == null) {
            throw new IllegalArgumentException("Model cannot be null");
        }
        this.model = model;
    }

    public void clickCell(int x,int y) {
        /* TODO: Implement logic for clicking a cell using Model's methods */
    }

    public boolean getGameOver() {
        return model.getGameOver();
    }

}
