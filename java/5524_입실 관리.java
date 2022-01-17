// https://www.acmicpc.net/problem/5524
// 문제
// 모두 소문자로 변환하는 프로그램을 작성하라.
// 입력 =>
// 첫째 줄에는 정수 N(1 ≤ N ≤ 100)이 주어진다.
// 둘째 줄부터는 1글자 이상 20문자 이하의 영어 대문자, 소문자로만 이루어지는 문자열 Si가 주어진다.
// 출력 =>
// i번째 줄에, i번째 입실자의 이름을 소문자로 출력한다.

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0; i<N; i++){
            String Si = sc.next();
            System.out.println(Si.toLowerCase());
        }
    }
}
