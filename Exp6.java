import java.util.Scanner;

public class Exp6 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String a = sc.next();
        String arr1[] = {"X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String arr2[] = {"I","II","III","IV","V","VI","VII","VIII","IX"};
        int g=(int)a.charAt(0)-'0';
        int h=(int)a.charAt(1)-'0';
        System.out.print(arr1[g-1]+""+arr2[h-1]);
    }
}
