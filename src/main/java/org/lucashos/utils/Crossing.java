package org.lucashos.utils;

import org.lucashos.gens.Chromosome;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lucas on 26/11/16.
 */
public class Crossing {
    private static int childrenCount = 25;

    private static Chromosome getAChild(Chromosome x, Chromosome y) {
        String xBytes = x.toByteString().substring(0, 5);
        String yBytes = y.toByteString().substring(5, 10);

        return new Chromosome(Integer.parseInt(xBytes.concat(yBytes), 2));
    }

    public static List<Chromosome> cross (List<Chromosome> chromosomes) {
        List<Chromosome> children = new ArrayList<>();

        for(int i = 0; i < childrenCount; i++) {
            children.add(getAChild(Roulette.select(chromosomes),Roulette.select(chromosomes)));
        }
        chromosomes.addAll(children);
        return chromosomes;
    }

}
