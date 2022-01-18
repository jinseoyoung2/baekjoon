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