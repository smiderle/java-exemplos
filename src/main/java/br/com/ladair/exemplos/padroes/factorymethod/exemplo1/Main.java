package br.com.ladair.exemplos.padroes.factorymethod.exemplo1;

/**
 * Created by ladair.junior on 09/11/2015.
 */
public class Main {

    public static void main( String args[] ) {
        Carro carro = CarroFactory.getCarro( "Vectra" );

        System.out.println( "Preço = " + carro.getPreco() );
    }
}
