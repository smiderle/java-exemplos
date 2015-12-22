package br.com.ladair.exemplos.padroes.abstractfactory;

/**
 * Created by ladair.junior on 09/11/2015.
 */
public class Chevrolet extends Fabricante {

    public Chevrolet() {
        nome = "Chevrolet";
    }

    @Override
    public Carro getCarro( String marca ) {

        if ( marca.equals( "Vectra" ) ) {
            return new Vectra();
        } else if ( marca.equals( "Omega" ) ) {
            return new Omega();
        }
        return null;
    }
}
