// https://www.acmicpc.net/problem/2979
// 문제
// 상근이가 이용하는 주차장은 주차하는 트럭의 수에 따라서 주차 요금을 할인해 준다.
// 트럭을 한 대 주차할 때는 1분에 한 대당 A원을 내야 한다. 두 대를 주차할 때는 1분에 한 대당 B원, 세 대를 주차할 때는 1분에 한 대당 C원을 내야 한다.
// A, B, C가 주어지고, 상근이의 트럭이 주차장에 주차된 시간이 주어졌을 때, 주차 요금으로 얼마를 내야 하는지 구하는 프로그램을 작성하시오.
// 입력 =>
// 첫째 줄에 문제에서 설명한 주차 요금 A, B, C가 주어진다. (1 ≤ C ≤ B ≤ A ≤ 100)
// 다음 세 개 줄에는 두 정수가 주어진다. 이 정수는 상근이가 가지고 있는 트럭이 주차장에 도착한 시간과 주차장에서 떠난 시간이다. 
// 도착한 시간은 항상 떠난 시간보다 앞선다. 입력으로 주어지는 시간은 1과 100사이 이다.
// 출력 =>
// 첫째 줄에 상근이가 내야하는 주차 요금을 출력한다.

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int[] T = new int[100];
        for(int i=0; i<3; i++){
            int S1 = sc.nextInt();
            int S2 = sc.nextInt();
            for(int j=S1; j<S2; j++){
                T[j]+=1;
            }
        }
        int res = 0;
        for (int i=1; i<100; i++){
            if(T[i]==1){
                res+=A;
            }else if(T[i]==2){
                res+=B*2;
            }else if(T[i]==3){
                res+=C*3;
            }
        }
        System.out.print(res);
    }
}
