package com.comp301.tictactoe.View;

import com.comp301.tictactoe.Controller.ClassicMvcController;
import com.comp301.tictactoe.Model.Model;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class BoardView implements FXComponent {

    private Model model;
    private ClassicMvcController controller;

    public BoardView(Model model, ClassicMvcController controller) {
        if (model == null || controller == null) {
            throw new IllegalArgumentException("Model or controller cannot be null");
        }
        this.model = model;
        this.controller = controller;
    }

    public Button decide_label(Button b,int x,int y) {
        if (model.isX(x,y)){
            /* TODO: Make the '/mvc-workshopRedX.png' image appear on the button */
            Image image = null;
            ImageView imageView= null;
            imageView.setFitHeight(50);
            imageView.setFitWidth(50);
            b.setGraphic(imageView);
            return b;
        }
        if (model.isO(x,y)){
            /* TODO: Make the '/mvc-workshopGreenO.png' image appear on the button */
            Image image = null;
            ImageView imageView= null;
            imageView.setFitHeight(50);
            imageView.setFitWidth(50);
            b.setGraphic(imageView);
            return b;
        }
        return b;
    }

    @Override
    public Parent render() {
        GridPane pane = new GridPane();
        pane.setPrefHeight(500);
        pane.setPrefWidth(500);
        pane.getStyleClass().add("board");

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                Button button = new Button("");
                button.getStyleClass().add("tile");
                button.setPrefSize(300,300);
                button.setText("");
                int finalRow = row;
                int finalCol = col;
                /* TODO: Implement the logic for clicking a button on the game board
                *   Hint: This should update the button's location on the game board in the model to be the intended type (X or 0) and in the view */
                Button new_button= null;
                pane.add(new_button,row,col);
            }
        }


        return pane;
    }
}
