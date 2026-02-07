

public class passingValue {
    public static void main(String[] args) {
        print(7);

    }
    static void print(int n){
        if(n==0){
            return;

        }
        System.out.println(n);
        //print(n--);
        print(--n);
    }
}
