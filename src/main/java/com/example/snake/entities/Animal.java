package com.example.snake.entities;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;

public abstract class Animal extends Entity {
    Image image;
    KeyCode state;

    public Animal(Image image){
        this.state = KeyCode.UP;
        this.image = image;
    }

    public void setState(KeyCode newState){
        this.state = newState;
    }
    public void setLocation(int x, int y){
        this.location[0] = x;
        this.location[1] = y;
    }

    public KeyCode getState(){
        return this.state;
    }

    public void eat(){

    }
    public void draw(GraphicsContext gc, KeyCode state) {
        int space = 20;
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(1);
        gc.beginPath();

        gc.moveTo(location[0], location[1]);


        switch (state) {
            case UP -> location[1] -= space;
            case DOWN -> location[1] += space;
            case RIGHT -> location[0] += space;
            case LEFT -> location[0] -= space;
        }

        gc.lineTo(location[0], location[1]);
        gc.stroke();
        gc.closePath();
    }
}
