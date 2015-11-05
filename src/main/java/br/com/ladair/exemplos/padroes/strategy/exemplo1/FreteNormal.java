package br.com.ladair.exemplos.padroes.strategy.exemplo1;

/**
 * Created by ladair.junior on 05/11/2015.
 */
public class FreteNormal implements Frete {
    public double calculaFrete( Integer distancia ) {
        return distancia * 2.5;
    }
}
