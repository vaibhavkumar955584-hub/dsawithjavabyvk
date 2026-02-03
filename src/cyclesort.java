import java.util.Arrays;

import static java.util.Collections.swap;

public class cyclesort {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,6};
        cycle_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cycle_sort(int []arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]<arr.length &&arr[i]!=arr[correct]){
                swap(arr,i, correct);
            }else {
                i++;
            }
        }

    }
    static void swap(int []arr1,int l,int r){
        int temp = arr1[l];
        arr1[l]=arr1[r];
        arr1[r]=temp;
    }
}
