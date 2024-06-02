package com.example.snake;

import javafx.application.Application;
import javafx.stage.Stage;
import utility.HelperMethod;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        new Model();
        View view = new View(primaryStage, Model.world);
        new Controller(view, Model.world);
    }

    public static void main(String[] args) {
        launch();
    }
}