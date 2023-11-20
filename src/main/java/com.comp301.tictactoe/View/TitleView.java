package com.comp301.tictactoe.View;

import com.comp301.tictactoe.Controller.ClassicMvcController;
import com.comp301.tictactoe.Model.Model;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;



public class TitleView implements FXComponent{

    private Model model;
    private ClassicMvcController controller;

    public TitleView(Model model, ClassicMvcController controller) {
        if (model == null || controller == null) {
            throw new IllegalArgumentException("Model or controller cannot be null");
        }
        this.model = model;
        this.controller = controller;
    }


    @Override
    public Parent render() {
        VBox pane = new VBox();
        pane.setPrefHeight(100);
        pane.setPrefWidth(500);
        pane.getChildren().clear();
        pane.getStyleClass().add("vbox");
        pane.setAlignment(Pos.CENTER);

        Label title = new Label("Welcome to Tic-Tac-Toe!");
        title.getStyleClass().add("title");
        title.setWrapText(true);
        pane.getChildren().add(title);

        HBox pane2 = new HBox();

        String player = model.getCurrentPlayer();
        Label display_current_player = new Label("Current Turn: " + player);
        display_current_player.getStyleClass().add("current-player");
        display_current_player.setAlignment(Pos.BOTTOM_CENTER);
        display_current_player.setWrapText(true);
        pane2.getChildren().add(display_current_player);

        pane.getChildren().add(pane2);

        /* TODO: Implement a reset button */


        /* TODO: Implement a message that appears if the game is over
        *   and displays the winner (X or O) of the game */


        return pane;
    }
}
