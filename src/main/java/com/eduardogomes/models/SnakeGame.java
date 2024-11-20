package com.eduardogomes.models;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import com.eduardogomes.Utils;
import com.eduardogomes.ui.GameListener;

public class SnakeGame {

    public final static int WIDTH = 600;// Largura da tela do jogo
    public final static int HEIGHT = 600; // Altura da tela do jogo  
    public final static int TILE_SIZE = 30; // Tamanho de cada bloco da cobrinha e comida
    private Snake snakeOne;// Lista que representa a cobrinha
    private Food food; // Ponto que representa a comida
    private int score;
    private int bestScore;
    private boolean running = false; // Indica se o jogo está em execução
    private int delay = 100;

    private List<GameListener> gameListeners;


    public SnakeGame() {
        this.food = new Food();
        this.snakeOne = new Snake();
        this.score = 0;
        this.bestScore = 0;
        this.running = false;
        this.gameListeners = new ArrayList<>();
    }

    public void addGameListener(GameListener gameListener){
        gameListeners.add(gameListener);
    }

    public void removeGameListener(GameListener gameListener){
        gameListeners.remove(gameListener);
    }

    private void notifyGameStopped(){
        for( GameListener listener: gameListeners){
            listener.onGameStopped();
        }
    }

    private void notifyUpdateScore(int score){
        for( GameListener listener: gameListeners){
            listener.onUpdateScore();
        }
    }

    public void checkCollision(){
        if(snakeOne.getBody().size() > 1 && snakeOne.getBody().subList(1, snakeOne.getBody().size() -1).contains(snakeOne.getHead()) 
            || snakeOne.getHead().getX() < 0 
            || snakeOne.getHead().getX() >= WIDTH 
            || snakeOne.getHead().getY() < 0
            || snakeOne.getHead().getY() >= HEIGHT){
                this.running = false;
                notifyGameStopped();
                if(score > bestScore){
                    bestScore = score;
                }
        }

        if(snakeOne.getHead().equals(food.getFood())){
            spawnFood();
            this.score += 10;
            notifyUpdateScore(score);
            System.out.println("score:" + score);
        }else{
            snakeOne.removeTail();
        }
    }

    public void spawnFood(){
        Point newFood;
        do {
            newFood = Utils.randomPosition();
        } while (snakeOne.getBody().contains(newFood));

        food.addFood(newFood);

    }
        

    public void startGame(){
        spawnFood();
        snakeOne.reset();
        score = 0;
        running = true;
        notifyUpdateScore(score);
    }

    public void update(){
        snakeOne.move();
        checkCollision();
    }

    public Snake getSnakeOne(){
        return this.snakeOne;
    }

    public Food getFood() {
        return food;
    }

    public boolean isRunning() {
        return running;
    }

    public int getDelay(){
        return this.delay;
    }

    public int getScore(){
        return score;
    }
    public int getBestScore(){
        return bestScore;
    }
    
}