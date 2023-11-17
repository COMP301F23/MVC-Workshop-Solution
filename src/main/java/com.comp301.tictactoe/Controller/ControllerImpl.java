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
        if (Objects.equals(model.getCurrentPlayer(), "X")) {
            System.out.println("Hi");
            model.addX(x,y);
            return;
        }
        if (Objects.equals(model.getCurrentPlayer(), "O")) {
            model.addO(x,y);
            System.out.println("Hello");
            return;
        }
    }

    public boolean getGameOver() {
        return model.getGameOver();
    }

}
