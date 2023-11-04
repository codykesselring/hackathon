package hackathon;

import java.util.ArrayList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Board extends JPanel{

    public JPanel[][] cells = new JPanel[20][20];  
    
    public void initBoard(int x, int posX, int posY, int[][] gameArray){
        JFrame frame = new JFrame("Snake Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
        JPanel panel = new JPanel();
        panel.setBackground(Color.green);
        panel.setLayout(new GridLayout(x, x));

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                JPanel cell = new JPanel();
                cell.setPreferredSize(new Dimension(20, 20));
                cell.setBorder(BorderFactory.createLineBorder(Color.black));
                panel.add(cell);
                gameArray[i][j] = 0; // 0 = empty cell
                cells[i][j] = cell; 

                if (i == posY && j == posX) { 
                    cell.setBackground(Color.GREEN);

                    gameArray[i][j] = 1; // 1 = filled space
                } else if (j % 2 == 1) {
                    cell.setBackground(Color.LIGHT_GRAY);
                }
            }
        }


        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public void updateBoard(int[][] gameArray) {
        for (int i = 0; i < gameArray.length; i++) {
            for (int j = 0; j < gameArray.length; j++) {
                if (gameArray[i][j] == 1) {
                    cells[i][j].setBackground(Color.GREEN);
                } else {
                    cells[i][j].setBackground(Color.Light_GRAY);
                }
            }
        }
    }

}
