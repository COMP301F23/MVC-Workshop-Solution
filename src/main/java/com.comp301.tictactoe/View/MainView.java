package com.comp301.tictactoe.View;

import com.comp301.tictactoe.Controller.ClassicMvcController;
import com.comp301.tictactoe.Model.Model;
import com.comp301.tictactoe.Model.ModelObserver;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;


public class MainView implements FXComponent, ModelObserver {
    private final Scene scene;
    private final FXComponent boardview;
    private final TitleView titleView;
    private final Model model;
    private ClassicMvcController controller;

    public MainView(Model model, ClassicMvcController controller) {
        this.boardview = new BoardView(model,controller);
        this.titleView = new TitleView(model,controller);
        this.model = model;
        this.controller = controller;
        this.model.addObserver(this);
        this.scene = new Scene(render());
        this.model.make_board();
        this.scene.getStylesheets().add("main.css");
    }

    public Scene getScene() {
        return scene;
    }

    @Override
    public Parent render() {
        BorderPane pane = new BorderPane();
        pane.setTop(titleView.render());
        pane.setBottom(boardview.render());
        return pane;
    }

    // Everytime our update method is called our view will render!
    @Override
    public void update(Model model) {
        scene.setRoot(render());
    }
}