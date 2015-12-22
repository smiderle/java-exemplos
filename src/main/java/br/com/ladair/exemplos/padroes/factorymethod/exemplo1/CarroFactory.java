package br.com.ladair.exemplos.padroes.factorymethod.exemplo1;

/**
 * Created by ladair.junior on 09/11/2015.
 *
 * Padrão Factory Method - Provê uma classe de decisão, na qual retorna uma das possiveis subclasses
 * de uma classe base abstrata, dependendo do parametro fornecido.
 */
public class CarroFactory {

    public static Carro getCarro( String tipoCarro ) {

        if ( tipoCarro == null ) {
            throw new IllegalArgumentException( "Tipo do carro precisa ser passado por parametro" );
        }

        if ( tipoCarro.equals( "Vectra" ) ) {
            return new Vectra();
        } else if ( tipoCarro.equals( "Golf" ) ) {
            return new Golf();
        } else {
            return null;
        }

    }
}
