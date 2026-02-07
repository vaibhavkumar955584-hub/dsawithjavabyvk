import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
//        int []arr={8,76,5,4,3,2};
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the number to search in array:");
//        int n= sc.nextInt();
//        for(int a:arr){
//            if(n==a) System.out.printf("the element is found at %d",arr[a]+1);;
//        }

        int [][]arr1={{1,2,3},{4,5,6,7},{8,9,10}};
        for(int row[]:arr1){
            for(int col:row){
                System.out.println(col);
            }
        }
    }
}
