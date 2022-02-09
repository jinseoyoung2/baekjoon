import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] res = new int[N];
        for(int x=0; x<M; x++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int z = sc.nextInt();
            for(int y=i-1; y<j; y++){
                res[y] = z;
            }
        }
        for(int x=0; x<res.length; x++){
            System.out.print(res[x] + " ");
        }
    }
}