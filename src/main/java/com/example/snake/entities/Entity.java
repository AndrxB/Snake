package com.example.snake.entities;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;

public abstract class Entity implements IEntity {

    protected int[] location;

    public void draw(GraphicsContext gc) {
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(20);
        gc.beginPath();

        gc.moveTo(location[0], location[1]);

        gc.lineTo(location[0], location[1]);
        gc.stroke();
        gc.closePath();
    }
}
