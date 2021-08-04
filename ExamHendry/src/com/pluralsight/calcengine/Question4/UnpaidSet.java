package com.pluralsight.calcengine.Question4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class UnpaidSet {

      public static void main(String args[]) {
        int[] i = {1, 2, 1, 2, 5, 6, 1, 2, 8, 9, 5, 6, 8, 9};
        Set<Integer> set = new TreeSet<>();

        for (int e : i) {
            set.add(e);
        }
        // create an ArrayList to store all unique set values
        //   use Iterator to loop through ArrayList

        ArrayList ar = new ArrayList<>(set);
        Iterator it = ar.iterator();

// create index variable to loop through the str array
        int index = 0;

// create String array str with the size of the set
        String[] str = new String[set.size()];

        while (it.hasNext() && index < set.size()) {
            str[index] = it.next().toString();
            index++;
        }
        System.out.println(ar);
    }
}
