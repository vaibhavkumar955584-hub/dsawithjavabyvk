import java.util.ArrayList;
import java.util.Arrays;

public class counting_bits {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(5)));
    }
    public static int[] countBits(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        int count = 0;
        for (int i = 0; i <=n; i++) {
            if(i==0) arr.add(0);
            else {
                int temp = i;
                while (temp > 0) {
                    if ((temp & 1) == 1) {
                        count++;
                    }
                    temp >>= 1;

                }
                arr.add(count);
                count=0;
            }

        }
        int[] array = arr.stream().mapToInt(Integer::intValue).toArray();
        return array;

    }
}
