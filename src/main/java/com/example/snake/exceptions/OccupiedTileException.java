package com.example.snake.exceptions;

import com.example.snake.entities.Entity;

public class OccupiedTileException extends RuntimeException{
    Entity entity;
    Integer[] coordinate;
    public OccupiedTileException(Entity entity, int x, int y){
        super("Trying to access tile");
        this.entity = entity;
        this.coordinate = new Integer[]{x,y};
    }

    public Integer[] getCoordinate(){
        return this.coordinate;
    }

    public Entity getEntity(){
        return this.entity;
    }

}
