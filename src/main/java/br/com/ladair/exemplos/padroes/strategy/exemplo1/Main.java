package br.com.ladair.exemplos.padroes.strategy.exemplo1;

import java.util.Scanner;

/**
 * Created by ladair.junior on 05/11/2015.
 */
public class Main {


    public static void main( String args[] ) {


        try ( Scanner entrada = new Scanner( System.in ) ) {

            int distancia = entrada.nextInt();
            System.out.print( "Qual o tipo de frete (1) Normal, (2) Sedex: " );
            int opcaoFrete = entrada.nextInt();

            TipoFrete freteType = TipoFrete.values()[ opcaoFrete - 1 ];
            Frete frete = freteType.obterFrete();

            double preco = frete.calculaFrete( distancia );
            System.out.printf( "O valor total é de R$%.2f", preco );

        }


    }
}
