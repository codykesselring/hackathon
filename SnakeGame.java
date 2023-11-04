package hackathon;

import java.util.ArrayList;
import javax.swing.Timer;


public class SnakeGame {
    public static void main(String[] args) {
        Board board = new Board();
        //Timer timer = new Timer(80, );
        int startingX = 5, startingY = 5;
        int x = 20;
        int[][] grid = new int[x][x];  
        board.initBoard(x, startingX, startingY, grid);
        grid[startingX+1][startingY] = 1
        board.updateBoard(grid)
    }
}