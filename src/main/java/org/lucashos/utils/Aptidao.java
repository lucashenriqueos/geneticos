package org.lucashos.utils;

import org.lucashos.gens.Cromossomo;

import java.util.List;

/**
 * Created by lucas on 26/11/16.
 */
class Aptidao {

    private static int[] aptidao(List<Cromossomo> cromossomos, int max){
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
