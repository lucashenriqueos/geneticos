package org.lucashos;

import org.lucashos.gens.Chromosome;
import org.lucashos.utils.Crossing;
import org.lucashos.utils.Mutation;
import org.lucashos.utils.Roulette;
import org.lucashos.utils.Selection;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        int populationLength = 500;
        List<Chromosome> chromosomes = prepare(populationLength);

        int cicles = 0;
        while (cicles++ < 20000 && Roulette.getMaximumValue(chromosomes) < 51150) {
            Selection.noPainNoGain(Crossing.cross(Mutation.evolve(chromosomes)));
        }

        System.out.println(chromosomes);
        System.out.println("Population size: " + chromosomes.size());

        System.out.println("\nEnded in " + cicles + " cicles.");
        System.out.println("Final count: " + Roulette.getMaximumValue(chromosomes));
    }

    private static List<Chromosome> prepare (int n) {
        List<Chromosome> chromosomes = new ArrayList<>();
        while(n-- > 0) {
            chromosomes.add(new Chromosome());
        }
        return chromosomes;
    }
}
