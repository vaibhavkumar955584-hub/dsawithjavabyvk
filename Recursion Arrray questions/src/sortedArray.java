
public class sortedArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,63,4};
        System.out.println(sorted(arr,0));
    }
    static boolean sorted(int []arr,int step){
        if(arr[step]==arr[arr.length-1]){
            return true;
        }
//        if(arr[step]<=arr[step+1]){
//            return sorted(arr,step+1);
//        }
        return arr[step]<=arr[step+1]&& sorted(arr,step+1);
    }
}