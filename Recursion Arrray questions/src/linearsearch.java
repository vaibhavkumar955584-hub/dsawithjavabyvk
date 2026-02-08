public class linearsearch {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,2,1,2,5};
        System.out.println(linearSearch(arr,5,0));
    }

    private static boolean linearSearch(int[] arr, int tar, int step) {
        if(step==arr.length-1) return false;
        return (arr[step]==tar)||linearSearch(arr,tar,step+1);
    }
}
