import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int Max = Integer.parseInt(A.replace('5','6'))+Integer.parseInt(B.replace('5','6'));
        int Min = Integer.parseInt(A.replace('6','5'))+Integer.parseInt(B.replace('6','5'));
        System.out.print(Min+" "+Max);
    }
}