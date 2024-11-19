package com.eduardogomes.models;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import com.eduardogomes.Utils;

public class Snake {
    private List<Point> body;
    private Point head;
    private SnakeDirection direction;
    private Color colorBody;
    private Color colorHead;


    public Snake() {
        this.body = new ArrayList<>();
        this.head = Utils.randomPosition();
        this.body.add(head);
        this.direction = SnakeDirection.NONE;
        this.colorHead = Utils.colorRGB();
        this.colorBody = new Color(colorHead.getRed(), colorHead.getGreen(), colorHead.getBlue(), 200);
     
    }

    public void move(){
        Point newHeadSnakeOne = new Point(head);

        switch (direction) {
            case NONE -> {
                break;
            }
            case UP -> {
                newHeadSnakeOne.y -= SnakeGame.TILE_SIZE; // Move para cima
                break;
            }
            case DOWN -> {
                newHeadSnakeOne.y += SnakeGame.TILE_SIZE; // Move para baixo
                break;
            }
            case LEFT -> {
                newHeadSnakeOne.x -= SnakeGame.TILE_SIZE; // Move para a esquerda
                break;
            }
            case RIGHT -> {
                newHeadSnakeOne.x += SnakeGame.TILE_SIZE; // Move para a direita
                break;
            }
        }
        body.add(newHeadSnakeOne);// Adiciona a nova cabeça ao final da lista
        head = newHeadSnakeOne;
    }

    public void changeDirection(SnakeDirection direction){
        if(this.direction == SnakeDirection.UP && direction == SnakeDirection.DOWN ) return;
        else if(this.direction == SnakeDirection.DOWN && direction == SnakeDirection.UP ) return;
        else if(this.direction == SnakeDirection.RIGHT && direction == SnakeDirection.LEFT ) return;
        else if(this.direction == SnakeDirection.LEFT && direction == SnakeDirection.RIGHT ) return;
        else this.direction = direction;
    }

    public void removeTail(){
        body.remove(0);
    }

    public void clear(){
        body.clear();
    }

    public void reset(){
        direction = SnakeDirection.NONE;
        body.clear();
        head = Utils.randomPosition();
        body.add(head);
    }

    public Point getHead(){
        return head;
    }

    public Color getColorHead(){
        return colorHead;
    }

    public Color getColorBody(){
        return colorBody;
    }

    public List<Point> getBody() {
        return body;
    }

    
}
