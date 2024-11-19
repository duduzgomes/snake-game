package com.eduardogomes.ui;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.Timer;

import com.eduardogomes.models.SnakeDirection;
import com.eduardogomes.models.SnakeGame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class RenderGame extends JPanel implements ActionListener, GameListener {
    SnakeGame game;
    Timer timer;
    ScreenGameOver screenGameOver;
    ScorePanel scorePanel;
    

    public RenderGame(SnakeGame game, ScorePanel scorePanel){
        super();
        this.game = game;
        this.scorePanel = scorePanel;
        this.screenGameOver = new ScreenGameOver();
        this.timer = new Timer(game.getDelay(), this);
        add(screenGameOver);

        setPreferredSize(new Dimension(SnakeGame.WIDTH, SnakeGame.HEIGHT));
        setBackground(new Color(33,33,33));
        setFocusable(true);
        setVisible(true);

        setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));

        addKeyListener(new KeyAdapter() { // Adiciona um ouvinte para eventos de teclado
            @Override
            public void keyPressed(KeyEvent e) { 
                switch (e.getKeyCode()) {
                    // tecla do player 1
                    case KeyEvent.VK_UP:
                        game.getSnakeOne().changeDirection(SnakeDirection.UP);
                        break;
                    case KeyEvent.VK_DOWN:
                        game.getSnakeOne().changeDirection(SnakeDirection.DOWN);
                        break;
                    case KeyEvent.VK_LEFT:
                        game.getSnakeOne().changeDirection(SnakeDirection.LEFT);
                        break;
                    case KeyEvent.VK_RIGHT:
                        game.getSnakeOne().changeDirection(SnakeDirection.RIGHT);
                        break;
                    case KeyEvent.VK_SPACE:
                        game.startGame();
                        screenGameOver.setVisible(false);
                        timer.start();
                        break;

                }
            }
        });

        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (game.isRunning()) { 
            game.update();
            repaint(); // Repaint o painel para atualizar a tela
        }else{
            timer.stop();
            screenGameOver.setVisible(true);
            
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Chama o método da superclasse para limpar o painel

        g.setColor(game.getSnakeOne().getColorBody());
        for( Point p : game.getSnakeOne().getBody()){
            g.fillRect(p.x, p.y, SnakeGame.TILE_SIZE, SnakeGame.TILE_SIZE);
        }

        g.setColor(game.getSnakeOne().getColorHead());
        g.fillRect(game.getSnakeOne().getHead().x, game.getSnakeOne().getHead().y, SnakeGame.TILE_SIZE, SnakeGame.TILE_SIZE);

        g.setColor(Color.RED);
        g.fillRect(game.getFood().getFood().x, game.getFood().getFood().y, SnakeGame.TILE_SIZE, SnakeGame.TILE_SIZE);
        
    }
}
