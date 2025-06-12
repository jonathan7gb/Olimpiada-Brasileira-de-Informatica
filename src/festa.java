import java.util.Scanner;

public class festa {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        int escola = leia.nextInt();
        int supermercado = leia.nextInt();
        int lojinha = leia.nextInt();

        int maior = 0;
        int meio = 0;
        int menor = 0;

        if(escola >= 0 && supermercado >= 0 && lojinha >= 0 && escola <= 1000 && supermercado <= 1000 && lojinha <= 1000) {
            if (escola > supermercado && escola > lojinha) {
                    maior = escola;
                    if (supermercado > lojinha) {
                        meio = supermercado;
                        menor = lojinha;
                    } else {
                        meio = lojinha;
                        menor = supermercado;
                    }
                } else if (supermercado > escola && supermercado > lojinha) {
                    maior = supermercado;
                    if (escola > lojinha) {
                        meio = escola;
                        menor = lojinha;
                    } else {
                        meio = lojinha;
                        menor = escola;
                    }
                } else {
                    maior = lojinha;
                    if (escola > supermercado) {
                        meio = escola;
                        menor = supermercado;
                    } else {
                        meio = supermercado;
                        menor = escola;
                    }
                }
                if(maior == escola){
                    System.out.println(((maior - meio) + (meio - menor) + (maior - menor)));
                }else if(maior == supermercado || maior == lojinha && meio == escola){
                    System.out.println(((maior - meio) + (maior - menor) + (meio - menor)));
                }else if (maior == supermercado || maior == lojinha && menor == escola){
                    System.out.println(((meio - menor) + (maior - meio) + (maior - menor)));
                }
        }
        leia.close();
    }
}
