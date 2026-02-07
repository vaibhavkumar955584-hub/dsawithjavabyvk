import java.util.Arrays;

public class binarysearch {
    public static void main(String[] args) {
        int[]arr={4,2,1,3,45,5};
        Arrays.sort(arr);
        System.out.println(binarysearch(arr,10));
    }
    static int binarysearch(int []arr,int target){
        int s=0,e=arr.length-1;
        while(s<e){
            int mid=s+(e-s)/2;
            if(target==arr[mid]){
                return mid;
            }else if(target>arr[mid])
               s=mid+1;
            else if (target<arr[mid]) {
                e=mid-1;
            }

        }
        return -1;

    }
}
