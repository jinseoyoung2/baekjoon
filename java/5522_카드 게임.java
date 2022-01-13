// https://www.acmicpc.net/problem/5522
// 문제 : 총점을 구하는 프로그램을 작성하라.

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int res = 0;
        for(int i=0; i<5; i++){
            res += sc.nextInt();
        }
        System.out.print(res);
    }
}
