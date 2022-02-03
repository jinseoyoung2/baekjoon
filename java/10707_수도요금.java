import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y1 = sc.nextInt();
        int Y2 = sc.nextInt();
        int Y3 = sc.nextInt();
        int J = sc.nextInt();
        int Y = Y1+(J-Y2)*Y3;
        if(J>=Y2){
            Y = X*J<=Y?X*J:Y;
            System.out.print(Y);
        }else{
            Y = X*J<=Y1?X*J:Y1;
            System.out.print(Y);
        }
    }
}