package com.example.snake;

import com.example.snake.entities.Entity;

public class Model {
    public static World world = new World(10);
    private static final Entity player = new Snake();

    static {
        world.addEntity(player);
    }


}
