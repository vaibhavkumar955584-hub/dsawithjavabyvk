import java.util.Arrays;

public class bubbleSort_selction {
    public static void main(String[] args) {
        int arr[]={1,7,54,4,3,2,234};
//        buble( arr,arr.length-1,0);
        selection(arr,arr.length-1,0,0);
        System.out.println(Arrays.toString(arr));
    }

    private static void buble(int[] arr,int i,int j) {

        if(i==0){
            return;
        }

        if(j<i){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
            buble(arr,i,j+1);


        }else {
            buble(arr,i-1,0);

        }
    }
    private static void selection(int[] arr,int i,int j,int max) {

        if(i==0){
            return;
        }

        if(j<i){
            if(arr[j]>arr[max]){
                selection(arr,i,j+1,j);
            }else {
                selection(arr,i,j+1,max);
            }
        }else {
            int temp=arr[max];
            arr[max]=arr[i-1];
            arr[i-1]=temp;
            selection(arr,i-1,0,0);

        }
    }
}
