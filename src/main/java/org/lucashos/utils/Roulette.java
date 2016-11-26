package org.lucashos.utils;

import org.lucashos.gens.Chromosome;

import java.util.List;
import java.util.Random;

/**
 * Created by lucas on 26/11/16.
 */
public class Roulette {
    private static int max;

    public static Chromosome select(List<Chromosome> chromosomes){
        max = getMaximumValue(chromosomes);
        int[] apt = aptitude(chromosomes);
        return chromosomes.get(apt[new Random().nextInt(max)]);
    }

    private static int[] aptitude(List<Chromosome> chromosomes){
        int[] weight = new int[max];

        int pointer = 0;
        for (int i = 0; i < chromosomes.size(); i++) {
            for(int j = 0; j < chromosomes.get(i).getValue(); j++){
                weight[pointer++] = i;
            }
        }

        return weight;
    }

    public static int getMaximumValue(List<Chromosome> chromosomes){
        return chromosomes.stream().mapToInt(Chromosome::getValue).sum();
    }


}
