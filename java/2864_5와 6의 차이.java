// https://www.acmicpc.net/problem/2864
// 문제
// 상근이가 숫자 5를 볼 때, 5로 볼 때도 있지만, 6으로 잘못 볼 수도 있고, 6을 볼 때는, 6으로 볼 때도 있지만, 5로 잘못 볼 수도 있다.
// 두 수 A와 B가 주어졌을 때, 상근이는 이 두 수를 더하려고 한다.
// 이때, 상근이가 구할 수 있는 두 수의 가능한 합 중, 최솟값과 최댓값을 구해 출력하는 프로그램을 작성하시오.
// 입력 =>
// 첫째 줄에 두 정수 A와 B가 주어진다. (1 <= A,B <= 1,000,000)
// 출력 =>
// 첫째 줄에 상근이가 구할 수 있는 두 수의 합 중 최솟값과 최댓값을 출력한다.

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int Max = Integer.parseInt(A.replace('5','6'))+Integer.parseInt(B.replace('5','6'));
        int Min = Integer.parseInt(A.replace('6','5'))+Integer.parseInt(B.replace('6','5'));
        System.out.print(Min+" "+Max);
    }
}
