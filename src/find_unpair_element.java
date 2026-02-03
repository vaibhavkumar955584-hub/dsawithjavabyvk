public class find_unpair_element {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,3,2,1};
        System.out.println(fuelement(arr));
        int arr2[]={2,-1,-2,1,4,-3,3};
        System.out.println(f_u_withneg_pair(arr2));
    }

    private static int f_u_withneg_pair(int[] arr) {
        int sum=0;
        for(int n: arr) sum+=n;
        return sum;
    }

    private static int fuelement(int[] arr) {
        int unique=0;
        for(int n:arr){
            unique^=n;
        }
        return unique;
    }
}
