package br.com.ladair.exemplos.padroes.strategy.exemplo2;

/**
 * Created by ladair.junior on 05/11/2015.
 */
public class TextFinder {


    public static boolean findText( String text, String expected, SearchCriteria criteria ) {
        return criteria.doVerify( text, expected );
    }
}
