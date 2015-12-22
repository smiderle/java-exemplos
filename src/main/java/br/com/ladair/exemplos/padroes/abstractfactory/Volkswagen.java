package br.com.ladair.exemplos.padroes.abstractfactory;


/**
 * Created by ladair.junior on 09/11/2015.
 */
public class Volkswagen extends Fabricante {

    public Volkswagen() {
        nome = "Volkswagen";
    }

    @Override
    public Carro getCarro( String marca ) {

        if ( marca.equals( "Golf" ) ) {
            return new Golf();
        } else if ( marca.equals( "Gol" ) ) {
            return new Gol();
        }

        return null;
    }
}
