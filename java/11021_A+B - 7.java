import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for(int i=1; i<=testCase; i++){
            int N = sc.nextInt();
            int M = sc.nextInt();
            System.out.printf("Case #%d: %d%n",i,(N+M));
        }
    }
}