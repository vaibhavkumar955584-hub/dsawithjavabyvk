import java.util.ArrayList;

public class Dice_problem {
    public static void main(String[] args) {
        dice("",6);
        System.out.println(dicearr("",6));
        System.out.println("the list length is :"+dicearr("",6).toArray().length);
    }
    static void dice(String p,int target){
        if (target==0){
            System.out.println(p);
            return ;
        }
        for (int i=1;i<=6&&i<=target;i++){
            dice(p+i,target-i);
        }
    }
    static ArrayList<String> dicearr(String p, int target){
        if (target==0){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        for (int i=1;i<=6&&i<=target;i++){
           list.addAll( dicearr(p+i,target-i));
        }
        return list;
    }

}
