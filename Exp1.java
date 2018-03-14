import java.math.*;

public class Exp1 {
    public static void main(String args[]){
        double a = 0;
        double b = 5;
        double c = 2;
        double D = b*b - 4*a*c;
        if (D<0){
            System.out.println("нет корней");
        }
        else{
            if (a!=0) {
                if (D == 0) {
                    double x1 = (-b + Math.sqrt(D)) / (2 * a);
                    System.out.println("корень уравнения" + x1);
                } else {
                    double x1 =  (-b + Math.sqrt(D)) / (2 * a);
                    double x2 =  (-b - Math.sqrt(D)) / (2 * a);
                    System.out.println("корни уравнения: " + x1 + " " + x2);
                }
            }
            else {
                double x1 = -c/b;
                System.out.println("корень уравнения "+x1);
            }
        }

    }
}
