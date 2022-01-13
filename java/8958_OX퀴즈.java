import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0; i<T; i++){
            int num = 0;
            int res = 0;
            String S = sc.next();
            for(int j=0; j<S.length(); j++){
                if(S.charAt(j)=='O'){
                    num+=1;
                }else{
                    num=0;
                }
                res+=num;
            }
            System.out.println(res);
        }
    }
}