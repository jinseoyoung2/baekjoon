// https://www.acmicpc.net/problem/2839
// 문제
// 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다. 최대한 적은 봉지를 들고 가려고 한다.
// 18킬로그램 설탕을 배달해야 할 때, 3킬로그램 봉지 6개를 가져가도 되지만, 5킬로그램 3개와 3킬로그램 1개를 배달하면, 더 적은 개수의 봉지를 배달할 수 있다.
// 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.
// 입력 =>
// 첫째 줄에 N이 주어진다. (3 ≤ N ≤ 5000)
// 출력 =>
// 상근이가 배달하는 봉지의 최소 개수를 출력한다. 만약, 정확하게 N킬로그램을 만들 수 없다면 -1을 출력한다.

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int res = 0;
        while (true){
            if(N<0){
                System.out.print(-1);
                break;
            }
            if(N%5==0){
                res+=N/5;
                System.out.print(res);
                break;
            }
            N-=3;
            res+=1;
        }
    }
}
