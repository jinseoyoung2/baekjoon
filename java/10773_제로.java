import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        int N = sc.nextInt();
        for(int i=0; i<N; i++){
            int s = sc.nextInt();
            if(s!=0){
                stack.push(s);
            }else {
                stack.pop();
            }
        }
        for(int i : stack){
            res+=i;
        }
        System.out.print(res);
    }
}