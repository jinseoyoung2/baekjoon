// https://www.acmicpc.net/problem/3003
// 문제
// 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.
// 발견한 피스의 개수가 주어졌을 때, 몇 개를 더하거나 빼야 올바른 세트가 되는지 구하는 프로그램을 작성하시오.
// 입력 =>
// 찾은 킹, 퀸, 룩, 비숍, 나이트, 폰의 개수가 주어진다. 이 값은 0보다 크거나 같고 10보다 작거나 같은 정수이다.
// 출력 =>
// 첫째 줄에 입력에서 주어진 순서대로 몇 개의 피스를 더하거나 빼야 되는지를 출력한다.
// 만약 수가 양수라면 그 개수 만큼 피스를 더해야 하는 것이고, 음수라면 제거해야 하는 것이다.

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] chess = {1,1,2,2,2,8};
        int[] piece = new int[6];
        for(int i=0; i<6; i++){
            piece[i]=sc.nextInt();
        }
        for(int j=0; j<6; j++){
            System.out.print(chess[j]-piece[j]+" ");
        }
    }
}
