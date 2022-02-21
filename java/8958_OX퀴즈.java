// https://www.acmicpc.net/problem/8958
// 문제
// "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다.
// 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다.
// 입력 =>
// 첫째 줄에 테스트 케이스의 개수가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고,
// 길이가 0보다 크고 80보다 작은 문자열이 주어진다. 문자열은 O와 X만으로 이루어져 있다.
// 출력 =>
// 각 테스트 케이스마다 점수를 출력한다.

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0; i<T; i++){
            int num = 0;
            int res = 0;
            String S = sc.next();
            for(int j=0; j<S.length(); j++){
                if(S.charAt(j)=='O'){
                    num+=1;
                }else{
                    num=0;
                }
                res+=num;
            }
            System.out.println(res);
        }
    }
}
