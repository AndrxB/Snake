package com.example.snake;

import com.example.snake.entities.IEntity;
import com.example.snake.entities.Snake;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;

import java.util.ArrayList;
import java.util.List;

public class World {
    public final List<IEntity> entityList;
    public World(IEntity player){
        this.entityList = new ArrayList<>();
        addEntity(player);
    }

    public void addEntity(IEntity entity){
        if(entityList.isEmpty()){
            entityList.add(entity);
            entity.setLocation(1000/2, 600/2);
        }
    }

    public void removeEntity(IEntity entity){
        entityList.remove(entity);
    }

    public List<? extends IEntity> getEntities(Class<? extends IEntity> clazz){
        List<IEntity> newList = new ArrayList<>(entityList.size());
        for (IEntity entity : entityList)
            if(entity.getClass() == clazz)
                newList.add(entity);
        return newList;
    }

    public List<IEntity> getAllEntities(){
        return this.entityList;
    }

    public Snake getPlayer(){
        return (Snake) entityList.get(0);
    }

    public void run(GraphicsContext gc){
        entityList.forEach(entity->{
            entity.draw(gc);
        });
    }

    public void run(GraphicsContext gc, KeyCode state){
        entityList.forEach(entity->{
            entity.draw(gc, state);
        });
    }
}
