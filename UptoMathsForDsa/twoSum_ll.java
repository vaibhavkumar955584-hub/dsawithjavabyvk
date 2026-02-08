import java.util.Arrays;

public class twoSum_ll  {
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        System.out.println(Arrays.toString(twoSum(arr,9)));
    }
    static int[] twoSum(int[] arr, int target) {
        int[] num = { -1, -1 };
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (arr[i] + arr[j] == target) {
                num[0] = i+1;
                num[1] = j+1;
                return num;
            }
            if (arr[i] + arr[j] > target) {
                j--;
            }
            else {
                i++;
            }
        }
        return num;
    }
}

