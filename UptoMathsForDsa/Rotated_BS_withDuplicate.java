import java.util.Scanner;
import java.util.*;

public class Rotated_BS_withDuplicate {
    public static void main(String[] args) {
        int arr[] = {6,7,8,9,1,1,1,1,2,2,2};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target) {
        int s = 0, e = arr.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == target) return mid;

            // If duplicates at boundaries, shrink search space
            if (arr[s] == arr[mid] && arr[mid] == arr[e]) {
                s++;
                e--;
            }
            // Left half is sorted
            else if (arr[s] <= arr[mid]) {
                if (target >= arr[s] && target < arr[mid]) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
            // Right half is sorted
            else {
                if (target > arr[mid] && target <= arr[e]) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        }
        return -1;
    }
}