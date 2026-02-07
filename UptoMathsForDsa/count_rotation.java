public class count_rotation {
    public static void main(String[] args) {
        int arr[]={5,6,7,8,9,1,2,3};
        System.out.println("the number of rotation in the array:"+ countrotation(arr));
    }
    private static int countrotation(int arr[]){
        int num=pivot(arr);
        return num+1;
    }
    static int pivot(int arr[]){
        int s=0, e=arr.length-1;
        while(s<e){
            int mid=s+(e-s)/2;
            if(mid<e&& arr[mid]>arr[mid+1]) return mid;
            if(mid>s&& arr[mid]<arr[mid-1]) return mid-1;
            if(arr[mid]<=arr[s]) e=mid-1;
            else
                s=mid+1;

        }
        return -1;
    }
}
