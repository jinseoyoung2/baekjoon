// https://www.acmicpc.net/problem/1547
// 문제
// 먼저 1번 컵의 아래에 공을 하나 넣는다. 두 컵을 고른 다음, 그 위치를 맞바꾸려고 한다. 
// 이때 공은 움직이지 않기 때문에, 공의 위치는 맨 처음 1번 컵이 있던 위치와 같다.
// 컵의 위치를 총 M번 바꿀 것이며, 컵의 위치를 바꾼 방법이 입력으로 주어진다. 위치를 M번 바꾼 이후에 공이 들어있는 컵의 번호를 구하는 프로그램을 작성하시오.
// 입력 =>
// 첫째 줄에 컵의 위치를 바꾼 횟수 M이 주어지며, M은 50보다 작거나 같은 자연수이다. 
// 둘째 줄부터 M개의 줄에는 컵의 위치를 바꾼 방법 X와 Y가 주어지며, X번 컵과 Y번 컵의 위치를 서로 바꾸는 것을 의미한다. 
// X와 Y의 값은 3보다 작거나 같고, X와 Y가 같을 수도 있다. 컵을 이동시킨 후에 공이 컵 바깥에 있는 경우는 없다.
// 출력 =>
// 첫째 줄에 공이 들어있는 컵의 번호를 출력한다. 공이 사라져서 컵 밑에 없는 경우에는 -1을 출력한다.

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int res = 1;
        for(int i=0; i<N; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            if(A==res||B==res){
                res=A==res?B:A;
            }
        }
        System.out.println(res);
    }
}
