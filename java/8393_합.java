// https://www.acmicpc.net/problem/8393

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int res = 0;
        for(int i=1; i<=N; i++){
            res+=i;
        }
        System.out.print(res);
    }
}
