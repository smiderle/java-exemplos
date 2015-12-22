package br.com.ladair.exemplos.java.util.concurrent;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * Created by ladair.junior on 25/11/2015.
 */
public class CompletableFutureException {

    private static final ExecutorService pool = Executors.newFixedThreadPool( 1 );

    public static String getData( final int index, final int time ) throws InterruptedException {
        Thread.sleep( time );
        return "TESTE-" + index;
    }

    public static void main( String[] args ) throws InterruptedException, ExecutionException {

        System.out.println( "Processors = " + Runtime.getRuntime().availableProcessors() );

        final long start = System.nanoTime();

        final CompletableFuture<String> future = new CompletableFuture();

        CompletableFuture.runAsync( () -> {
            try {
                future.complete( getData( 0, 5000 ) );
            } catch ( InterruptedException e ) {
                future.completeExceptionally( e );
            }
        }, pool );

        future.handle( ( content, ex ) -> {
            if ( ex == null ) {
                System.out.println( content );
                long end = System.nanoTime();
                System.out.println( "Tempo decorrido (segundos) = " + ( ( end - start ) / 1.0E9 ) );
            } else {
                ex.printStackTrace();
            }
            return null;
        } );
        pool.shutdown();
    }


}



