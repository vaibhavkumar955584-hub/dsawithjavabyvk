import java.util.Scanner;

public class Rotated_BS {
    public static void main(String[] args) {
        int arr[]={6,7,8,9,1,2,3,4};
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        System.out.println(search(arr,target));
    }
    static int search(int[]arr,int target){
        int pivot=pivot(arr);
        if(pivot==-1) return binarysearch(arr,target,0,arr.length-1);
        if(arr[pivot]==target) return pivot;
        if(target>=arr[0]) return binarysearch(arr,target,0,pivot);
        return binarysearch(arr, target,pivot+1,arr.length-1);
    }
    static int binarysearch(int[]arr, int target, int s, int e){
        while(s<=e){
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
    static int pivot(int []arr){
        int s=0, e=arr.length-1;
        while(s<e){
            int mid=s+(e-s)/2;
            if(mid<e &&arr[mid]>arr[mid+1]) return mid;
            if(mid>s &&arr[mid]<arr[mid-1]) return mid-1;
            if(arr[mid]<=arr[s]) e=mid-1;
            else s=mid+1;
        }
        return -1;
    }

}
