// https://www.acmicpc.net/problem/10822
// 문제
// S에 포함되어있는 자연수의 합을 구하는 프로그램을 작성하시오.
// 입력 =>
// 첫째 줄에 문자열 S가 주어진다. S의 길이는 최대 100이다. 포함되어있는 정수는 1,000,000보다 작거나 같은 자연수이다.
// 출력 =>
// 문자열 S에 포함되어 있는 자연수의 합을 출력한다.
    
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String[] Si = S.split(",");
        int res = 0;
        for(String i : Si){
            res+=Integer.valueOf(i);
        }
        System.out.print(res);
    }
}
