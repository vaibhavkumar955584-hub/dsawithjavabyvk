public class find_no_of_DigitinBase_B {
    public static void main(String[] args) {
      int a=12344;//number
      int b=10;//base
        int ans=(int)((Math.log(a)/Math.log(b))+1);
        System.out.println(ans);
    }
}
