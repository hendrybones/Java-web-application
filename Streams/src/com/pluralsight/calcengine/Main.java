package com.pluralsight.calcengine;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
    private  static void performanceFileCopy() throws IOException {
        simpleFileCopy();
        LargeFIle();
        advancedFileCopy();

    }

    public static void main(String[] args) throws IOException, ParseException {
        Scanner scanner=new Scanner(System.in);


        System.out.println("enter registration no");
        String regNo=scanner.nextLine();


        System.out.println("enter your course");
        String course=scanner.nextLine();

        System.out.println("enter your gender (male or female)");
        String gender=scanner.nextLine();
        Gender g=Gender.valueOf(gender);


        System.out.println("enter date of birth");
        String date=scanner.nextLine();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MM-yyyy");
        Date dateOfBirth=simpleDateFormat.parse(date);




        System.out.println("enter date of Admission ");
        String da=scanner.nextLine();
        SimpleDateFormat DateFormat=new SimpleDateFormat("dd-MM-yyyy");
        Date dateOfAdmission=DateFormat.parse(da);



        Student s=new Student(regNo,g,dateOfBirth,course,dateOfAdmission);
        System.out.println(s);






    }
}
