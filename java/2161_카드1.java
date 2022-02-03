import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Queue<Integer> NList = new LinkedList<Integer>();
        for(int i=1; i<=N; i++){ NList.add(i); }
        while(NList.size()!=1){
            System.out.print(NList.poll() + " ");
            NList.add(NList.poll());
        }
        System.out.print(NList.poll());
    }
}