// https://www.acmicpc.net/problem/10039
// 문제
//  40점 미만인 학생들은 항상 40점을 받게 된다. 학생 5명의 점수가 주어졌을 때, 평균 점수를 구하는 프로그램을 작성하시오.
// 입력 =>
// 입력은 총 5줄로 이루어져 있고, 5개의 점수가 순서대로 주어진다.
// 점수는 모두 0점 이상, 100점 이하인 5의 배수이다. 따라서, 평균 점수는 항상 정수이다. 
// 출력 =>
// 첫째 줄에 학생 5명의 평균 점수를 출력한다.

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i=0; i<5; i++){
            int N = sc.nextInt();
            sum+= N<40?40:N;
        }
        System.out.print(sum/5);
    }
}
