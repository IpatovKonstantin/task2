import java.math.*;

public class Exp3 {
    public static void main(String args[]){
        int arr[][] = new int[6][7];
        for (int i=0; i<6; i++){
            for (int j=0; j<7; j++){
               double a = Math.random()*10;
               arr[i][j] = (int) a;
            }
        }

        for (int i=0; i<6; i++){
            for (int j=0; j<7; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        int num=0;
        for (int i=0; i<6; i++) {
            int max = arr[i][0];
            for (int j = 1; j < 7; j++)
                if (arr[i][j]>max) {
                    max = arr[i][j];
                    num  = j;
                }
            arr[i][num]= arr[i][0];
            arr[i][0] = max;
        }

        System.out.println();

        for (int i=0; i<6; i++){
            for (int j=0; j<7; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
