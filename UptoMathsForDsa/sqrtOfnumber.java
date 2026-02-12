public class sqrtOfnumber {
    public static void main(String[] args) {
        System.out.println( sqrt(25,4));
    }
    static double sqrt(int n,int p){
        double ans=0;
        int end=n,strt=0;
                while(strt<end){
                    int mid=strt+(end-strt)/2;
                    if(mid*mid==n){
                        return mid;
                    }else if(mid*mid>n){
                        end=mid-1;
                    }else {
                        strt=mid+1;
                        ans=mid;
                    }
                }
                double incr=0.1;

                for(int i=0;i<=p;i++){
                    while(ans*ans<=n){
                        ans+=incr;
                    }
                    ans-=incr;
                    incr/=10;
                }
        return (int)ans;
    }
}
