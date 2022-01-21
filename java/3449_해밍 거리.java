// https://www.acmicpc.net/problem/3449
// 문제
// 해밍 거리란 두 숫자의 서로 다른 자리수의 개수이다. 두 이진수가 주어졌을 때, 해밍 거리를 계산하는 프로그램을 작성하시오.
// 입력 =>
// 입력을 여러 개의 테스트 케이스로 이루어져 있다. 첫째 줄에는 테스트 케이스의 개수 T가 주어진다.
// 각 테스트 케이스는 두 줄로 이루어져 있다. 각 줄에는 이진수가 하나씩 주어진다. 두 이진수는 길이가 서로 같고, 100자리를 넘지 않는다.
// 출력 =>
// 각 테스트 케이스에 대해서, 해밍 거리를 계산한 뒤, "Hamming distance is X."라고 출력한다. X는 해밍 거리이다.

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0; i<T; i++){
            String h1 = sc.next();
            String h2 = sc.next();
            String[] H1 = h1.split("");
            String[] H2 = h2.split("");
            int res = 0;
            for(int j=0; j<H1.length; j++){
                if(!H1[j].equals(H2[j])){
                    res++;
                }
            }
            System.out.printf("Hamming distance is %d.%n",res);
        }
    }
}
