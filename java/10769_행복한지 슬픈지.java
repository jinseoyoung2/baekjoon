// https://www.acmicpc.net/problem/10769
// 문제
// 이모티콘은 세 개의 문자가 붙어있는 구조로 이루어져 있으며, 행복한 얼굴을 나타내는 :-) 와 슬픈 얼굴을 나타내는 :-( 가 있다.
// 문자가 오면 전체적인 분위기만 판단해서 알려주는 프로그램을 작성하고 싶다.
// 입력 =>
// 첫 줄에 최소 1개에서 최대 255개의 문자들이 입력된다.
// 출력 =>
// 어떤 이모티콘도 포함되어 있지 않으면, none 을 출력한다.
// 행복한 이모티콘과 슬픈 이모티콘의 수가 동일하게 포함되어 있으면, unsure 를 출력한다.
// 행복한 이모티콘이 슬픈 이모티콘보다 많이 포함되어 있으면, happy 를 출력한다.
// 슬픈 이모티콘이 행복한 이모티콘보다 많이 포함되어 있으면, sad 를 출력한다.

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int happy = 0;
        int sad = 0;
        for(int i=0; i<S.length()-2; i++){
            if(S.charAt(i)==':'){
                if((S.substring(i,i+3)).equals(":-)")){
                    happy++;
                }else if((S.substring(i,i+3)).equals(":-(")){
                    sad++;
                }
            }
        }
        if(happy==0&&sad==0){
            System.out.print("none");
        }else if(happy>sad){
            System.out.print("happy");
        }else if(happy<sad){
            System.out.print("sad");
        }else{
            System.out.print("unsure ");
        }
    }
}
