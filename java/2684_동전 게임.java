import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0; i<N; i++){
            int[] res = {0,0,0,0,0,0,0,0};
            String S = sc.next();
            for(int j=0; j<38; j++){
                if(S.substring(j,j+3).equals("TTT")){
                    res[0]+=1;
                }else if(S.substring(j,j+3).equals("TTH")){
                    res[1]+=1;
                }else if(S.substring(j,j+3).equals("THT")){
                    res[2]+=1;
                }else if(S.substring(j,j+3).equals("THH")){
                    res[3]+=1;
                }else if(S.substring(j,j+3).equals("HTT")){
                    res[4]+=1;
                }else if(S.substring(j,j+3).equals("HTH")){
                    res[5]+=1;
                }else if(S.substring(j,j+3).equals("HHT")){
                    res[6]+=1;
                }else if(S.substring(j,j+3).equals("HHH")){
                    res[7]+=1;
                }
            }
            for(int j : res){
                System.out.print(j+" ");
            }
        }

    }
}