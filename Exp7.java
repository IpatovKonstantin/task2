import java.util.Scanner;

public class Exp7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str[] = new String[100];
        int c[] = new int[n];

        for (int i = 0; i<n; i++){
            str[i] = sc.next();
            c[i] = sc.nextInt();
        }

        for (int i = 0; i<n-1; i++){
            String max1=str[i];
            int max2=c[i];
            for (int j = i+1; j<n; j++){
                if(max2>c[j]){
                    str[i] = str[j];
                    c[i] = c[j];
                    max1 = str[j];
                    max2 = c[j];

                }
            }
        }
        for (int i = n-1; i>=0; i--)
            System.out.println(str[i]);
    }
}
