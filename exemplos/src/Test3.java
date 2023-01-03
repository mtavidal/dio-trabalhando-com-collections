public class Test3 {
    public static void main(String[] args) {
        int array[][] = new int[6][6];
        int soma = 0;
        int maior = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                soma = array[i][j] + array[i+1][j] + array[i+2][j] + array[i+1][j+1] + array[i][j+2] + array[i+1][j+2] + array[i+2][j+2];
                if (soma > maior){
                    maior = soma;
                }
            }
        }
    }
}
