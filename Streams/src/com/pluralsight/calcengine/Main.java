package com.pluralsight.calcengine;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.ListIterator;
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
    private static void studentDetails() throws ParseException {
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
        Student s=new Student(regNo,g,dateOfBirth,dateOfAdmission);
        System.out.println(s);


    }

    public static void main(String[] args) throws IOException, ParseException, ClassNotFoundException {
        int choice;
        Scanner scanner;


        System.out.println("Welcome to student registration \n");
        do {
            System.out.println("\n1. Add Student\n" +
                    "2. Delete Student\n" +
                    "3. search Student\n" +
                    "4. View Students\n" +
                    "0. Exit\n");

            scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice)
            {
                case 1:
                    Student s = getStudentDetails(scanner);
                    writeToFile(s);
                    break;
                case 2:
                    System.out.println("enter record to delete");
                    String search=scanner.nextLine();
                    ArrayList<Student> student=new ArrayList<Student>();

                    writeFile(student);

                    for (int i=0;i<student.size();i++){
                        if (student.get(i).equals(search)){
                            student.remove(i);
                            writeFile(student);
                        }
                    }


/*
                    File file=new File("student.txt");
                    ArrayList<Student> student=new ArrayList<Student>();
                    ObjectOutputStream oos=null;
                    ObjectInputStream ios=null;
                    ListIterator li=null;
                    if (file.isFile()){
                        ios=new ObjectInputStream(new FileInputStream(file));
                        student=(ArrayList<Student>) ios.readObject();
                        ios.close();

                    }
                    boolean found=false;
                    System.out.println("enter details to delete");
                    String de=scanner.nextLine();
                    li=student.listIterator();
                    while (li.hasNext()){
                        Student stud=(Student)li.next();
                        li.remove();
                        found=true;
                    }
                    if (!found){
                        System.out.println("details not found");
                    }
                    oos=new ObjectOutputStream(new FileOutputStream(file));
                    oos.writeObject(student);
                    oos.close();
*/
                    break;
                case 3:
                    System.out.println("enter regNo to search");
                    String regNo =scanner.next();
                    String line=" ";
                    try {
                        FileInputStream fin=new FileInputStream("student.txt");
                        Scanner sc=new Scanner(fin);
                        while (sc.hasNextLine()){
                            line=sc.nextLine();
                            if (line.startsWith(regNo))
                                System.out.println(line);
                        }
                        sc.close();

                    }catch (IOException ioe){
                        ioe.printStackTrace();
                    }

                    break;
                case 4:
                    readStudent();
                    break;
                case 5:
                    break;
            }
        }
            while (choice != 0) ;
        }

    private static void writeFile(ArrayList<Student> student) {
        try {
            BufferedWriter writer=new BufferedWriter(new FileWriter("student.txt"));
            for (Student x: student){
                writer.write(String.valueOf(x));
                writer.newLine();
            }
            writer.close();
        }catch (IOException ioe){
            ioe.getStackTrace();
        }
    }


    private static void readStudent () throws IOException, ParseException {
                StringBuilder stringBuilder = new StringBuilder();

                FileInputStream fileInputStream = new FileInputStream("student.txt");
                int c;
                while ((c = fileInputStream.read()) != -1) {

                    char ch = (char) c;
                    if (ch != '\n')
                        stringBuilder.append(ch);
                    else {
                        parseStudent(stringBuilder);
                        stringBuilder = new StringBuilder();
                    }

                }
                if (stringBuilder.length() > 0) {
                    parseStudent(stringBuilder);
                    System.out.println(stringBuilder);

                }
                fileInputStream.close();
            }

            private static void parseStudent (StringBuilder stringBuilder) throws ParseException {
                String[] studentData = stringBuilder.toString().split(",");
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
                Student s = new Student(studentData[0].trim(),Gender.valueOf(studentData[1].trim()), simpleDateFormat.parse(studentData[2].trim()),
                        simpleDateFormat.parse(studentData[3].trim()));
                System.out.println(s);
            }

            private static Student getStudentDetails (Scanner scanner) throws ParseException {
                System.out.println("provide student details below \n");
                System.out.println("enter registration number");
                String regNo = scanner.nextLine();
                System.out.println("enter your gender");
                String gender = scanner.nextLine();
                Gender g = Gender.valueOf(gender);
                System.out.println("enter date of birth");
                String date = scanner.nextLine();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
                Date dateOfBirth = simpleDateFormat.parse(date);
                System.out.println("enter date of Admission ");
                String da = scanner.nextLine();
                SimpleDateFormat DateFormat = new SimpleDateFormat("dd-MM-yyyy");
                Date dateOfAdmission = DateFormat.parse(da);
                Student s = new Student(regNo, g, dateOfBirth, dateOfAdmission);
                return s;
            }

            private static void writeToFile (Student s) throws IOException {
                FileOutputStream fileOutputStream = new FileOutputStream("student.txt", true);
                /* String toWrite="\n" + s.toString(); */
                for (int i = 0; i < s.toString().length(); i++) {
                    fileOutputStream.write(s.toString().charAt(i));

                }
                char newline = '\n';
                fileOutputStream.write(newline);
                fileOutputStream.close();
            }
        }
