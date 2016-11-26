package org.lucashos.utils;

import org.lucashos.gens.Cromossomo;

import java.util.Random;

/**
 * Created by lucas on 26/11/16.
 */
public class Mutacao {
    private static Double taxa = 0.02;

    public static Cromossomo go(Cromossomo x) {
        char[] s = x.toByteString().toCharArray();

        for(int i = 0; i < 10; i ++) {
            Double random = new Random().nextDouble();
            if (random < taxa) {
                s[i] = s[i] == '1' ? '0' : '1';
            }
        }

        x.setValue(Integer.parseInt(String.valueOf(s), 2));
        return x;
    }
}
