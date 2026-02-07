import java.util.Scanner;

public class ceilling_floor {
    public static void main(String[] args) {
        int arr[]={1,3,5,6,7,8,10};
        Scanner sc=new Scanner(System.in);

        while(true) {
            System.out.println("enter your number:");
            int n=sc.nextInt();
            System.out.println("1.ceilling number 2.floor number 3.exit");
            int ch = sc.nextInt();
            if (ch == 1)  System.out.println(ceilling(arr,n));
            else if(ch==2)System.out.println(floor(arr,n));
            else break;
        }

    }
    static int ceilling(int arr[],int target){
        int s=0,e= arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(target==arr[mid]){
                return mid;
            }else if(target>arr[mid]) s=mid+1;
            else e=mid-1;

        }
        if(s<arr.length) return arr[s];
        return -1;
    }
    static int floor(int arr[],int target){
        int s=0,e= arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(target==arr[mid]){
                return mid;
            }else if(target>arr[mid]) s=mid+1;
            else e=mid-1;
        }
        if(e>0)return arr[e];
        return -1;
    }
}
