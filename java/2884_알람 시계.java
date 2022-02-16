// https://www.acmicpc.net/problem/2884

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        m-=45;
        if(m<0){
            if(h==0){
                System.out.print("23 "+(m+60));
            }else{
                System.out.print((h-1)+" "+(m+60));
            }
        }else{
            System.out.print(h+" "+m);
        }
    }
}
