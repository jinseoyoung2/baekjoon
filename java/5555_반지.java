import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int N = sc.nextInt();
        int res = 0;
        for(int i=0; i<=N; i++){
            String st = sc.nextLine();
            st = st+st;
            if(st.indexOf(S)!=-1){
                res++;
            }
        }
        System.out.println(res);
    }
}