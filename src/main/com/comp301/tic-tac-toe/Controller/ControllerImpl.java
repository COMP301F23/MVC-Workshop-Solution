package com.comp301.tic-tac-toe.controller;

import com.comp301.tic-tac-toe.model.Model;

public class ControllerImpl implements ClassicMvcController {
    private final Model model;

    public ControllerImpl(Model model) {
        if (model == null) {
            throw new IllegalArgumentException("Cannot instantiate ControllerImpl with null Model");
        }
        this.model = model;
    }

    @Override
    public void askButton() {
        model.ask();
    }
}