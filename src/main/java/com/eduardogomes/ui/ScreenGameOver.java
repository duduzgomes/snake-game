package com.eduardogomes.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ScreenGameOver extends JPanel {
    JFrame root;
    private JLabel gameOverLabel;
    private JLabel restartLabel;
    

    public ScreenGameOver(){
        super();
        setPreferredSize(new Dimension(600, 600));
        setBackground(new Color(0, 0, 0, 200)); // Fundo preto com transparência
        setLayout(new GridBagLayout()); // Centralizar os componentes
        setVisible(false);
     
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 0, 10, 0);
        gbc.gridx = 0; // Posição na coluna
        gbc.gridy = GridBagConstraints.RELATIVE; 
        gbc.anchor = GridBagConstraints.CENTER; 

        gameOverLabel = new JLabel("Game Over!");
        gameOverLabel.setForeground(Color.WHITE);
        gameOverLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 40));

        restartLabel = new JLabel("Pressione espaço para reiniciar!");
        restartLabel.setForeground(Color.WHITE);
        restartLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

        this.add(gameOverLabel, gbc);
        this.add(restartLabel, gbc);
    }

}
