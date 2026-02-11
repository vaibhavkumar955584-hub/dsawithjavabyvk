public class pallindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
    public static boolean isPalindrome(String s) {
        return palindrome(s);
    }
    static boolean palindrome(String str){
        int s=0,e=str.length()-1;
        while(s<e){
            char ch1=str.charAt(s);
            char ch2= str.charAt(e);
            if(!Character.isLetterOrDigit(ch1)) {
                s++;
                continue;
            }
            if(!Character.isLetterOrDigit(ch2)) {
                e--;
                continue;
            }
            if(Character.toLowerCase(ch1)!=Character.toLowerCase(ch2)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}
