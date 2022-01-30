import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] N = new String[]{"black","brown","red","orange",
                "yellow","green","blue","violet","grey","white"};
        String C1 = sc.next();
        String C2 = sc.next();
        String C3 = sc.next();
        long A = Integer.parseInt(String.valueOf(Arrays.asList(N).indexOf(C1))+
                String.valueOf(Arrays.asList(N).indexOf(C2)));
        A*=(long)Math.pow(10, Arrays.asList(N).indexOf(C3));
        System.out.println(A);
    }
}