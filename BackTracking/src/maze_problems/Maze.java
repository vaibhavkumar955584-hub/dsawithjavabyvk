package maze_problems;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Maze {
    public static void main(String[] args) {
        System.out.println(mazecount(3, 3));


    }

    static int mazecount(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int left = mazecount(r - 1, c);
        int right = mazecount(r, c - 1);
        return left + right;
    }

}
