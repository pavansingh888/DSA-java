package DSA.L1_L2_L3_L4_L5_L6_L7;
import java.util.Scanner;

public class P3_BinaryToDecimal {
    public static int BinToDec(int Bin){
        int LD;
        int Dec = 0;
        int pow = 0;
        while(Bin>0){
            LD = Bin%10;
            Bin= Bin/10;
            Dec+= LD * Math.pow(2, pow);
            pow++;
        }
        return Dec;
    }
    public  static void main(String []args){
       Scanner sc = new Scanner(System.in);
       int input = sc.nextInt();
       System.out.println("Decimal number equivalent is: "+BinToDec(input));
       sc.close();
    }
}
