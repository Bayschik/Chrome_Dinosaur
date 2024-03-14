package org.example;

import components.Dino;
import components.GamePanel;
import components.Ground;

import javax.swing.*;
import java.awt.*;

public class Main {

    JFrame mainWindows = new JFrame("My game");
    public static int width = 800;
    public static int height = 500;
    public void createAndShow() {
        mainWindows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = mainWindows.getContentPane();

        GamePanel gamePanel = new GamePanel(width, height);
        gamePanel.addKeyListener(gamePanel);
        gamePanel.setFocusable(true);

        container.setLayout(new BorderLayout());

        container.add(gamePanel, BorderLayout.CENTER);

        mainWindows.setSize(width, height);
        mainWindows.setResizable(false);
        mainWindows.setVisible(true);

        Dino rex = new Dino();
        rex.setJumpFactor(20);
        Ground ground = new Ground(height);

        gamePanel.setObstacleIntervalAndSpeed(300, 7);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main().createAndShow());
    }
}


