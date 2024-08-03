package DSA.L1_L2_L3_L4_L5_L6_L7;
import java.util.*;
public class P1_ReverseANumber {
    public static int reverse(int num){
        int revNum = 0;

        while(num>0){
        int LD = num%10;
        revNum = revNum*10 + LD ;
        num=num/10;
       }
       return revNum;
        
    }
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(reverse(input));
        sc.close();
      }
}
