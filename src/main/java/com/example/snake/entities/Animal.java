package com.example.snake.entities;

import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;

public abstract class Animal implements Entity {
    Image image;
    KeyCode state;

    public Animal(Image image){
        this.state = KeyCode.UP;
    }

    public void setState(KeyCode newState){
        this.state = newState;
    }

    public KeyCode getState(){
        return this.state;
    }

    public void eat(){

    }

}
