package org.example;

public class Solution {
    public static int zeros(int n) {
        int k = 0;
        for (int i = 5; i < Integer.MAX_VALUE / 5; i *= 5) {
            k = k + n / i;
        }
        return k;
    }
}


/*
            fact = fact.multiply(BigInteger.valueOf(j));
                    if (fact.remainder(BigInteger.valueOf(10)).equals(BigInteger.ZERO)) {
                    while (fact.remainder(BigInteger.valueOf(10)).equals(BigInteger.ZERO)) {
                    count++;
                    fact = fact.divide(BigInteger.valueOf(10));
                    }
*/
/*                int sbs = String.valueOf(j).length();
                String factS = String.valueOf(fact);
                factS = factS.substring(factS.length() - sbs);
                fact = Integer.valueOf(factS);*//*

                    }*/
