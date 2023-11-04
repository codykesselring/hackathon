<<<<<<< HEAD
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
=======
package hackathon;


import java.util.ArrayList;
import jdk.internal.net.http.common.Pair;

public class Snake {
    ArrayList<Pair<Integer, Integer>> occupiedSpaces; // coordinates occupied by the snake on the grid
    Pair<Integer, Integer> headIndex; // coordinates of the head of the snake on the grid
    char direction; // 'w' = up, 'a' = left, 's' = down, 'd' = right
    int length; // length of the snake

/*
                                                       METHODS:
*/

    public Snake() { // DVC initializing snake to 1 unit long, at (0,0) the top left corner of the grid, facing down
        occupiedSpaces = new ArrayList<Pair<Integer, Integer>>();
        headIndex = new Pair<Integer, Integer>(0, 0);
        occupiedSpaces.add(headIndex);
        direction = 'd';
        length = occupiedSpaces.size();
    }

    public Snake(Pair<Integer, Integer> headInput) { // EVC initializing snake to 1 unit at headInput, facing down
        occupiedSpaces = new ArrayList<Pair<Integer, Integer>>();
        headIndex = new Pair<Integer, Integer>(headInput.first, headInput.second);
        occupiedSpaces.add(headIndex);
        direction = 'd';
        length = occupiedSpaces.size();
    }

    public Snake(Pair<Integer, Integer> headInput, char directionInput) { // EVC initializing snake to 1 unit at headInput, facing directionInput
        occupiedSpaces = new ArrayList<Pair<Integer, Integer>>();
        headIndex = new Pair<Integer, Integer>(headInput.first, headInput.second);
        occupiedSpaces.add(headIndex);
        direction = directionInput;
        length = occupiedSpaces.size();
    }

    public Snake(Pair<Integer, Integer> headIndexInput, ArrayList<Pair<Integer, Integer>> occupiedSpacesInput, char directionInput) { // EVC initializing snake to occupiedSpacesInput size at headInput, facing directionInput
        occupiedSpaces = new ArrayList<Pair<Integer, Integer>>();
        headIndex = new Pair<Integer, Integer>(headIndexInput.first, headIndexInput.second);
        for (Pair <Integer, Integer> i : occupiedSpacesInput) {
            occupiedSpaces.add(new Pair<Integer, Integer>(i.first, i.second));
        }
        direction = directionInput;
        length = occupiedSpaces.size();
    }

    // Adds a new value to the front of the snake & sets head
    private void addToFront(Pair <Integer, Integer> gridIndex) {
        occupiedSpaces.add(gridIndex);
        headIndex = gridIndex;
        length = occupiedSpaces.size();
    }

    // Deletes the last value of the snake
    private void deleteFromEnd() {
        occupiedSpaces.remove(occupiedSpaces.size() - 1);
        length = occupiedSpaces.size();
    }

    // adds a new value to the front of the snake & sets head, deletes the last value of the snake
    public void moveTo(Pair <Integer, Integer> gridIndex) {
        addToFront(gridIndex);
        deleteFromEnd();
    }

    // adds a new value to the front of the snake & sets head, deletes the last value of the snake if apple is false
    public void moveTo(Pair <Integer, Integer> gridIndex, boolean apple) {
        addToFront(gridIndex);
        if (!apple)
            deleteFromEnd();
    }
}
>>>>>>> 3fa8b92be61897a60ec6b9d58594d1d0007d33fb
