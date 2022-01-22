import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] numL = new int[N];
        for(int i=0; i<N; i++){
            numL[i] = sc.nextInt();
        }
        Arrays.sort(numL);
        int res=0, N1=0;
        int N2=N-1;
        while(N1<N2){
            if(numL[N1]+numL[N2]==M){
                res++;
                N1++;
                N2--;
            }else if(numL[N1]+numL[N2]<M){
                N1++;
            }else{
                N2--;
            }
        }
        System.out.print(res);
    }
}