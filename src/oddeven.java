public class oddeven{
    public static void main(String[] args) {
        int a=89;
         System.out.println("the given number is even when true else false" );
        System.out.println("the given number is "+odd_even(a));
    }

    static boolean odd_even(int a) {
        return (a&1)==1;
    }

}
