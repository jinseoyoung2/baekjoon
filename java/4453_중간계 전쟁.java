import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] A1 = {1,2,3,3,4,10};
        int[] B1 = {1,2,2,2,3,5,10};
        int N = sc.nextInt();
        for(int i=0; i<N; i++){
            int A2 = 0;
            int B2 = 0;
            for(int j=0;j<A1.length; j++){
                A2+=sc.nextInt()*A1[j];
            }
            for(int j=0;j<B1.length; j++){
                B2+=sc.nextInt()*B1[j];
            }
            if(A2==B2){
                System.out.println("Battle "+(i+1)+": No victor on this battle field");
            }else if(A2<B2){
                System.out.println("Battle "+(i+1)+": Evil eradicates all trace of Good");
            }else if(A2>B2){
                System.out.println("Battle "+(i+1)+": Good triumphs over Evil");
            }
        }
    }
}