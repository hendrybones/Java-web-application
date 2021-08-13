package com.pluralsight.calcengine;

import javax.xml.transform.Result;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int positiveCount=0;
        int negativeCount=0;
        int zeroCount=0;
        for(int n:arr){
            if(n>0){
                positiveCount++;
            }
            else if(n==0){
                zeroCount++;
            }
            else{
                negativeCount++;
            }
        }
        System.out.println((float)positiveCount/arr.size());
        System.out.println((float)zeroCount/arr.size());
        System.out.println((float)negativeCount/arr.size());
        DecimalFormat decimalFormat=new DecimalFormat("");

    }
    public static void main(String[] args) throws IOException {
        PlusMinus result=new PlusMinus();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        result.plusMinus(arr);

        bufferedReader.close();
    }

}
