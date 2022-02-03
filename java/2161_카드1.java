// https://www.acmicpc.net/problem/2161
// 문제
// 카드가 한 장 남을 때까지 반복하게 된다. 우선, 제일 위에 있는 카드를 바닥에 버린다. 
// 그 다음, 제일 위에 있는 카드를 제일 아래에 있는 카드 밑으로 옮긴다.
// N이 주어졌을 때, 버린 카드들을 순서대로 출력하고, 마지막에 남게 되는 카드를 출력하는 프로그램을 작성하시오.
// 입력 =>
// 첫째 줄에 정수 N(1 ≤ N ≤ 1,000)이 주어진다.
// 출력 =>
// 첫째 줄에 버리는 카드들을 순서대로 출력한다. 제일 마지막에는 남게 되는 카드의 번호를 출력한다.

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Queue<Integer> NList = new LinkedList<Integer>();
        for(int i=1; i<=N; i++){ NList.add(i); }
        while(NList.size()!=1){
            System.out.print(NList.poll() + " ");
            NList.add(NList.poll());
        }
        System.out.print(NList.poll());
    }
}
