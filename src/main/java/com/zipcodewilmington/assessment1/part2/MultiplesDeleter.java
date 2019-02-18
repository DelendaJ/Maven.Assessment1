package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {


        Integer allOdds = 0;

        for (Integer i = 0; i < ints.length; i++) {
            if (ints[i] % 2 == 0) {
                allOdds++;
            }
        }
        Integer[] oddArray = new Integer[allOdds];
        Integer oddIndex = 0;
        for (Integer i = 0; i < ints.length; i++) {
            if (ints[i] % 2 != 0) {
                oddArray[oddIndex] = ints[i];
                oddIndex++;
            }
        }
        Arrays.sort(oddArray);


return oddArray;
}


    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        Integer allEvens = 0;

        for (Integer i = 0; i < ints.length; i++) {
            if (ints[i] % 2 == 0) {
                allEvens++;
            }
        }
        Integer[] evenArray = new Integer[allEvens];
        Integer evenIndex = 0;
        for (Integer i = 0; i < ints.length; i++) {
            if (ints[i] % 2 == 0) {
                evenArray[evenIndex] = ints[i];
                evenIndex++;
            }
        }
        Arrays.sort(evenArray);

        return evenArray;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {

        Integer noThrees = 0;

        for (Integer i = 0; i < ints.length; i++) {
            if (ints[i] % 2 == 0) {
                noThrees++;
            }
        }
        Integer[] noThreesArr = new Integer[noThrees];
        Integer threes = 0;
        for (Integer i = 0; i < ints.length; i++) {
            if (ints[i] % 3 != 0) {
                noThreesArr[threes] = ints[i];
                threes++;
            }
        }
        Arrays.sort(noThreesArr);


        return noThreesArr;

    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {

        Integer noMultiple = 0;

        for (Integer i = 0; i < ints.length; i++) {
            if (ints[i] % multiple == 0) {
                noMultiple++;
            }
        }
        Integer[] noMultiples = new Integer[noMultiple];
        Integer blah = 0;
        for (Integer i = 0; i < ints.length; i++) {
            if (ints[i] % multiple != 0) {
                noMultiples[blah] = ints[i];
                blah++;
            }
        }
        Arrays.sort(noMultiples);

        return noMultiples;
    }
}
