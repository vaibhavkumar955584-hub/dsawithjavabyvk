public class palindromnum {
    public static void main(String[] args) {
        System.out.println(palindrom(123321));
    }
    static int rev1(int n){
        int digit=(int)Math.log10(n)+1;
        return helper(n,digit);
    }

    private static int helper(int n, int digit) {
        if (n%10==n){
            return n;
        }
        int rem=n%10;
        return rem*(int)Math.pow(10,digit-1)+helper(n/10,digit-1);
    }
    static boolean palindrom(int n){
        return rev1(n)==n;
    }
}
