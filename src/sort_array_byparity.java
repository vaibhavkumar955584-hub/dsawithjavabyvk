import java.util.Arrays;

public class sort_array_byparity {
    public static void main(String[] args) {
        int arr[]={0,2};
        int i=0,j=arr.length-1;
        while(i<j){
            if(arr[i]%2==0) {
                i++;
            }else if(arr[j]%2!=0){
                    j--;
            }

            else{
                swap(arr,i,j);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

