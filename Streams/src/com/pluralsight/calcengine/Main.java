package com.pluralsight.calcengine;
import java.io.*;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void simpleFileCopy() throws IOException {
        long starTime=System.nanoTime();
        FileInputStream fileInputStream=new FileInputStream("file1.txt");
        FileOutputStream fileOutputStream=new FileOutputStream("fileReceive.txt");

        int c;
        while((c=fileInputStream.read()) !=-1)//looping input reading
        {
            fileOutputStream.write(c);//write the output for every read

        }
        fileInputStream.close();
        fileOutputStream.close();
        long endTime =System.nanoTime();
        long totalTime=endTime-starTime;
        System.out.println("simpleFileCopy" + " " +totalTime);


    }
    private static void LargeFIle() throws IOException {
        long startTime=System.nanoTime();
        FileInputStream fileInputStream=new FileInputStream("LargeData.txt");
        FileOutputStream fileOutputStream=new FileOutputStream("LargeDatDest.txt");

        int c;
        while((c=fileInputStream.read()) !=-1)//looping input reading large data
        {
            fileOutputStream.write(c);//write the output for every read

        }
        fileInputStream.close();
        fileOutputStream.close();
        long endTime =System.nanoTime();
        long totalTime=endTime-startTime;
        System.out.println("LargeFile" + " " +totalTime);

    }


    private static void advancedFileCopy() throws IOException {
        long staTim=System.nanoTime();
        FileReader fileReader = new FileReader("LargeData.txt");
        FileWriter fileWriter = new FileWriter("LargeDatDest.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String s;
        while ((s = bufferedReader.readLine()) != null)
            bufferedWriter.write(s + "\n");
        fileReader.close();
        fileWriter.close();
        long enTim =System.nanoTime();
        long totalTime=enTim-staTim;
        System.out.print("advancedFileCopy:" + " " +totalTime);

    }

    public static void main(String[] args) throws IOException {

        simpleFileCopy();
        LargeFIle();
        advancedFileCopy();


    }
}
