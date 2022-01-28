import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = 1000 - sc.nextInt();
        System.out.println((N/500)+((N%500)/100)+(((N%500)%100)/50)+((((N%500)%100)%50)/10)+(((((N%500)%100)%50)%10)/5)+((((((N%500)%100)%50)%10)%5)/1));
    }
}