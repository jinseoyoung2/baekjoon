import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int f1 = sc.nextInt();
        for(int i=0; i<f1; i++){
            int f2 = sc.nextInt();
            int[] A = new int[f2];
            int B = 0;
            for(int j=0; j<f2; j++){
                A[j] = sc.nextInt();
                B = A[B]>A[j]?B:j;
            }
            Arrays.sort(A);
            if(A[f2-1]==A[f2-2]){
                System.out.println("no winner");
            }else if(Arrays.stream(A).sum()/2<A[f2-1]){
                System.out.println("majority winner "+(B+1));
            }else{
                System.out.println("minority winner "+(B+1));
            }
        }
    }
}