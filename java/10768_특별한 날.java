import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        if(month==2&&day==18){
            System.out.print("Special");
        }else if((month<=2&&day<18)||month==1){
            System.out.print("Before");
        }else{
            System.out.print("After");
        }
    }
}