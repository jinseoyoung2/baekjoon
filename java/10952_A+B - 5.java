// https://www.acmicpc.net/problem/10952

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int A = sc.nextInt();
            int B = sc.nextInt();
            if(A==0){
                break;
            }
            System.out.println(A+B);
        }
    }
}