package org.lucashos.gens;

import java.util.Random;

/**
 * Created by lucas on 26/11/16.
 */
public class Cromossomo {
    private Integer value;


    public Cromossomo() {
        Random random = new Random();
        this.value = random.nextInt(1023);
    }

    public Cromossomo(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String toByteString() {
        return balanceString(Integer.toBinaryString(getValue()), 10);
    }

    private static String balanceString(String s, int radix){
        int diff = radix - s.length();

        if(diff > 0){
            while(diff-- > 0) {
                s = "0".concat(s);
            }
        }
        return s;
    }

    @Override
    public String toString() {
        return "Cromossomo: " + getValue() + "\nBytes: " + toByteString();
    }
}
