import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0; i<T; i++){
            String h1 = sc.next();
            String h2 = sc.next();
            String[] H1 = h1.split("");
            String[] H2 = h2.split("");
            int res = 0;
            for(int j=0; j<H1.length; j++){
                if(!H1[j].equals(H2[j])){
                    res++;
                }
            }
            System.out.printf("Hamming distance is %d.%n",res);
        }
    }
}