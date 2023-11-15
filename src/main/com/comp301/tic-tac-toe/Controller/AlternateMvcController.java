package com.comp301.tic-tac-toe.controller;

import com.comp301.tic-tac-toe.model.ModelObserver;

public interface AlternateMvcController {
    /** Handles the click action to go ask loves me or loves me not */
    void askButton();

    /** Getter method for boolean */
    void getLoves();

    /** Returns count of times asked */
    int getCount();

    /** Adds an observer to the controller */
    void addObserver(ModelObserver observer);

    /** Removes an observer from the controller */
    void removeObserver(ModelObserver observer);
}