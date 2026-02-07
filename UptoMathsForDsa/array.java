import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4};
        String r = Arrays.toString(arr);
        System.out.println(r); // Output: [2, 3, 4]

        int [][]arr2={{12,9,3,5,8,4},{1,2,3,7,4,5,6}};
        for(int[] i :arr2){
            System.out.println(Arrays.toString(i));
        }
    }
}