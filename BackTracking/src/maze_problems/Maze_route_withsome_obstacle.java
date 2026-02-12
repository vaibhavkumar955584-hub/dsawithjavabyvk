package maze_problems;

import java.util.ArrayList;

public class Maze_route_withsome_obstacle {
    public static void main(String[] args) {
        boolean[][]maze={
               {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        System.out.println(mazeRouteWithObstacal("",maze,0,0));
    }

    static ArrayList<String> mazeRouteWithObstacal(String p, boolean[][]maze, int r, int c){    //we have to put the intial position of cell from where we start like 0,0.
        if(r==maze.length-1&&c==maze[0].length-1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String>ans=new ArrayList<>();
        if(!maze[r][c]){
            return new ArrayList<>();
        }
        if(r<maze.length-1){
            ans.addAll(mazeRouteWithObstacal(p+'D',maze,r+1,c));
        }

        if(c<maze[0].length-1){
            ans.addAll(mazeRouteWithObstacal(p+'R',maze,r,c+1));
        }

        return ans;
    }
}
