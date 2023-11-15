package com.comp301.tictactoe.View;

import com.comp301.tictactoe.Controller.ClassicMvcController;
import com.comp301.tictactoe.Controller.ControllerImpl;
import com.comp301.tictactoe.Model.Model;
import com.comp301.tictactoe.Model.ModelImpl;
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
        stage.setTitle("Tic-Tac-Toe");
        stage.show();
    }
}
