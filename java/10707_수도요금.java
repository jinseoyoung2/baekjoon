// https://www.acmicpc.net/problem/10707
// 문제
// JOI군이 살고 있는 지역에는 X사와 Y사, 두 개의 수도회사가 있다. 두 회사의 수도요금은 한 달간 수도의 사용량에 따라 다음과 같이 정해진다.
// X사 : 1리터당 A엔.
// Y사 : 기본요금은 B엔이고, 사용량이 C리터 이하라면 요금은 기본요금만 청구된다. 
//       사용량이 C리터가 넘었을 경우 기본요금 B엔에 더해서 추가요금이 붙는다. 
//       추가요금은 사용량이 C리터를 넘었을 경우 1리터를 넘었을 때마다 D엔이다.
// JOI군의 집에서 한 달간 쓰는 수도의 양은 P리터이다.
// 수도요금이 최대한 싸게 되도록 수도회사를 고를 때, JOI군의 집의 1달간 수도요금을 구하여라.
// 입력 =>
// 입력은 5줄이고 한 줄에 하나씩 정수가 입력된다.
// 첫 번째 줄에는 X사의 1리터당 요금 A가 입력된다.
// 두 번째 줄에는 Y사의 기본요금 B가 입력된다.
// 세 번째 줄에는 Y사의 요금이 기본요금이 되는 사용량의 상한 C가 입력된다.
// 네 번째 줄에는 Y사의 1리터 당 추가요금 D가 입력된다.
// 다섯 번째 줄에는 JOI군의 집에서 사용하는 한 달간 수도의 양 P가 입력된다.
// 입력되는 정수 A,B,C,D,P는 전부 1 이상 10000 이하이다.
// 출력 =>
// JOI군의 집에서 지불하는 한 달간 수도요금을 첫째 줄에 출력한다.

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y1 = sc.nextInt();
        int Y2 = sc.nextInt();
        int Y3 = sc.nextInt();
        int J = sc.nextInt();
        int Y = Y1+(J-Y2)*Y3;
        if(J>=Y2){
            Y = X*J<=Y?X*J:Y;
            System.out.print(Y);
        }else{
            Y = X*J<=Y1?X*J:Y1;
            System.out.print(Y);
        }
    }
}
