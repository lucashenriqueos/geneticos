package org.lucashos.utils;

import org.lucashos.gens.Cromossomo;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * Created by lucas on 26/11/16.
 */
public class Roleta {
    private static int max;

    public static Cromossomo selecionar(List<Cromossomo> cromossomos){
        max = getMaximumValue(cromossomos);
        int[] apt = aptidao(cromossomos);
        return cromossomos.get(apt[new Random().nextInt(max)]);
    }

    private static int[] aptidao(List<Cromossomo> cromossomos){
        int[] pesos = new int[max];

        int pointer = 0;
        for (int i = 0; i < cromossomos.size(); i++) {
            for(int j = 0; j < cromossomos.get(i).getValue(); j++){
                pesos[pointer++] = i;
            }
        }

        return pesos;
    }

    private static int getMaximumValue(List<Cromossomo> cromossomos){
        return cromossomos.stream().mapToInt(Cromossomo::getValue).sum();
    }


}
