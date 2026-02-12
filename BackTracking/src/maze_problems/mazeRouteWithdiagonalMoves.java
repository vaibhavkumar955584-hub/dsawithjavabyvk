package maze_problems;

import java.util.ArrayList;

public class mazeRouteWithdiagonalMoves {
    public static void main(String[] args) {

    }
    //D-> Down, R->Right, d->Diagonal;
    static ArrayList<String> mazeRouteWithDiagonal(String p, int r, int c){
        if(r==1&&c==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String>ans=new ArrayList<>();

        if(r>1){
            ans.addAll(mazeRouteWithDiagonal(p+'D',r-1,c));
        }
        if(r>1&&c>1){
            ans.addAll(mazeRouteWithDiagonal(p+'d',r-1,c-1));
        }
        if(c>1){
            ans.addAll(mazeRouteWithDiagonal(p+'R',r,c-1));
        }

        return ans;
    }
}
