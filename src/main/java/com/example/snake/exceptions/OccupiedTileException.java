package com.example.snake.exceptions;

import com.example.snake.entities.IEntity;

public class OccupiedTileException extends RuntimeException{
    IEntity entity;
    Integer[] coordinate;
    public OccupiedTileException(IEntity entity, int x, int y){
        super("Trying to access occupied tile");
        this.entity = entity;
        this.coordinate = new Integer[]{x,y};
    }

    public Integer[] getCoordinate(){
        return this.coordinate;
    }

    public IEntity getEntity(){
        return this.entity;
    }

}
