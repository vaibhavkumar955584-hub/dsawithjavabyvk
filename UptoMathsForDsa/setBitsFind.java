public class setBitsFind {
    public static void main(String[] args) {
        int n=3234567;
        System.out.println("the given number is in binary:"+Integer.toBinaryString(n));
        int count=0;
//        while(n>0){
//           if((n&1)==1) count++;
//            n=n>>1;
//        }
        while (n > 0) {
            count++;
            n-=n&-n;//n=n&(n-1)

        }
        System.out.println("the number of set bits in number is:"+count);
    }
}
