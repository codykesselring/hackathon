package hackathon;

import java.util.ArrayList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Board {

    public void initBoard(int x){
        JFrame frame = new JFrame("Snake Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
        JPanel panel = new JPanel();
        panel.setBackground(Color.green);
        panel.setLayout(new GridLayout(x, x));

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                JPanel cell = new JPanel();
                cell.setPreferredSize(new Dimension(x, x));
                cell.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
                panel.add(cell);
                cell.setBackground(Color.green);
            }
        }

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

}
