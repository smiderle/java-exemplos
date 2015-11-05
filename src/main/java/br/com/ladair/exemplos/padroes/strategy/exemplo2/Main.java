package br.com.ladair.exemplos.padroes.strategy.exemplo2;

/**
 * Created by ladair.junior on 05/11/2015.
 */
public class Main {

    public static void main(String args[]){

        String text = "Esse é um exemplo do padrão estrategy";
        String expected = "exemplo";

        boolean begins = TextFinder.findText( text, expected, SearchCriteria.BEGINS );
        boolean endwith = TextFinder.findText( text, expected, SearchCriteria.ENDS );

    }

}
