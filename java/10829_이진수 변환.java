// https://www.acmicpc.net/problem/10829
// 문제
// 입력 값을 받아 이진수로 출력하라.

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        System.out.print(Long.toBinaryString(N));
    }
}
