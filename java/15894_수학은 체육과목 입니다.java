import java.util.Scanner;
import java.math.BigInteger;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger bigInteger = sc.nextBigInteger();
        System.out.print(bigInteger.multiply(BigInteger.valueOf(4)));
    }
}