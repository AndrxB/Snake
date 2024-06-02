package com.example.snake.entities;

import com.example.snake.Location;
import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import utility.HelperMethod;

import java.io.File;

public class Snake extends Animal {
    public Snake(){
        super(HelperMethod.getImage("snake.png"));
        this.location = new int[2];
    }
}
