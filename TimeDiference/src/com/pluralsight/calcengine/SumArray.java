package com.pluralsight.calcengine;

import javax.xml.transform.Result;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SumArray {
    public static int simpleArraySum(List<Integer> ar) {
        int ar_sum=0;
        for (int i=0;i<ar.size();){
            //for array
//            ar_sum+=ar[i];
            //for arrayList
            ar_sum+=ar.get(i);
        }
        return ar_sum;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> ar = new ArrayList<>();

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arTemp[i]);
            ar.add(arItem);
        }

        int result = Result.simpleArraySum(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
