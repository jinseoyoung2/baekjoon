import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        String[] B = sc.next().split("");
        int sum = 0;
        for(int i=0; i<A; i++){
            sum+= Integer.parseInt(B[i]);
        }
        System.out.print(sum);
    }
}