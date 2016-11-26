package org.lucashos;

import org.lucashos.gens.Cromossomo;
import org.lucashos.utils.Mutacao;
import org.lucashos.utils.Roleta;

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
        List<Cromossomo> cromos = prepare(5);

    }

    private static List<Cromossomo> prepare (int n) {
        List<Cromossomo> cromos = new ArrayList<>();
        while(n-- > 0) {
            cromos.add(new Cromossomo());
        }
        return cromos;
    }
}
