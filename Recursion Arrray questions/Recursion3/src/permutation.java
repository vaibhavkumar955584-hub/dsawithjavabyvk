public class permutation {
    public static void main(String[] args) {
        String str="abc";
        combine("",str);
        System.out.println(countpermute("","120"));
    }

    private static void combine(String s, String str) {
        if(str.isEmpty()){
            System.out.println(s);
            return;
        }
        char ch=str.charAt(0);
        for(int i=0;i<=s.length();i++){
            String first=s.substring(0,i);
            String second=s.substring(i);
            combine(first+ch+second,str.substring(1));
        }
    }
    private static int countpermute(String s, String str) {
        if(str.isEmpty()){

           if(!s.isEmpty()&&s.charAt(0)!='0'){
               System.out.println(s);
               return 1;
           }
            return 0;
        } int count=0;
        char ch=str.charAt(0);
        for(int i=0;i<=s.length();i++){
            String first=s.substring(0,i);
            String second=s.substring(i);

               count=count+countpermute(first+ch+second,str.substring(1));



        }
        return count;
    }
}
