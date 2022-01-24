// https://www.acmicpc.net/problem/4597
// 문제
// 마지막 숫자가 지워진 비트 스트링이 주어지고, 이 비트 스트링의 패리티가 주어졌을 때, 마지막 숫자를 올바르게 구하는 프로그램을 작성하시오.
// 입력 =>
// 입력은 여러 개의 비트 스트링으로 이루어져 있다. 각 비트 스트링은 한 줄로 이루어져 있고, 길이는 1~31비트이다.
// 또, 비트 스트링의 마지막 문자는 e 또는 o이다. (e: 짝수 패리티, o: 홀수 패리티) 마지막 줄에는 '#'이 주어진다.
// 출력 =>
// 입력으로 주어진 각각의 비트 스트링에 대해서, 마지막 문자를 올바른 비트로 바꾼 비트 스트링을 출력한다.

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
