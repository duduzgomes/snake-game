package com.eduardogomes.models;

import java.awt.Point;

import com.eduardogomes.Utils;

public class Food {
    private Point food;

    public Food(){
        this.food = Utils.randomPosition();
    }

    public void addFood(Point food){
        this.food = food;
    }

    public Point getFood(){
        return food;
    }
    
}
