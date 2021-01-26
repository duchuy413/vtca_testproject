package com.company.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumberUtil {
    public static Set<Integer> getPrimeNumberSet(){
        return getPrimeNumberSet(10000);
    }

    public static Set<Integer> getPrimeNumberSet(int MAX_SEARCH_RANGE){
//        int MAX_SEARCH_RANGE = 10000;
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

    public static List<Integer> getFibonaciList(int amount){
        int previous = 0;
        int current = 1;
        int count = 0;

        List<Integer> result = new ArrayList<Integer>();

        while (count != amount){
            int sum = previous + current;
            previous = current;
            current = sum;
            result.add(previous);
            count++;
        }

        return result;
    }
}
