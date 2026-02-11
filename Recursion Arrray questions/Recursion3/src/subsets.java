import java.util.ArrayList;

public class subsets {
    public static void main(String[] args) {
       // subset("","abc");
        System.out.println(subArrList("" ,"abc"));
    }

    private static void subset(String str,String up) {
        if(up.isEmpty()){
            System.out.println(str);
            return ;
        }
        char ch=up.charAt(0);
        subset(str,up.substring(1));

        subset(str+ch,up.substring(1));
    }
    static ArrayList<String> subArrList(String str,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(str);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left= subArrList(str+ch,up.substring(1));
        ArrayList<String> right= subArrList(str, up.substring(1));
        left.addAll(right);
        return left;


    }
}
