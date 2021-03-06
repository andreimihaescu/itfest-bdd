package com.db.gt.itfest.numbers;

import java.util.List;

class Numbers {

    private List<Integer> array;
    private int a,b;

    Numbers(List<Integer> array) {
        this.array = array;
    }

    Numbers(int a, int b) {
        this.a = a;
        this.b = b;
    }

    float calculate() {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return ((float) sum / array.size());
    }

    /**
     * Given an array of ints, return true if one of the first 4 elements in the array is a 9.
     * The array length may be less than 4.
     */
    boolean arrayFrontNine() {
        int end = array.size();
        if (end > 4) end = 4;

        for (int i = 0; i < end; i++) {
            if (array.get(i) == 9) return true;
        }

        return false;
    }

    int closerTo(Integer closer) {
        int aDiff = Math.abs(a - closer);
        int bDiff = Math.abs(b - closer);

        if (aDiff < bDiff) {
            return a;
        }
        if (bDiff < aDiff) {
            return b;
        }
        return 0;
    }

    boolean noTriples() {
        for (int i=0; i < (array.size()-2); i++) {
            int first = array.get(i);
            if (array.get(i+1).equals(first) && array.get(i+2).equals(first)) return false;
        }
        return true;
    }
}
