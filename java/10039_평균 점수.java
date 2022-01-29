import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i=0; i<5; i++){
            int N = sc.nextInt();
            sum+= N<40?40:N;
        }
        System.out.print(sum/5);
    }
}