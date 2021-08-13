package com.pluralsight.calcengine;

import java.io.LineNumberInputStream;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unsorted {

    public static List<String> bigString(List<String> input){
        Collections.sort(input, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                if (a.length()>b.length())
                return 1;
                else if (a.length()<b.length())
                    return -1;
                else {
                    BigInteger b1=new BigInteger(a);
                    BigInteger b2=new BigInteger(a);
                    return b1.compareTo(b2);

                }
            }
        });
        return input;

    }
}
