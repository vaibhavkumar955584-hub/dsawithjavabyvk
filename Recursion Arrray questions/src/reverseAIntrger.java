public class reverseAIntrger {
    public static void main(String[] args) {
       int rev= reverse(1534236469);
        System.out.println(rev);
    }
    static int reverse(int x) {
        int rev = 0;

        if (x < 0) {
            x = -x;
            while (x > 0) {
                int rem = x % 10;
                rev = rev * 10 + rem;
                x /= 10;
            }
            return -rev;
        }
        while (x > 0) {
            int rem = x % 10;
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0; // return 0 or handle overflow
            }

            rev = rev * 10 + rem;
            x /= 10;
        }
//        if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE)
//            return 0;
        return rev;
    }
}
