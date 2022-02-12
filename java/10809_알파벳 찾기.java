import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String E = "abcdefghijklmnopqrstuvwxyz";
        for(int i=0; i<E.length(); i++){
            System.out.print(S.indexOf(E.charAt(i))+" ");
        }
    }
}