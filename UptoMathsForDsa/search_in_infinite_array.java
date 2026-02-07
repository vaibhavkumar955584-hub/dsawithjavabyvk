public class search_in_infinite_array {
    public static void main(String[] args) {
     int []arr={1,2,3,4,5,6,7,8,9,12,23,34,45,67,78,89};
        System.out.printf("34 number is found at %d",searchrange(arr,34));
    }
    static int searchrange(int arr[],int target){
        int s=0;
        int e=1;
        while(target>arr[e]){

                int temp=e+1;
                //update the end by double of the privous subarray
                e=e+(e-s+1)*2;
                s=temp;

        }
        return binarysearch(arr,target,s,e);
    }
    static int binarysearch(int []arr,int target,int s, int e) {

        while (s < e) {
            int mid = s + (e - s) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid])
                s = mid + 1;
            else if (target < arr[mid]) {
                e = mid - 1;
            }

        }
        return -1;
    }
}
