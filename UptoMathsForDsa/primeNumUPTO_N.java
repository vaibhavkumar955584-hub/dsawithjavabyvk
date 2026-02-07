public class primeNumUPTO_N {
    public static void main(String[] args) {
      int n=40;
      boolean []arr=new boolean[n+1];//array of false in inttial
      seive(n,arr);
    }
    static void seive(int n,boolean arr[]){
         for(int i=2;i*i<n;i++){
             if(!arr[i]){
                 for(int j=i*2;j<=n;j+=i){
                     arr[j]=true;
                 }
             }
         }int count=0;
         for(int i=0;i<=n;i++){
             if(!arr[i]){
                 count++;
                 System.out.println(i);
             }
         }
        System.out.println("the total number of the prime number :"+count);
    }
}
