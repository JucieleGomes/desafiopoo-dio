// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  

import java.util.Scanner;

public class DIO {

    public static void main(String[] Args) {

        double h = 1;
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        for (int i = 1; i <= n; i++) {

            if(i >= 2) {
                h = h + (1.0 / i);
            }
            //TODO: Calcule o valor de H de forma que resulte na soma dos termos:

        }

        System.out.println(String.format("%.0f", h));
        //TODO: Imprima a soma dos termos, considerando um resultado com duas casas decimais:

    }
}