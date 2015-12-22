package br.com.ladair.exemplos.padroes.abstractfactory;

/**
 * Created by ladair.junior on 09/11/2015.
 */
public abstract class Fabricante {

    protected String nome;

    public abstract Carro getCarro( String marca );

    public static Fabricante getInstance( String fabricante ) {

        if ( fabricante.equals( "Volkswagen" ) ) {
            return new Volkswagen();
        } else if ( fabricante.equals( "Chevrolet" ) ) {
            return new Chevrolet();
        }

        return null;

    }
}
