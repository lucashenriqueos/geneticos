package org.lucashos.utils;

import org.lucashos.gens.Cromossomo;

/**
 * Created by lucas on 26/11/16.
 */
public class Cruzamento {
    public static Cromossomo cruzar(Cromossomo x, Cromossomo y) {
        String xBytes = x.toByteString().substring(0, 5);
        String yBytes = y.toByteString().substring(5, 10);

        return new Cromossomo(Integer.parseInt(xBytes.concat(yBytes), 2));
    }

}
