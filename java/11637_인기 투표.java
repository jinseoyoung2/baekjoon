// https://www.acmicpc.net/problem/11637
// 문제
// 당내 최고의원이 되기위해선 과반수의 표를 받아야 하기 때문에 현재의 인기 투표 결과를 보고 본 최고의원 선거를 준비하려 한다. 
// 누가 최고 득표자인지, 받은 투표수가 과반수득표인지 아닌지를 빠르게 판단할수 있도록 도와주자.
// 입력 =>
// 맨 위 첫 번째 줄에 T(1 <T< 500)는 테스트케이스 수를 의미한다.
// 각 테스트 케이스의 첫 번째 줄에는 n이 주어지고 n은 후보자 수를 의미하며, 다음 n줄에는 순서대로 각 후보자가 받은 득표 수를 입력받는다.
// 후보자는 최소 2명에서 10명보다 많지 않으며, 득표 수는 50000표를 넘지 않으며,
// 후보자들은 분명 자기 자신을 찍기 때문에 최소 1표 이상은 받게된다.
// 출력 =>
// 각 테스트 케이스는 첫 번째 줄부터 순서대로 출력된다. 최다 득표자가 과반수 득표를 했을경우에는 "majority winner R",
// 절반 이하의 득표를 하였을 경우엔 "minority winner R"가 되며, 최다 득표자가 없을때(최다 득표자가 1명 초과일 경우)  "no winner"를 출력한다.
// 이때 R은 최다 득표자의 후보자 번호를 의미하며, 후보자의 번호는 각 케이스에서 1, 2, . . . , n 으로 부여된다.

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int f1 = sc.nextInt();
        for(int i=0; i<f1; i++){
            int f2 = sc.nextInt();
            int[] A = new int[f2];
            int B = 0;
            for(int j=0; j<f2; j++){
                A[j] = sc.nextInt();
                B = A[B]>A[j]?B:j;
            }
            Arrays.sort(A);
            if(A[f2-1]==A[f2-2]){
                System.out.println("no winner");
            }else if(Arrays.stream(A).sum()/2<A[f2-1]){
                System.out.println("majority winner "+(B+1));
            }else{
                System.out.println("minority winner "+(B+1));
            }
        }
    }
}
