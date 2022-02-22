// https://www.acmicpc.net/problem/2753

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N%4==0){
            if(N%100!=0){
                System.out.print(1);
            }else if(N%400==0){
                System.out.print(1);
            }else{
                System.out.print(0);
            }
        }else{
            System.out.print(0);
        }
    }
}