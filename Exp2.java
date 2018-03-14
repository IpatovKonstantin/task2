public class Exp2 {
    public static void main(String args[]){
        int summ=0;
        for (int i = 0; i<5; i++){
            for (int j = 0; j<=9; j++){
                for (int k = 0; k<=9; k++){
                    for (int l = 0; l<=9; l++) {
                        for (int h = 0; h<=9; h++) {
                            if ((i == 2) || (j == 2) || (k == 2) || (l == 2) || (h==2))
                                summ++;
                        }
                    }
                }
            }
        }
        System.out.println(summ);
    }
}
