package com.example.snake.entities;

public interface Entity {
    Class<? extends Entity> getClass = null;
    void draw();
}
