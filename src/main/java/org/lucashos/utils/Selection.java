package org.lucashos.utils;

import org.lucashos.gens.Chromosome;

import java.util.Collections;
import java.util.List;

/**
 * Created by lucas on 26/11/16.
 */
public class Selection {

    public static List<Chromosome> noPainNoGain(List<Chromosome> chromosomes){
        Collections.sort(chromosomes);

        for(int i = 0; i < 25; i++) {
            chromosomes.remove(i);
        }
        return chromosomes;
    }
}
