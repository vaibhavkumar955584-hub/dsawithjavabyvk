public class order_agnostic_bs {
    public static void main(String[] args) {
        int arr[]={9,7,6,5,4,3};
        int ans=orderagnosticsearch(arr,5);
        System.out.println(ans+1);
    }
    static int orderagnosticsearch(int []arr,int target){
        int s=0,e=arr.length-1;
        boolean isAsen=arr[s]<arr[e];
        while(s<=e){
            int mid=s+(e-s)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(isAsen){
                if(target>arr[mid])
                    s=mid+1;
                else
                    e=mid-1;

            }else{
                if(target<arr[mid])
                    s=mid+1;
                else
                    e=mid-1;
            }

        }
      return -1;

    }
}
