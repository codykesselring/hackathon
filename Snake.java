package hackathon;


import java.util.ArrayList;
import jdk.internal.net.http.common.Pair;

public class Snake {
    ArrayList<Pair<Integer, Integer>> occupiedSpaces; // coordinates occupied by the snake on the grid
    Pair<Integer, Integer> headIndex; // coordinates of the head of the snake on the grid
    char direction; // 'w' = up, 'a' = left, 's' = down, 'd' = right
    int length; // length of the snake

    public Snake() { // DVC initializing snake to 1 unit long, at (0,0) the top left corner of the grid, facing down
        occupiedSpaces = new ArrayList<Pair<Integer, Integer>>();
        headIndex = new Pair<Integer, Integer>(0, 0);
        occupiedSpaces.add(headIndex);
        direction = 'd';
        length = occupiedSpaces.size();
    }
    public Snake(Pair<Integer, Integer> headInput) {
        occupiedSpaces = new ArrayList<Pair<Integer, Integer>>();
        headIndex = new Pair<Integer, Integer>(headInput.first, headInput.second);

    }

}
