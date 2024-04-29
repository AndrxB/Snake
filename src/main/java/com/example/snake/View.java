package com.example.snake;

import com.example.snake.entities.Entity;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.transform.Affine;
import javafx.stage.Stage;

public class View {
    public Canvas canvas = new Canvas(1000, 600);
    GraphicsContext gc = canvas.getGraphicsContext2D();
    Affine trans = new Affine();
    Stage primaryStage;

    public View(Stage primaryStage) {
        this.primaryStage = primaryStage;

        primaryStage.setTitle("Snake game");
        StackPane stackpane = new StackPane();
        stackpane.getChildren().addAll(canvas);

        gc.setFill(Color.LIGHTBLUE);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
        gc.setTransform(trans);

        Scene scene = new Scene(stackpane);
        primaryStage.setScene(scene);
        primaryStage.show();

        draw(gc);
    }

    public void draw(GraphicsContext gc){
//        for (Entity entity : Model.world.getAllEntities()) {
//            entity.draw();
//        }
    }

    public void redraw(){
        gc.setTransform(new Affine());
        gc.setFill(Color.LIGHTBLUE);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
        gc.setTransform(trans);
    }
}
