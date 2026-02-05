import java.util.Scanner;

public class PowerOfTwoOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number:");
        int n=sc.nextInt();
        if(n<=0){
            System.out.println("the given number is zero or less then zero");
        }else{
            int ans=n&(n-1);
            if(ans==0){
                System.out.println("the number is power of two.");
            }else System.out.println("that's not power of two");
        }

    }
}
