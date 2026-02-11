public class skipchar {
    public static void main(String[] args) {
        String str="aaabbccaa";
        System.out.println(skip(str));
        System.out.println(counttop("qwertopweedftopsxdftop",0));
    }
    static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }char ch=up.charAt(0);
        if(ch=='a')
            skip(p,up.substring(1));
        else skip(p+ch,up.substring(1));
    }
    static String skip(String up){
        if(up.isEmpty()){

            return "";
        }char ch=up.charAt(0);
        if(ch=='a')
            return skip(up.substring(1));

        return ch+skip(up.substring(1));
    }
    static int counttop(String up,int count){
        if(up.isEmpty()){

            return count;
        }
        if(up.startsWith("top"))
            return counttop(up.substring(3),count+1);

        else return counttop(up.substring(1),count);

    }
}