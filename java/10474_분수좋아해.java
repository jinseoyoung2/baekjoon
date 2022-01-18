// https://www.acmicpc.net/problem/10474
// 문제
// 가분수를 대분수로 출력하는 부분을 개발해야 한다. 진분수는 분자가 분모보다 작은 분수이다.
// 대분수는 정수부를 따로 떼어주고 남는 부분을 진분수로 쓰는 기법이다. 27/12는 대분수로 2 3/12이다. 기약분수로 만들지 말아야 한다.
// 입력 =>
// 한 줄에 걸쳐 한 테스트 케이스가 입력된다. 각각의 테스트 케이스는 [1, 2^31 - 1]범위의 두 정수가 입력된다.
// 첫 번째 정수는 분자고 두 번째는 분모이다. "0 0" 입력이 들어오는 라인에서 입력을 종료한다.
// 출력 =>
// 각 테스트 케이스에 대해 한 줄에 걸쳐 주어진 입력에 맞는 대분수를 공백토큰으로 구분하여 출력하라.
    
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int T1 = sc.nextInt();
            int T2 = sc.nextInt();
            if(T1==0&&T2==0){
                break;
            }
            System.out.println(T1/T2+" "+T1%T2+" / "+T2);
        }
    }
}
