package com.eduardogomes.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.eduardogomes.models.SnakeGame;

public class ScorePanel extends JPanel implements GameListener {
    private SnakeGame game;
    private JLabel scoreLabel;
    private JLabel bestScoreLabel;
    

    public ScorePanel(SnakeGame game){
        this.game = game;
        setPreferredSize(new Dimension(600, 50));
        setBackground(new Color(0, 0, 0, 255)); // Fundo preto com transparência
        setLayout(new BorderLayout()); // Centralizar os componentes
        setVisible(true);
        setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 20));
     
        
        scoreLabel = new JLabel(String.format("Score: %d", game.getScore()));
        scoreLabel.setForeground(Color.WHITE);
        scoreLabel.setFont(new Font("Comic Sans", Font.BOLD, 20));

        bestScoreLabel = new JLabel(String.format("Record: %d", game.getBestScore()));
        bestScoreLabel.setForeground(Color.WHITE);
        bestScoreLabel.setFont(new Font("Comic Sans", Font.BOLD, 20));

        add(scoreLabel, BorderLayout.LINE_START);
        add(bestScoreLabel, BorderLayout.LINE_END);

    }

    @Override
    public void onUpdateScore() {
        scoreLabel.setText(String.format("Score: %d", game.getScore()));
        bestScoreLabel.setText(String.format("Record: %d", game.getBestScore()));
        scoreLabel.repaint();
    }

}
