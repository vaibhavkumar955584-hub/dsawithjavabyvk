package Stacks.questions;

import java.util.Arrays;

public class game_of_stacks {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,6,0};
        int arr2[]={2,3,4,5,6,9};
        System.out.println(twoStack(10,arr1,arr2));

    }
    static int twoStack(int x,int []a,int b[]){
        return twoStacks(5,a,b,0,0);}
    private static int twoStacks(int x,int a[],int  b[],int sum, int count){
        if(sum>x){
            return count;
        }
        if(a.length==0||b.length==0){
            return count;
        }
        int leftAns=twoStacks(x, Arrays.copyOfRange(a,1,a.length),b,sum+a[0],count+1);
        //System.out.println(a[0]);
        int rightAns=twoStacks(x, a,Arrays.copyOfRange(b,1,b.length),sum+a[0],count+1);
        //System.out.println(b[0]);
return Math.max(leftAns,rightAns);
    }
}
