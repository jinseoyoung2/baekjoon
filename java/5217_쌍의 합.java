import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0; i<T; i++){
            int N = sc.nextInt();
            int num = 1;
            System.out.printf("Pairs for %d: ",N);
            for(int j=0; j<((N-1)/2); j++){
                if(j>0){
                    System.out.print(", ");
                }
                System.out.print(num+" "+(N-num));
                num++;
            }
            System.out.println();
        }
    }
}
