package hackathon;

import java.util.ArrayList;


public class SnakeGame {
    public static void main(String[] args) {
        Board board = new Board();
        int x = 20;
        int[][] grid = new int[x][x];  
        board.initBoard(x);     
    }
}