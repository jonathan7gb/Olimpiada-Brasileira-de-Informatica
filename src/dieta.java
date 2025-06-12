import java.util.Scanner;

public class dieta {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        int n = leia.nextInt();
        int m = leia.nextInt();
        int p = 0;
        int g = 0;
        int c = 0;
        int conta = 0;

       if(n >= 1 && m > 1 && n <= 30 && m <= 300000){
            for(int i = 1; i <= n; i++){
                p = leia.nextInt();
                g = leia.nextInt();
                c = leia.nextInt();

                if(p >= 0 && p <= 500 && g >= 0 && g <= 500 && c >= 0 && c <= 500) {
                   conta = conta + (p * 4) + (g * 9) + (c * 4);
                }
            }
       }    
       
        if(conta <= m){
            System.out.println((m - conta));
        }
        leia.close();
    }
}
