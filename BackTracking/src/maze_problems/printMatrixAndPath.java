package maze_problems;

import java.util.ArrayList;
import java.util.Arrays;

public class printMatrixAndPath {
    public static void main(String[] args) {
        boolean[][]maze={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int [][]path=new int[maze.length][maze[0].length];
        mazeRouteWithAllDirection("",maze,0,0,path,1);
        //System.out.println(mazeRouteWithAllDirection("",maze,0,0,path,1));
    }
    static ArrayList<String> mazeRouteWithAllDirection(String p, boolean[][]maze, int r, int c ,int [][]path,int step){    //we have to put the intial position of cell from where we start.
        if(r==maze.length-1&&c==maze[0].length-1){
            ArrayList<String> list=new ArrayList<>();
            path[r][c]=step;
            for (int []arr:path){
                System.out.println(Arrays.toString(arr));

            }
            System.out.println(p);
            path[r][c]=0;
            System.out.println();list.add(p);

            return list;
        }
        ArrayList<String>ans=new ArrayList<>();
        if(!maze[r][c]){
            return new ArrayList<>();
        }
        //marked the visited as false
        maze[r][c]=false;
        path[r][c]=step;
        //moves in Down direction
        if(r<maze.length-1){
            ans.addAll(mazeRouteWithAllDirection(p+'D',maze,r+1,c,path,step+1));
        }
        //moves in right direction
        if(c<maze[0].length-1){
            ans.addAll(mazeRouteWithAllDirection(p+'R',maze,r,c+1 ,path,step+1));
        }
        //moves in up diection
        if(r>0){
            ans.addAll(mazeRouteWithAllDirection(p+'U',maze,r-1,c,path,step+1));
        }
        //moves in left direction
        if(c>0){
            ans.addAll(mazeRouteWithAllDirection(p+'L',maze,r,c-1,path,step+1));
        }
        // unmarked the visited
        maze[r][c] = true;
        path[r][c]=0;

        return ans;
    }
}
