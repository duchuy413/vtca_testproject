package com.company.util;

import java.util.HashSet;
import java.util.Set;

public class NumberUtil {

    public static Set<Integer> getPrimeNumberSet(){
        int MAX_SEARCH_RANGE = 10000;
        int n = ConsoleUtil.inputInt("n");

        Set<Integer> composites = new HashSet<Integer>();
        Set<Integer> primes = new HashSet<Integer>();

        for (int i = 2; i < MAX_SEARCH_RANGE; i++) {
            if (composites.contains(i)) {
                continue;
            }else{
                primes.add(i);
                int factor = 2;
                int composite = 0;
                while(true) {
                    composite = factor * i;
                    if (composite > MAX_SEARCH_RANGE) {
                        break;
                    }
                    composites.add(composite);
                    factor++;
                }
            }
        }

        return primes;
    }
}
