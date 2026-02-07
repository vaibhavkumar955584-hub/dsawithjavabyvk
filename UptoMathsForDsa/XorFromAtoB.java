public class XorFromAtoB {
    public static void main(String[] args) {
        int n=3,n2=9;
       int ans= xorfrom0ton(n-1)^xorfrom0ton(n2);
        System.out.println(ans);
    }
    static int xorfrom0ton(int n){
        if (n%4==0) return(n);
        if(n%4==1) return(1);
        if(n%4==2) return(n+1);
       return(0);

    }
}
