// https://www.acmicpc.net/problem/3062
// 문제
// 원래 수와 뒤집은 수를 합한 수가 좌우 대칭이 되는지 테스트 하는 프로그램을 작성하시오.
// 입력 =>
// 입력의 첫 줄에는 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄에 하나의 정수 N(10 ≤ N ≤ 100000)이 주어진다.
// 출력 =>
// 각 테스트 케이스에 대해서 원래 수와 뒤집은 수를 합한 수가 좌우 대칭이 되면 YES를 아니면 NO를 한 줄에 하나씩 출력한다.

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0; i<T; i++){
            int N1 = sc.nextInt();
            String M1 = new StringBuffer(String.valueOf(N1)).reverse().toString();
            int N2 = Integer.parseInt(M1);
            String M2 = String.valueOf(N1+N2);
            String res = "YES";
            for(int j=0; j<(M2.length()/2); j++){
                if(M2.charAt(j)!=M2.charAt(M2.length()-j-1)){
                    res = "NO";
                }
            }
            System.out.println(res);
        }
    }
}
