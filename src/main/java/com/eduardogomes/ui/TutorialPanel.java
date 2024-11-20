package com.eduardogomes.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.eduardogomes.models.SnakeGame;

public class TutorialPanel extends JPanel{
    private JLabel titleLabel;
    private JLabel rulesLabel;
    private JLabel textLabel;
    private JLabel imgLabel;
    

    public TutorialPanel(){
        setPreferredSize(new Dimension(SnakeGame.WIDTH, SnakeGame.HEIGHT));
        setBackground(new Color(33,33,33));
        setLayout(new GridBagLayout()); // Centralizar os componentes
        setVisible(true);

        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/setas.png"));
     
        
        titleLabel = new JLabel("Sobre o jogo:");
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Comic Sans MS", Font.CENTER_BASELINE, 28));

        rulesLabel = new JLabel(
            "<html>Score indica a pontução da rodada<br>Record indica a melhor pontuação dentre as rodadas</html>"
            );
            rulesLabel.setForeground(Color.WHITE);
            rulesLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));

        textLabel = new JLabel(
            "<html>Use as setas para mover<br><br>Pressione ESPAÇO para iniciar</html>"
            );
        textLabel.setForeground(Color.WHITE);
        textLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));

        imgLabel = new JLabel(imageIcon);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0; // Posição horizontal (coluna)
        gbc.gridy = 0; // Posição vertical (linha)
        gbc.gridwidth = 2; // O título ocupa 2 colunas
        gbc.anchor = GridBagConstraints.CENTER; // Centraliza o componente na célula
        gbc.insets = new Insets(10, 10, 10, 20); // Espaçamento entre a imagem e o texto
        add(titleLabel, gbc);

        gbc.gridx = 0; 
        gbc.gridy = 1; 
        gbc.gridwidth = 2; 
        gbc.anchor = GridBagConstraints.WEST; 
        gbc.insets = new Insets(10, 10, 10, 20); // Espaçamento entre a imagem e o texto
        add(rulesLabel, gbc);

        gbc.gridx = 1; 
        gbc.gridy = 2; 
        gbc.gridwidth = 1; 
        gbc.anchor = GridBagConstraints.EAST; 
        gbc.insets = new Insets(10, 10, 10, 20); // Espaçamento entre a imagem e o texto
        add(textLabel, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 2; 
        gbc.gridwidth = 1; 
        gbc.anchor = GridBagConstraints.WEST; 
        gbc.insets = new Insets(10, 10, 10, 20); // Espaçamento entre a imagem e o texto
        add(imgLabel, gbc);

    }

}
