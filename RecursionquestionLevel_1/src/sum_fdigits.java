public class sum_fdigits {
    public static void main(String[] args) {
        System.out.println(sumofdig(1234));
    }

    private static int sumofdig(int n) {
        if(n==0){
            return 0;
        }
        int temp=n%10;

        return temp+sumofdig(n/10);
    }

}
