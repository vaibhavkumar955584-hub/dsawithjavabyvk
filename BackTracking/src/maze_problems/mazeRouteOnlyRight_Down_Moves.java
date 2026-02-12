package maze_problems;

import java.util.ArrayList;

public class mazeRouteOnlyRight_Down_Moves {
    public static void main(String[] args) {
        System.out.println(mazeRoute("",3,3));
        /*array is like:(3,3) (3,2) (3,1)
                        (2,3) (2,2) (2,1)
                        (1,3) (1,2) (1,1)
        */
    }
    static ArrayList<String> mazeRoute(String p, int r, int c){
        if(r==1&&c==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String>ans=new ArrayList<>();

        if(r>1){
            ans.addAll(mazeRoute(p+'D',r-1,c));
        }
        if(c>1){
            ans.addAll(mazeRoute(p+'R',r,c-1));
        }

        return ans;
    }
}
