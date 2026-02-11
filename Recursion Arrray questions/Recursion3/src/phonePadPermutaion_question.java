import java.util.ArrayList;

public class phonePadPermutaion_question {
    public static void main(String[] args) {
        pad("","23");
        System.out.println(padarr("","23"));
    }
    static void pad(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }
        //when a-z are distributed in "2-9"
       int digit=up.charAt(0)-'0';
        int start=(digit - 2) * 3 + (digit > 7 ? 1 : 0);
        int size  = (digit == 7 || digit== 9) ? 4 : 3;

        int end   = start + size - 1;

      for (int i=start;i<=end;i++){
         char ch=(char)('a'+i);
         pad(p+ch,up.substring(1));

      }
    }
    static ArrayList<String> padarr(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        int digit=up.charAt(0)-'0';
        int start=(digit - 2) * 3 + (digit > 7 ? 1 : 0);
        int size  = (digit == 7 || digit== 9) ? 4 : 3;

        int end   = start + size - 1;

        for (int i=start;i<=end;i++){
            char ch=(char)('a'+i);
            list.addAll(padarr(p+ch,up.substring(1)));

        }
        return list;
    }
}
