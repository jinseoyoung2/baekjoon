import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int[] T = new int[100];
        for(int i=0; i<3; i++){
            int S1 = sc.nextInt();
            int S2 = sc.nextInt();
            for(int j=S1; j<S2; j++){
                T[j]+=1;
            }
        }
        int res = 0;
        for (int i=1; i<100; i++){
            if(T[i]==1){
                res+=A;
            }else if(T[i]==2){
                res+=B*2;
            }else if(T[i]==3){
                res+=C*3;
            }
        }
        System.out.print(res);
    }
}