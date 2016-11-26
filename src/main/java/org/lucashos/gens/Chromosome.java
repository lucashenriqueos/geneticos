package org.lucashos.gens;

import java.util.Random;

/**
 * Created by lucas on 26/11/16.
 */
public class Chromosome implements Comparable<Chromosome>{
    private Integer value;
    private Integer domain = 1023;

    public Chromosome() {
        Random random = new Random();
        this.value = random.nextInt(domain);
    }

    public Chromosome(Integer value) {
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
        return "Chromosome: " + getValue() + "\nBytes: " + toByteString();
    }

    @Override
    public int compareTo(Chromosome o) {
        return getValue().compareTo(o.getValue());
    }
}
