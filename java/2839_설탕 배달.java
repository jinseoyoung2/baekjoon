import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int res = 0;
        while (true){
            if(N<0){
                System.out.print(-1);
                break;
            }
            if(N%5==0){
                res+=N/5;
                System.out.print(res);
                break;
            }
            N-=3;
            res+=1;
        }
    }
}