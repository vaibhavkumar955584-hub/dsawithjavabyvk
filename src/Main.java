//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    public static void main(String[] args) {
//     int [][]arr={{1,3}};
//     int target=3;
//        System.out.println(searchMatrix(arr,target));
//
//    }
//    static boolean searchMatrix(int[][] arr, int target) {
//        int r=0,c=arr.length;
//        while(r<arr.length && c>=0){
//            if(target==arr[r][c])return true;
//            else if(arr[r][c]<target) r++;
//            else c--;
//        }
//        return false;
//    }
public class Main {
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.print("Fibonacci Series up to " + n + " terms: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
//        public static int mySqrt(int x) {
//            int ans=0,s=1, e=x;
//            while(s<=e){
//                int mid=s+(e-s)/2;
//                if(mid<=x/mid){
//                    ans=mid;
//                    s=mid+1;
//                }else{
//                    e=e-1;
//                }
//            }
//            return ans;
//        }

//}