package com.example.snake;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        View view = new View(primaryStage);
        new Controller(view);
    }

    public static void main(String[] args) {
        launch();
    }
}