package com.eduardogomes;

import java.awt.Color;
import java.awt.Point;
import java.util.Random;

import com.eduardogomes.models.SnakeGame;

public class Utils {
    static final Random random = new Random();

    public static Point randomPosition(){
        int x = random.nextInt(SnakeGame.WIDTH / SnakeGame.TILE_SIZE) * SnakeGame.TILE_SIZE;
        int y = random.nextInt(SnakeGame.HEIGHT / SnakeGame.TILE_SIZE) * SnakeGame.TILE_SIZE;
        return new Point(x, y);
    }

    public static Color colorRGB(){
        int r = random.nextInt(255);
        int g = random.nextInt(255);
        int b = random.nextInt(255);
        return new Color(r, g, b);
    }
}
