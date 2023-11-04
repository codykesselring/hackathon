package hackathon;

import java.util.ArrayList;


public class SnakeGame {
    public static void main(String[] args) {
        Board board = new Board();
        int startingX = 5, startingY = 5;
        int x = 20;
        int[][] grid = new int[x][x];  
        board.initBoard(x, startingX, startingY, grid);     
    }
}