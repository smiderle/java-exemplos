package br.com.ladair.exemplos.java.util.concurrent;


import java.util.Random;
import java.util.concurrent.CompletableFuture;

/**
 * Created by ladair.junior on 25/11/2015.
 */
public class CompletableFutureExemplo {

    public static void main( String... args ) throws InterruptedException {

        CompletableFuture<String> c1 = CompletableFuture
                    .supplyAsync( () -> getValor( 4 ) )
                    .thenApply( i -> String.valueOf( i ));

        c1.exceptionally( ex -> {

            System.out.println( "ex = " + ex );

           return "Erro";
        }).thenAccept( str -> System.out.println( "str = " + str ) ) ;
    }



    public static int getValor(int tempo) {
        Integer i = new Random().nextInt( 1000 );
        System.out.println( "valor original = " + i );
        try {
            Thread.sleep( tempo * 1000 );
            System.out.println( "valor original = " + i );
        } catch ( InterruptedException e ) {
            e.printStackTrace();
        }
        return i;
    }


}
