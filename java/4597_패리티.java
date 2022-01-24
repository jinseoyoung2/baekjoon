import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            String B = sc.next();
            if(B.equals("#")){break;}
            int res = 0;
            String Bit = "";
            for(int i = 0; i < B.length()-1; i++) {
                if(B.charAt(i) == '1') {
                    res++;
                }
                Bit += B.charAt(i);
            }
            if(B.charAt(B.length()-1)=='e'){
                Bit+=res%2==0?"0":"1";
            }else{
                Bit+=res%2==0?"1":"0";
            }
            System.out.println(Bit);
        }
    }
}