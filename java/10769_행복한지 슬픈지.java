import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int happy = 0;
        int sad = 0;
        for(int i=0; i<S.length()-2; i++){
            if(S.charAt(i)==':'){
                if((S.substring(i,i+3)).equals(":-)")){
                    happy++;
                }else if((S.substring(i,i+3)).equals(":-(")){
                    sad++;
                }
            }
        }
        if(happy==0&&sad==0){
            System.out.print("none");
        }else if(happy>sad){
            System.out.print("happy");
        }else if(happy<sad){
            System.out.print("sad");
        }else{
            System.out.print("unsure ");
        }
    }
}