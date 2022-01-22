import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int tCase = sc.nextInt();
        double[] n = {350.34,230.90,190.55,125.30,180.90};
        for(int i=0; i<tCase; i++){
            double res = 0;
            for(int j=0; j<5; j++){
                int m = sc.nextInt();
                res += n[j]*m;
            }
            System.out.printf("$%.2f%n",res);
        }
	}
}