// https://www.acmicpc.net/problem/5217
// 문제
// 1보다 크거나 같고 12보다 작거나 같은 자연수 n이 주어졌을 때, 합이 n이 되는 두 자연수의 쌍을 찾는 프로그램을 작성하시오.
// 두 수는 항상 달라야 한다. 또, 첫 번째 수가 두 번째 수보다 작아야 한다.
// 출력하는 쌍은 항상 사전순으로 출력해야 한다. 즉, 각 쌍의 작은 수로 비교를 해야 한다.
// 입력 =>
// 첫째 줄에 테스트 케이스의 수 (< 100)가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, n이 주어진다.
// 출력 =>
// 각 테스트 케이스마다 n을 만드는 쌍을 사전순으로 출력한다. n을 만드는 쌍이 없는 경우에는 아무것도 출력하지 않는다.
    
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0; i<T; i++){
            int N = sc.nextInt();
            int num = 1;
            System.out.printf("Pairs for %d: ",N);
            for(int j=0; j<((N-1)/2); j++){
                if(j>0){
                    System.out.print(", ");
                }
                System.out.print(num+" "+(N-num));
                num++;
            }
            System.out.println();
        }
    }
}
