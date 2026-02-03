import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(12);
        arr.add(12);arr.add(12);arr.add(12);
        // to remove the element from arraylist by index
        arr.remove(2);
        System.out.println(arr);
        // removes the FIRST 12, not all
        boolean removed = arr.remove(Integer.valueOf(12));


        System.out.println(arr);
        arr.add(13);

        System.out.println(arr);
        int elemnt=arr.getLast();
        System.out.println(elemnt);
    }
}
