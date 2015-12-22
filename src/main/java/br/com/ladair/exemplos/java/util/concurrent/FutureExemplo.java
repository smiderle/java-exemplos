package br.com.ladair.exemplos.java.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by ladair.junior on 25/11/2015.
 */
public class FutureExemplo {

    private static final ExecutorService poll = Executors.newFixedThreadPool( 2 );

    public static Callable<String> getDate( final int index, final int time ) {
        return new Callable<String>() {
            @Override
            public String call() throws Exception {

                Thread.sleep( time );

                return " TESTE  - " + index;
            }
        };
    }


    public static void main( String[] args ) throws ExecutionException, InterruptedException {

        System.out.println( "Processors = " + Runtime.getRuntime().availableProcessors() );
        long start = System.nanoTime();

        Callable<String> c1 = getDate( 0, 2000 );
        Callable<String> c2 = getDate( 1, 3000 );

        Future<String> f1 = poll.submit( c1 );
        Future<String> f2 = poll.submit( c2 );

        System.out.println( f1.get() );
        System.out.println( f2.get() );

        long end = System.nanoTime();
        System.out.println( "Tempo decorrido = " + ( end - start ) / 1.0E9 );
        poll.shutdown();


    }

}
