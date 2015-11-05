package br.com.ladair.exemplos.padroes.strategy.exemplo2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ladair.junior on 05/11/2015.
 */
public enum SearchCriteria {

    BEGINS {
        @Override
        public boolean doVerify( String text, String expected ) {
            return text.substring( 0, expected.length() ).equals( expected );
        }
    },


    ENDS {
        @Override
        public boolean doVerify( String text, String expected ) {
            return text.endsWith( expected );
        }
    },


    CONTAINS {
        @Override
        public boolean doVerify( String text, String expected ) {
            return text.contains( expected );
        }
    },


    EQUALS {
        @Override
        public boolean doVerify( String text, String expected ) {
            return text.equals( expected );
        }
    },


    REGEX {
        @Override
        public boolean doVerify( String text, String expected ) {
            Matcher matcher = Pattern.compile( expected ).matcher( text );
            return matcher.find();
        }
    };


    public final boolean verify( String text, String expected ) {

        if ( text == null )
            throw new IllegalArgumentException( "Text cannot be null" );

        if ( expected == null )
            throw new IllegalArgumentException( "Expected text cannot be null" );

        return doVerify( text, expected );

    }


    public abstract boolean doVerify( String text, String expected );
}
