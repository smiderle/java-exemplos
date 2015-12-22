package br.com.ladair.exemplos.padroes.abstractfactory;

/**
 * Created by ladair.junior on 09/11/2015.
 * Abstract Factory é uma fabrica de fabricas.
 *
 * Mais exemplos:
 * http://www.devmedia.com.br/padrao-abstract-factory/23030
 * http://www.guj.com.br/articles/137
 */
public class Main {

    public static void main(String args[]){
        Fabricante fabricante  = Fabricante.getInstance( "Volkswagen" );

        Carro carro = fabricante.getCarro( "Golf" );

        System.out.println( "Preço = " + carro.getPreco() );
    }


}
