package br.com.ladair.exemplos.java.math;


import java.math.BigDecimal;

/**
 * Created by ladairsmiderle on 11/11/2015.
 * Essa classe demonstra os tipos de arredondamento possiveis para o BigDecimal.
 */
public class BigDecimalRound {

    public static void main(String[] args) {

        BigDecimal bd;
        int decimalPlaces = 4;
        double valor;
        valor = -1.12345000;
      /*
      ROUND_CEILING
      Arredonda em direção ao positivo.
      */
        roundCeiling(decimalPlaces, valor);

      /*
      ROUND_DOWN
      Arredonda em direção a zero
      */
        roundDown(decimalPlaces, valor);

      /*
      ROUND_FLOOR
      Arredonda em direção ao negativo
      */
        rounFloor(decimalPlaces, valor);

      /*
      ROUND_HALF_DOWN
      Arredonda em direção ao "vizinho" mais próximo.
      Caso a distância entre os dois seja a mesma, arredonda pra baixo
      */
        roundHalfDown(decimalPlaces, valor);

      /*
      ROUND_HALF_EVEN
      Arredonda em direção ao "vizinho" mais próximo.
		Caso a distância entre os dois seja a mesma, arredonda para valor PAR
      */
        roundHalfEven(decimalPlaces, valor);

      /*
      ROUND_HALF_UP
      Arredonda em direção ao "vizinho" mais próximo.
      Caso a distância entre os dois seja a mesma, arredonda pra cima
      */
        roundHalfUp(decimalPlaces, valor);

      /*
      ROUND_UP
      Arredonda para o valor mais distante de zero
      */
        roundUp(decimalPlaces, valor);

      /*
      ROUND_UNNECESSARY
      Modo utilizado para verificar que o resultado é exato, sem necessidade de arredondamento.
      Caso esta condição não seja atendida, é lançada uma ArithmeticException
      */
        roundUnnecessary(decimalPlaces, valor);

    }

    private static void roundUnnecessary(int decimalPlaces, double valor) {
        BigDecimal bd;
        bd = new BigDecimal(valor);
        try {
            bd = bd.setScale(decimalPlaces, BigDecimal.ROUND_UNNECESSARY);
            System.out.println(valor + " ROUND_UNNECESSARY -> " + bd);
        } catch (ArithmeticException e) {
            System.out.println(valor + " ROUND_UNNECESSARY -> impossivel");
        }
    }

    private static void roundUp(int decimalPlaces, double valor) {
        BigDecimal bd;
        bd = new BigDecimal(valor);
        bd = bd.setScale(decimalPlaces, BigDecimal.ROUND_UP);
        System.out.println(valor + " ROUND_UP -> " + bd);
    }

    private static void roundHalfUp(int decimalPlaces, double valor) {
        BigDecimal bd;
        bd = new BigDecimal(valor);
        bd = bd.setScale(decimalPlaces, BigDecimal.ROUND_HALF_UP);
        System.out.println(valor + " ROUND_HALF_UP -> " + bd);
    }

    private static void roundHalfEven(int decimalPlaces, double valor) {
        BigDecimal bd;
        bd = new BigDecimal(valor);
        bd = bd.setScale(decimalPlaces, BigDecimal.ROUND_HALF_EVEN);
        System.out.println(valor + " ROUND_HALF_EVEN -> " + bd);
    }

    private static void roundHalfDown(int decimalPlaces, double valor) {
        BigDecimal bd;
        bd = new BigDecimal(valor);
        bd = bd.setScale(decimalPlaces, BigDecimal.ROUND_HALF_DOWN);
        System.out.println(valor + " ROUND_HALF_DOWN -> " + bd);
    }

    private static void rounFloor(int decimalPlaces, double valor) {
        BigDecimal bd;
        bd = new BigDecimal(valor);
        bd = bd.setScale(decimalPlaces, BigDecimal.ROUND_FLOOR);
        System.out.println(valor + " ROUND_FLOOR -> " + bd);
    }

    private static void roundDown(int decimalPlaces, double valor) {
        BigDecimal bd;
        bd = new BigDecimal(valor);
        bd = bd.setScale(decimalPlaces, BigDecimal.ROUND_DOWN);
        System.out.println(valor + " ROUND_DOWN -> " + bd);
    }

    private static void roundCeiling(int decimalPlaces, double valor) {
        BigDecimal bd;
        bd = new BigDecimal(valor);
        bd = bd.setScale(decimalPlaces, BigDecimal.ROUND_CEILING);
        System.out.println(valor + " ROUND_CEILING  -> " + bd);
    }
}
