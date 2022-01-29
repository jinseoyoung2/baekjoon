import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0; i<N; i++){
            int A = sc.nextInt();
            String B = sc.next();
            System.out.println(B.substring(0,A-1)+B.substring(A));
        }
    }
}