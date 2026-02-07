public class productDigit {
    public static void main(String[] args) {
        System.out.println(proofdig(1234));
    }



        private static int proofdig(int n) {
            if(n%10==n){
                return n;
            }
            int temp=n%10;

            return temp*proofdig(n/10);
        }


}
