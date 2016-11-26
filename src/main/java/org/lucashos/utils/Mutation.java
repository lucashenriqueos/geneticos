package org.lucashos.utils;

import org.lucashos.gens.Chromosome;

import java.util.List;
import java.util.Random;

/**
 * Created by lucas on 26/11/16.
 */
public class Mutation {
    private static Double tax = 0.02;

    private static Chromosome evolveGenes(Chromosome x) {
        if(x.getValue() < 1023){
            char[] s = x.toByteString().toCharArray();

            for(int i = 0; i < 10; i ++) {
                Double random = new Random().nextDouble();
                if (random < tax) {
                    s[i] = s[i] == '1' ? '0' : '1';
                }
            }

            x.setValue(Integer.parseInt(String.valueOf(s), 2));
        }
        return x;
    }

    public static List<Chromosome> evolve(List<Chromosome> chromosomes) {
        chromosomes.forEach(Mutation::evolveGenes);
        return chromosomes;
    }

}
