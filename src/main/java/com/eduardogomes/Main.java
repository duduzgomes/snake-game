package com.eduardogomes;

import com.eduardogomes.models.SnakeGame;
import com.eduardogomes.ui.RenderGame;
import com.eduardogomes.ui.ScorePanel;

import java.awt.BorderLayout;
import javax.swing.JFrame;


public class Main {
    public static void main(String[] args) {
        SnakeGame game = new SnakeGame();

        JFrame window = new JFrame("Jogo da Cobrinha");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(600, 650);
        window.setResizable(false);
        window.setLayout(new BorderLayout());

        ScorePanel scorePanel = new ScorePanel(game);
        window.add(scorePanel, BorderLayout.NORTH);

        RenderGame gamePanel = new RenderGame(game ,scorePanel);
        window.add(gamePanel, BorderLayout.SOUTH);

        game.addGameListener(gamePanel);
        game.addGameListener(scorePanel);

        window.setVisible(true);
        window.pack();
    }
}

