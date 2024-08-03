package DSA.L1_L2_L3_L4_L5_L6_L7;
public class P2_factorialOfANumber {

    public static int fact(int n){
        int fac=1;
        while(n>0){
            fac=fac*n;
            n--;
        }
        return fac;
    }
    public static void main(String[] args) {
        System.out.println(fact(6));
    }
}
