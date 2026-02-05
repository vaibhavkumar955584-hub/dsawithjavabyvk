import java.util.Scanner;

public class rightMostSetBits {
    public static void main(String[] args) {


                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();

                // isolate rightmost set bit
                int rmsb = n & -n;

                System.out.println("Rightmost set bit value: " + rmsb);

                // If you want the position (1-based index)
                int pos = (int)(Math.log(rmsb) / Math.log(2)) + 1;
                System.out.println("Rightmost set bit position: " + pos);


    }
}
