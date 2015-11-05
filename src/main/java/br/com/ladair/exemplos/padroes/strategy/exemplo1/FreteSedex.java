package br.com.ladair.exemplos.padroes.strategy.exemplo1;

/**
 * Created by ladair.junior on 05/11/2015.
 */
public class FreteSedex implements Frete {

    public double calculaFrete( Integer distancia ) {
        return distancia * 4.5;
    }
}
