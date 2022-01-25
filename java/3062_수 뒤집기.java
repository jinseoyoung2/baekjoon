import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0; i<T; i++){
            int N1 = sc.nextInt();
            String M1 = new StringBuffer(String.valueOf(N1)).reverse().toString();
            int N2 = Integer.parseInt(M1);
            String M2 = String.valueOf(N1+N2);
            String res = "YES";
            for(int j=0; j<(M2.length()/2); j++){
                if(M2.charAt(j)!=M2.charAt(M2.length()-j-1)){
                    res = "NO";
                }
            }
            System.out.println(res);
        }
    }
}