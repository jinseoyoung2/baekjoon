import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int res = 1;
        for(int i=0; i<N; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            if(A==res||B==res){
                res=A==res?B:A;
            }
        }
        System.out.println(res);
    }
}