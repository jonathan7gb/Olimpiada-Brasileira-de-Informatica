import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class cafeteria {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int a = leia.nextInt();
        int b = leia.nextInt();
        int c = leia.nextInt();
        int d = leia.nextInt();
        int conta = 0;
        int o = 0;
        boolean consegueFazer = false;

        
        if(c >= 100 && c <= 500 && d >= 10 && d <= 100 && a >= 0 && b >= a && c > b){
            List <Integer> multiplos = new ArrayList<>();
            conta = c - d;

            while (o < c){
                o++;
                if(o % d == 0) {
                    multiplos.add(o);
                }
            }

            if(a == b){
                 conta = c - b;
                 if(conta % d == 0){
                    consegueFazer = true;
                 }
            }
            else if(c > b && b > a) {
                for(int u = 0; u < multiplos.size(); u++){
                    int multiplo = multiplos.get(u);
                    conta = c - multiplo;
                    if(conta >= a && conta <= b) {    
                        for(int i = a ; i <= b; i++){
                             if(i + multiplo == c){
                                consegueFazer = true;
                            }
                        }
                    }
                }
        }

            if(consegueFazer != false){
                System.out.println("S");
            }else{
                System.out.println("N");
            }

            leia.close();
        }
    }
}

