package com.comp301.tic-tac-toe.view;

import com.comp301.tic-tac-toe.controller.ClassicMvcController;
import com.comp301.tic-tac-toe.controller.ControllerImpl;
import com.comp301.tic-tac-toe.model.Model;
import com.comp301.tic-tac-toe.model.ModelImpl;
import javafx.application.Application;
import javafx.stage.Stage;

public class AppLauncher extends Application {
    @Override
    public void start(Stage stage) {
        // TODO: Create your Model, View, and Controller instances and launch your GUI
        Model model = new ModelImpl();
        ClassicMvcController controller = new ControllerImpl(model);
        MainView view = new MainView(model, controller);

        stage.setScene(view.getScene());
        stage.setTitle("Does Rameses Love Me?");
        stage.show();
    }
}