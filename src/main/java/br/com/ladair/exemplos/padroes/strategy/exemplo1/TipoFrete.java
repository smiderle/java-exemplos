package br.com.ladair.exemplos.padroes.strategy.exemplo1;

/**
 * Created by ladair.junior on 05/11/2015.
 */
public enum TipoFrete {

    NORMAL {
        @Override
        public Frete obterFrete() {
            return new FreteNormal();

        }
    },

    SEDEX {
        @Override
        public Frete obterFrete() {
            return new FreteSedex();
        }
    };


    public abstract Frete obterFrete();
}
