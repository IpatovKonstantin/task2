import java.util.Scanner;

public class Exp5 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((a+b>c) || (a+c>b) || (b+c>a)) {
            int max = a;
            int k = b;
            int h = c;
            if (b > max) {
                max = b;
                k = a;
                h = c;
            }
            if (c > max) {
                max = c;
                h = a;
                k=b;
            }
            if (max*max==k*k+h+h)
                System.out.println("Прямоугольный");
            if (max*max<k*k+h+h)
                System.out.println("Остроугольный");
            if (max*max>k*k+h+h)
                System.out.println("Тупоугольный");
        }
    }
}
