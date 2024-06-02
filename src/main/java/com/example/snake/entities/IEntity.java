package com.example.snake.entities;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;

public interface IEntity {
    Class<? extends IEntity> clazz = null;
    void setLocation(int x, int y);
    void draw(GraphicsContext gc);
    void draw(GraphicsContext gc, KeyCode state);
}
