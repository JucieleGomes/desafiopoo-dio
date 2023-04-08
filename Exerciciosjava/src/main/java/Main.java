import java.util.Scanner;

public class Main {

    private static int Distribuidor;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o custo de fábrica: ");
        int custoFabrica = scan.nextInt();
        System.out.println("Insira a porcentagem do distribuidor: ");
        int valorDistribuidor = custoFabrica * scan.nextInt() / 100;
        System.out.println("Insira percentual de impsotos: ");
        int valorImpostos = custoFabrica * scan.nextInt() / 100;

        int valorFinalCarro;
        valorFinalCarro = custoFabrica + valorDistribuidor+valorImpostos;


        System.out.println( "O valor final do carro é "+ valorFinalCarro);


        // TODO: Implemente uma condição que calcule a porcentagem do distribuidor e dos impostos:
        //custo de fabrica = 20000, porcentagem do distribuidor = 28%, impostos: 45% //


       // Distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;


    }
}
