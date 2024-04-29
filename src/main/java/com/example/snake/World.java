package com.example.snake;

import com.example.snake.entities.Entity;
import utility.HelperMethod;

import java.util.ArrayList;
import java.util.List;

public class World {
    private final int size;
    private final Entity[][] tiles;
    private final List<Entity> entityList;
    public World(int size){
        this.size = size;
        this.entityList = new ArrayList<>();
        this.tiles = new Entity[size][size];
    }

    public void addEntity(Entity entity){
        entityList.add(entity);
        Integer[] coordinate = HelperMethod.getRandomCoord();
        tiles[coordinate[0]][coordinate[1]] = entity;
    }

    public void removeEntity(Entity entity){
        entityList.remove(entity);
    }

    public List<? extends Entity> getEntities(Class<? extends Entity> clazz){
        List<Entity> newList = new ArrayList<>(entityList.size());
        for (Entity entity : entityList)
            if(entity.getClass() == clazz)
                newList.add(entity);
        return newList;
    }

    public List<Entity> getAllEntities(){
        return this.entityList;
    }

    public Snake getPlayer(){
        return (Snake) entityList.get(0);
    }

    public boolean isOccupied(int x, int y){
        return tiles[x][y] != null;
    }

    public int getSize(){
        return size;
    }
}
