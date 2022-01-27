// https://www.acmicpc.net/problem/5555
// 문제
// 각각의 반지는 대문자 10 문자로 이루어진 문자열이 새겨져 있다.
// 반지는 문자열의 시작과 끝이 연결된 형태로 문자가 새겨져 있다. 반지에 각인된 문자열을 거꾸로 읽는 걱정은 없다.
// 찾고자하는 문자열이 주어졌을 때 그 문자열을 포함하는 반지가 몇 개인지를 발견하는 프로그램을 작성하라.
// 입력 =>
// 입력은 총 2 + N 줄 이다. 첫 번째 줄에는 1 자 이상 10 자 이하의 대문자로 구성된 찾고자 하는 문자열이 적혀있다.
// 두 번째 줄에는 반지의 개수 N이 적혀있다. 2+i 줄엔 i개의 반지에 새겨져있고, 10 문자로 이루어진 문자열이 적혀있다.
// 출력 =>
// 찾고자하는 문자열을 포함 반지의 개수를 나타내는 정수를 한 줄로 출력하라.

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int N = sc.nextInt();
        int res = 0;
        for(int i=0; i<=N; i++){
            String st = sc.nextLine();
            st = st+st;
            if(st.indexOf(S)!=-1){
                res++;
            }
        }
        System.out.println(res);
    }
}
