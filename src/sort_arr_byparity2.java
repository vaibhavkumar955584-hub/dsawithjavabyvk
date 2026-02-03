import java.util.Arrays;

public class sort_arr_byparity2 {
    public static void main(String[] args) {
       int arr[]={4,1,2,1};
        int i=0,j=arr.length-1;
        while(i<j){
            if(arr[i]%2==0&&i%2==0){
                i++;
            }else if(arr[j]%2!=0&&j%2!=0){
                j--;
            }else{
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        for(int n:arr){
            System.out.println(n);
        }
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
