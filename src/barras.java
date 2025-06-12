import java.util.Scanner;

public class barras {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int n = 0;
        
        do {
            n = leia.nextInt();
        } while (n < 1 || n > 100);
        
        int[] valores = new int[n];
        int alturaMaxima = 0;
        for (int i = 0; i < n; i++) {
            valores[i] = leia.nextInt();
            if (valores[i] > alturaMaxima) {
                alturaMaxima = valores[i]; 
            }
        }

        int[][] matriz = new int[alturaMaxima][n];

        for (int j = 0; j < n; j++) {
            int quantidadeDeUns = valores[j];
            for (int i = 0; i < quantidadeDeUns; i++) {
                matriz[alturaMaxima - 1 - i][j] = 1; 
            }
        }

        for (int i = 0; i < alturaMaxima; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j]);
            }
        }

        leia.close();
    }
}