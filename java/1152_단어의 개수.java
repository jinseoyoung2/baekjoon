import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine().trim();
        String[] S2 = S.split(" ");
        int res=S2.length;
        for (int i=0; i< S2.length; i++){
            if(S2[i].equals("")){
                res--;
            }
        }
        System.out.println(res);
    }
}