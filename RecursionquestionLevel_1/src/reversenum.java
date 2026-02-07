public class reversenum {
    static int sum=0;
    static void revnum(int n){

        if(n==0){
            return ;
        }
        int rem=n%10;
        sum=sum*10+rem;
        revnum(n/10);


    }

    public static void main(String[] args) {
        revnum(1234);
        System.out.println("reversenum is:"+sum) ;
        System.out.println(rev1(12345));

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

}
