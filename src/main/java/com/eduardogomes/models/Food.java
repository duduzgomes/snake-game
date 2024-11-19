package com.eduardogomes.models;

import java.awt.Point;

import com.eduardogomes.Utils;

public class Food {
    private Point food;

    public Food(){
        this.food = Utils.randomPosition();
    }

    public void spawnFood(){
        this.food = Utils.randomPosition();
    }

    public Point getFood(){
        return food;
    }
    
}
