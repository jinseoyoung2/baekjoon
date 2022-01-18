import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String[] Si = S.split(",");
        int res = 0;
        for(String i : Si){
            res+=Integer.valueOf(i);
        }
        System.out.print(res);
    }
}