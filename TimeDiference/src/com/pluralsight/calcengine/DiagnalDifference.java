package com.pluralsight.calcengine;

import javax.xml.transform.Result;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DiagnalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        // array that will store the diff of the matrice
        int firstDiagonal = 0;
        int secondDiagonal = 0;

        for (int i = 0; i < arr.size(); i++) {
            firstDiagonal += arr.get(i).get(i);
        }
        for (int i = 0; i < arr.size(); i++) {
            secondDiagonal += arr.get(i).get(arr.size() - (i + 1));
        }
        return Math.abs(firstDiagonal - secondDiagonal);
    }
        public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        int result = Result.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
