import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     //умножить а на б без умножения
        Scanner ok=new Scanner(System.in);
        System.out.println("введите число а");
        int a = ok.nextInt();
        int result=0;
        System.out.println("введите число b");
        int b = ok.nextInt();
        for (int i = 0;i<b;i++){
            result+=a;
        }
        System.out.println(result);

    }
}