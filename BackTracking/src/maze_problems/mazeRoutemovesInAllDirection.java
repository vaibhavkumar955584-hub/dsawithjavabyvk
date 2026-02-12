package maze_problems;

import java.util.ArrayList;
//included Backtracking
/*
- You move forward (make a choice).
- If you hit a dead end, you go back (undo the choice).
- Then you try a different direction

 */
public class mazeRoutemovesInAllDirection {
    public static void main(String[] args) {
        boolean[][]maze={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };

        System.out.println(mazeRouteWithAllDirection("",maze,0,0));
    }
    static ArrayList<String> mazeRouteWithAllDirection(String p, boolean[][]maze, int r, int c){    //we have to put the intial position of cell from where we start.
        if(r==maze.length-1&&c==maze[0].length-1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String>ans=new ArrayList<>();
        if(!maze[r][c]){
            return new ArrayList<>();
        }
        //marked the visited as false
        maze[r][c]=false;
        //moves in Down direction
        if(r<maze.length-1){
            ans.addAll(mazeRouteWithAllDirection(p+'D',maze,r+1,c));
        }
        //moves in right direction
        if(c<maze[0].length-1){
            ans.addAll(mazeRouteWithAllDirection(p+'R',maze,r,c+1));
        }
        //moves in up diection
        if(r>0){
            ans.addAll(mazeRouteWithAllDirection(p+'U',maze,r-1,c));
        }
        //moves in left direction
        if(c>0){
            ans.addAll(mazeRouteWithAllDirection(p+'L',maze,r,c-1));
        }
        // unmarked the visited
        maze[r][c] = true;

        return ans;
    }

}
